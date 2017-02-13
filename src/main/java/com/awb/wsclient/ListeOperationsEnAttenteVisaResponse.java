
package com.awb.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listeOperationsEnAttenteVisaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listeOperationsEnAttenteVisaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listOfFAs" type="{http://ws.server.aida.awb/}listOfFAs" minOccurs="0"/>
 *         &lt;element name="nbrTotalFAs" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="referenceOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listeOperationsEnAttenteVisaResponse", propOrder = {
    "errorCode",
    "errorMessage",
    "listOfFAs",
    "nbrTotalFAs",
    "referenceOperation"
})
public class ListeOperationsEnAttenteVisaResponse {

    protected String errorCode;
    protected String errorMessage;
    protected ListOfFAs listOfFAs;
    protected long nbrTotalFAs;
    protected String referenceOperation;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the listOfFAs property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfFAs }
     *     
     */
    public ListOfFAs getListOfFAs() {
        return listOfFAs;
    }

    /**
     * Sets the value of the listOfFAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfFAs }
     *     
     */
    public void setListOfFAs(ListOfFAs value) {
        this.listOfFAs = value;
    }

    /**
     * Gets the value of the nbrTotalFAs property.
     * 
     */
    public long getNbrTotalFAs() {
        return nbrTotalFAs;
    }

    /**
     * Sets the value of the nbrTotalFAs property.
     * 
     */
    public void setNbrTotalFAs(long value) {
        this.nbrTotalFAs = value;
    }

    /**
     * Gets the value of the referenceOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceOperation() {
        return referenceOperation;
    }

    /**
     * Sets the value of the referenceOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceOperation(String value) {
        this.referenceOperation = value;
    }

}
