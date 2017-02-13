
package com.awb.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for securityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="securityRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifiantAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityRequest", propOrder = {
    "codeAgence",
    "identifiantAD",
    "wsSignature"
})
public class SecurityRequest {

    protected String codeAgence;
    protected String identifiantAD;
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
     * Gets the value of the identifiantAD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifiantAD() {
        return identifiantAD;
    }

    /**
     * Sets the value of the identifiantAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifiantAD(String value) {
        this.identifiantAD = value;
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
