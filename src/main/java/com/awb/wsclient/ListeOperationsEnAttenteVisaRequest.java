
package com.awb.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listeOperationsEnAttenteVisaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listeOperationsEnAttenteVisaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeUtilisateur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natureOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sizePage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wsSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>/
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listeOperationsEnAttenteVisaRequest", propOrder = {
    "codeAgence",
    "codeUtilisateur",
    "natureOperation",
    "numPage",
    "sizePage",
    "wsSignature"
})
public class ListeOperationsEnAttenteVisaRequest {

    protected String codeAgence;
    protected String codeUtilisateur;
    protected String natureOperation;
    protected int numPage;
    protected int sizePage;
    protected String wsSignature;

    /**
     * Gets the value of the codeAgence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAgence() {
        return codeAgence;
    }

    /**
     * Sets the value of the codeAgence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAgence(String value) {
        this.codeAgence = value;
    }

    /**
     * Gets the value of the codeUtilisateur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeUtilisateur() {
        return codeUtilisateur;
    }

    /**
     * Sets the value of the codeUtilisateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeUtilisateur(String value) {
        this.codeUtilisateur = value;
    }

    /**
     * Gets the value of the natureOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureOperation() {
        return natureOperation;
    }

    /**
     * Sets the value of the natureOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureOperation(String value) {
        this.natureOperation = value;
    }

    /**
     * Gets the value of the numPage property.
     * 
     */
    public int getNumPage() {
        return numPage;
    }

    /**
     * Sets the value of the numPage property.
     * 
     */
    public void setNumPage(int value) {
        this.numPage = value;
    }

    /**
     * Gets the value of the sizePage property.
     * 
     */
    public int getSizePage() {
        return sizePage;
    }

    /**
     * Sets the value of the sizePage property.
     * 
     */
    public void setSizePage(int value) {
        this.sizePage = value;
    }

    /**
     * Gets the value of the wsSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsSignature() {
        return wsSignature;
    }

    /**
     * Sets the value of the wsSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsSignature(String value) {
        this.wsSignature = value;
    }

}
