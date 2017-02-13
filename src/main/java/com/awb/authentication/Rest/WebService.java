package com.awb.authentication.Rest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ldap.AuthenticationException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.awb.dto.Operation;
import com.awb.dto.Utilisateur;
import com.awb.wsclient.ClientFileAttenteVIsa;
import com.awb.wsclient.FaBean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.security.Principal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;

@RequestMapping(value = "/rest")
@Controller
public class WebService {

	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	ClientFileAttenteVIsa clientfileAttenteVisa;

	@RequestMapping(value = "/auth/{userName}/{password}", method = RequestMethod.GET)
	public ResponseEntity<authentification> authGet(Principal principal, @PathVariable String userName,
			@PathVariable String password, HttpServletRequest request, RedirectAttributes redirectAttr) {
		System.out.println(userName);
		System.out.println(password);
		try {
			UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userName, password);
			Authentication authenticate = authenticationManager.authenticate(token);
			SecurityContextHolder.getContext().setAuthentication(authenticate);

		} catch (AuthenticationException e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<authentification>(new authentification("001", "Unsucces auth "),
					HttpStatus.BAD_REQUEST);

		} catch (BadCredentialsException e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<authentification>(new authentification("002", "Unsucces auth "),
					HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<authentification>(new authentification("000", "Succes auth "), HttpStatus.OK);
	}

	List<Utilisateur> utilisateurs = new LinkedList<Utilisateur>();

	@RequestMapping(value = "/listOperation", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@Consumes("application/json")
	public List<Operation> listOperation(Principal principal, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String jsonData = "";
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new InputStreamReader(request.getInputStream()));
			while ((line = br.readLine()) != null) {
				jsonData += line + "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		JSONObject obj = new JSONObject(jsonData);
		String codeAgence = obj.getString("codeAgence");
		String codeUtilisateur = obj.getString("codeUtilisateur");

		List<FaBean> list = clientfileAttenteVisa.recupererListeOperationsVisa(codeAgence, codeUtilisateur, "", 0, 0,"");

		if (list != null && !list.isEmpty()) {
			List<Operation> listope = new ArrayList<>();
			for (FaBean faBean : list) {
				BigDecimal bd1 = new BigDecimal(4556);
				Operation op = new Operation(bd1, bd1, bd1, "ddd", faBean.getNomEmetteur(),
						faBean.getIdentifiantOperation(), faBean.getLibelleOperation(), bd1, bd1, bd1, bd1);
			}
			return listope;
		}

		return null;
	}

	
	
	public static class authentification {
		private String code;
		private String message;

		public authentification(String code, String message) {
			this.code = code;
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	
}
