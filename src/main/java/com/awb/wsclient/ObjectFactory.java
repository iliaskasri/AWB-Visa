
package com.awb.wsclient;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fileAttenteVisa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fileAttenteVisa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListeOperationsEnAttenteVisaResponse }
     * 
     */
    public ListeOperationsEnAttenteVisaResponse createListeOperationsEnAttenteVisaResponse() {
        return new ListeOperationsEnAttenteVisaResponse();
    }

    /**
     * Create an instance of {@link SecurityRequest }
     * 
     */
    public SecurityRequest createSecurityRequest() {
        return new SecurityRequest();
    }

    /**
     * Create an instance of {@link ListeOperationsEnAttenteVisaRequest }
     * 
     */
    public ListeOperationsEnAttenteVisaRequest createListeOperationsEnAttenteVisaRequest() {
        return new ListeOperationsEnAttenteVisaRequest();
    }

    /**
     * Create an instance of {@link ListOfHabilitations }
     * 
     */
    public ListOfHabilitations createListOfHabilitations() {
        return new ListOfHabilitations();
    }

    /**
     * Create an instance of {@link ListOfAgences }
     * 
     */
    public ListOfAgences createListOfAgences() {
        return new ListOfAgences();
    }

    /**
     * Create an instance of {@link FaBean }
     * 
     */
    public FaBean createFaBean() {
        return new FaBean();
    }

    /**
     * Create an instance of {@link AgenceBean }
     * 
     */
    public AgenceBean createAgenceBean() {
        return new AgenceBean();
    }

    /**
     * Create an instance of {@link SecurityResponse }
     * 
     */
    public SecurityResponse createSecurityResponse() {
        return new SecurityResponse();
    }

    /**
     * Create an instance of {@link HabilitationBean }
     * 
     */
    public HabilitationBean createHabilitationBean() {
        return new HabilitationBean();
    }

    /**
     * Create an instance of {@link ListOfFAs }
     * 
     */
    public ListOfFAs createListOfFAs() {
        return new ListOfFAs();
    }

}
