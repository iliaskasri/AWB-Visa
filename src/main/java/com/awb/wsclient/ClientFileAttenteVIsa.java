package com.awb.wsclient;

//import java.io.IOException;
//import java.net.Authenticator;
//import java.net.InetSocketAddress;
//import java.net.PasswordAuthentication;
//import java.net.Proxy;
//import java.net.ProxySelector;
//import java.net.SocketAddress;
//import java.net.SocketTimeoutException;
//import java.net.URI;
//import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;

import org.springframework.stereotype.Component;

//import com.awb.dto.Operation;

//import org.mtc.AnnulationRequest; 
//import org.mtc.AnnulationResponse; 
//import org.mtc.FileAttenteVisaService; 
//import org.mtc.FileAttenteVisaServiceService; 
//import org.mtc.ConfirmRequest; 
//import org.mtc.ConfirmResponse; 
//import org.mtc.CreanceRequest; 
//import org.mtc.CreanceResponse; 
//import org.mtc.CreancierRequest; 
//import org.mtc.CreancierResponse; 
//import org.mtc.FormsRequest; 
//import org.mtc.FormsResponse; 
//import org.mtc.ImpayesRequest; 
//import org.mtc.ImpayesResponseDetail; 

@Component
public class ClientFileAttenteVIsa {

	// DEV
	private static final String REQUEST_TIMEOUT_CAHINE = "com.sun.xml.internal.ws.request.timeout";
	private static final String CONNECTION_TIMEOUT_CAHINE = "com.sun.xml.internal.ws.connect.timeout";

	private String url;
	private String timeOut;

	public List<FaBean> recupererListeOperationsVisa(String codeAgence,String codeUtilisateur,String natureOperation,int numPage,int sizePage,String wsSignature ){
		FileAttenteVisaService service = getSevice();
		
		ListeOperationsEnAttenteVisaRequest req = new  ListeOperationsEnAttenteVisaRequest();
		req.setCodeAgence(codeAgence);
		req.setCodeUtilisateur(codeUtilisateur);
		req.setNatureOperation(natureOperation);
		req.setNumPage(numPage);
		req.setSizePage(sizePage);
		req.setWsSignature(wsSignature);
		ListeOperationsEnAttenteVisaResponse response = service.getListeOperationsEnAttenteVisa(req);
		if(response!=null){
			if(response.getListOfFAs()!=null){
				return response.getListOfFAs().getItems();
			}
		}else{
			throw new RuntimeException("response null");
		}
		
		return null;
	}
	
	
	private FileAttenteVisaService getSevice()  {
		// Parametres PROXY

		FileAttenteVisaService_Service service = new FileAttenteVisaService_Service();
		FileAttenteVisaService FileAttenteVisaService = service.getFileAttenteVisaServiceImplPort();

		BindingProvider bindingProvider = (BindingProvider) FileAttenteVisaService;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/AWB-VISA/FileAttenteVisaService");

		bindingProvider.getRequestContext().put(REQUEST_TIMEOUT_CAHINE, 60000);
		bindingProvider.getRequestContext().put(CONNECTION_TIMEOUT_CAHINE, 60000);

		return FileAttenteVisaService;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

}
