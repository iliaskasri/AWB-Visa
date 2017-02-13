package com.awb.wsserver;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.awb.dto.Compte;
import com.awb.dto.Devise;
import com.awb.dto.Operation;
import com.awb.dto.OperationVisa;
import com.awb.dto.Utilisateur;


@WebService(serviceName="fileAttenteVisa" ,portName="FileAttenteVisaService",endpointInterface="com.awb.wsclient.FileAttenteVisaService")
public class OperationEnAttenteVisaController {

	@WebMethod
	public List<OperationVisa> getListeOperations() {
		BigDecimal bd1 = new BigDecimal(56989821);
		BigDecimal bd2 = new BigDecimal(4556);
		BigDecimal bd3 = new BigDecimal(9821);
		BigDecimal bd4 = new BigDecimal(9821);
		BigDecimal bd5 = new BigDecimal(5698);
		Date d2 = new Date(2015, 05, 12);
		Long l = new Long(555);
		Devise dev = new Devise("test", "5556666");
		Utilisateur u1 = new Utilisateur("kasri", "ilias", "0666555555");
		Utilisateur u2 = new Utilisateur("Ouakkour", "hamza", "066654444");
		Utilisateur u3 = new Utilisateur("Chamlal", "Med", "06456699985");
		Utilisateur u5 = new Utilisateur("Ben", "Aziz", "0656998765");
		Integer i = new Integer(455555);
		Compte c1 = new Compte(bd4, true, "ddddd", "dddsssssss", i, bd2);
		// Compte c2=new Compte(12256, "test", "Ouakour Hamza", bd1,bd1, true);
		Operation ope = new Operation(bd4, bd5, bd4, "ddddd", "ddddd", i, "dddd", bd1, bd2, bd3, bd4);
		
		
		OperationVisa OpeVisa = new OperationVisa(l, d2, "ssss", true, true, i, i, "ddd", bd2, bd4, "dddd", "dddd", i, "ddd", "dfdd", d2, i, "ddd", ope, dev, u5, u2, u3, u5, "dddd", c1, u1, bd5, "dddd",l);
				
		List<OperationVisa> list = new ArrayList<>();
		list.add(OpeVisa);
		return list;
	}

	@WebMethod
	public String ViserOperation(Integer solde) {
		if (solde < 1000) {
			return "Visa Operation NOK";
		} else {
			return "Visa Operation OK";
		}
	}
	
	@WebMethod
	public String rejeterOperation(Integer solde) {
		if (solde < 1000) {
			return "Rejet Operation NOK";
		} else {
			return "Rejet Operation OK";
		}
	}
}
