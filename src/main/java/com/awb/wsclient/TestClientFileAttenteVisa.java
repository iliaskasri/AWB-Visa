package com.awb.wsclient;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
//import java.security.NoSuchAlgoristhmException;
import java.security.NoSuchAlgorithmException;

import javax.xml.ws.BindingProvider;

import com.awb.wsclient.FileAttenteVisaService;
import com.awb.wsclient.FileAttenteVisaService_Service;
import com.awb.wsclient.ListeOperationsEnAttenteVisaRequest;
import com.awb.wsclient.ListeOperationsEnAttenteVisaResponse;
import com.awb.wsclient.SecurityRequest;
import com.awb.wsclient.SecurityResponse;

public class TestClientFileAttenteVisa {

    private static final String URL = "http://localhost:8080/AWB-VISA/FileAttenteVisa?WSDL";
    private static final String TIMEOUT = "240000";
    private static final String CLE = "FILE_ATTENTE_VISA_SERVICE_CLE";

    private static SecurityResponse checkAuthentification(String identifiantAD, String codeAgence, String cle) {
        FileAttenteVisaService fileAttenteVisaService = getSevice();
        try {
            SecurityRequest request = new SecurityRequest();
            request.setIdentifiantAD(identifiantAD);
            request.setCodeAgence(codeAgence);
            request.setWsSignature(genererSignature(request, cle));
            return fileAttenteVisaService.checkAuthentification(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ListeOperationsEnAttenteVisaResponse getListeOperationsEnAttenteVisa(String codeUtilisateur, String codeAgence, String cle) {
        FileAttenteVisaService fileAttenteVisaService = getSevice();
        try {
            ListeOperationsEnAttenteVisaRequest request = new ListeOperationsEnAttenteVisaRequest();
            request.setCodeUtilisateur(codeUtilisateur);
            request.setCodeAgence(codeAgence);
            request.setNatureOperation(null);
            request.setNumPage(1);
            request.setSizePage(10);
            request.setWsSignature(genererSignature(request, cle));
            return fileAttenteVisaService.getListeOperationsEnAttenteVisa(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //Calcul cle : Identifiant AD + PassWord AD + Code Agence + clé Secrete
    private static String genererSignature(SecurityRequest request, String cle) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        StringBuilder out = new StringBuilder();
        out.append(request.getIdentifiantAD());
        out.append(request.getCodeAgence() != null ? request.getCodeAgence().trim() : null);
        out.append(cle);
        return encode(out.toString());
    }

    //Calcul cle : Identifiant AD + PassWord AD + Code Agence + Nature Operation + Num Page + Size Page + Reference Operation + clé Secrete
    private static String genererSignature(ListeOperationsEnAttenteVisaRequest request, String cle) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        StringBuilder out = new StringBuilder();
        out.append(request.getCodeUtilisateur());
        out.append(request.getCodeAgence());
        out.append(request.getNatureOperation() != null ? request.getNatureOperation() : "");
        out.append(request.getNumPage());
        out.append(request.getSizePage());
        out.append(cle);
        return encode(out.toString());
    }

    public static String encode(String data) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        byte[] bytes = data.getBytes("ISO-8859-1");
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.reset();
        md.update(bytes);
        byte[] sha1hash = md.digest();
        return convertToHex(sha1hash);
    }

    private static String convertToHex(byte[] bytes) {
        final char[] HEX = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            builder.append(HEX[(0xF0 & bytes[i]) >>> 4]);
            builder.append(HEX[(0x0F & bytes[i])]);
        }
        return builder.toString();
    }

    private static FileAttenteVisaService getSevice() {
        FileAttenteVisaService_Service service = new FileAttenteVisaService_Service();
        FileAttenteVisaService fileAttenteVisaService = service.getFileAttenteVisaServiceImplPort();

        BindingProvider bindingProvider = (BindingProvider) fileAttenteVisaService;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, URL);
        bindingProvider.getRequestContext().put("com.sun.xml.ws.request.timeout", Integer.valueOf(TIMEOUT));
        bindingProvider.getRequestContext().put("com.sun.xml.ws.connect.timeout", Integer.valueOf(TIMEOUT));
        return fileAttenteVisaService;

    }

    public static void main(String[] args) {
        SecurityResponse response = checkAuthentification("m.elhaouachi", null, CLE);
        if (response != null) {
            System.out.println(response.getErrorCode() + "--" + response.getErrorMessage());
            if ("000".equals(response.getErrorCode())) {
                ListeOperationsEnAttenteVisaResponse response2 = getListeOperationsEnAttenteVisa(response.getCodeUtilisateur(), response.getAgence().getCodeAgence(), CLE);
                if (response2 != null) {
                    System.out.println(response2.getErrorCode() + "--" + response2.getErrorMessage() + "--" + response2.getNbrTotalFAs());
                }
            }
        }
    }
}
