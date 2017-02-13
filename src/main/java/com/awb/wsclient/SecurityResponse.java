
package com.awb.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for securityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="securityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agence" type="{http://ws.server.aida.awb/}agenceBean" minOccurs="0"/>
 *         &lt;element name="codeUtilisateur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listOfAgences" type="{http://ws.server.aida.awb/}listOfAgences" minOccurs="0"/>
 *         &lt;element name="listOfHabilitations" type="{http://ws.server.aida.awb/}listOfHabilitations" minOccurs="0"/>
 *         &lt;element name="nomUtilisateur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profilUtilisateur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityResponse", propOrder = {
    "agence",
    "codeUtilisateur",
    "errorCode",
    "errorMessage",
    "listOfAgences",
    "listOfHabilitations",
    "nomUtilisateur",
    "profilUtilisateur"
})
public class SecurityResponse {

    protected AgenceBean agence;
    protected String codeUtilisateur;
    protected String errorCode;
    protected String errorMessage;
    protected ListOfAgences listOfAgences;
    protected ListOfHabilitations listOfHabilitations;
    protected String nomUtilisateur;
    protected String profilUtilisateur;

    /**
     * Gets the value of the agence property.
     * 
     * @return
     *     possible object is
     *     {@link AgenceBean }
     *     
     */
    public AgenceBean getAgence() {
        return agence;
    }

    /**
     * Sets the value of the agence property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgenceBean }
     *     
     */
    public void setAgence(AgenceBean value) {
        this.agence = value;
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
     * Gets the value of the listOfAgences property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAgences }
     *     
     */
    public ListOfAgences getListOfAgences() {
        return listOfAgences;
    }

    /**
     * Sets the value of the listOfAgences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAgences }
     *     
     */
    public void setListOfAgences(ListOfAgences value) {
        this.listOfAgences = value;
    }

    /**
     * Gets the value of the listOfHabilitations property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfHabilitations }
     *     
     */
    public ListOfHabilitations getListOfHabilitations() {
        return listOfHabilitations;
    }

    /**
     * Sets the value of the listOfHabilitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfHabilitations }
     *     
     */
    public void setListOfHabilitations(ListOfHabilitations value) {
        this.listOfHabilitations = value;
    }

    /**
     * Gets the value of the nomUtilisateur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    /**
     * Sets the value of the nomUtilisateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomUtilisateur(String value) {
        this.nomUtilisateur = value;
    }

    /**
     * Gets the value of the profilUtilisateur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilUtilisateur() {
        return profilUtilisateur;
    }

    /**
     * Sets the value of the profilUtilisateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilUtilisateur(String value) {
        this.profilUtilisateur = value;
    }

}
