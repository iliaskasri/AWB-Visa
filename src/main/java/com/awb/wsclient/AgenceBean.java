
package com.awb.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agenceBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agenceBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agenceBean", propOrder = {
    "codeAgence",
    "nomAgence"
})
public class AgenceBean {

    protected String codeAgence;
    protected String nomAgence;

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
     * Gets the value of the nomAgence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomAgence() {
        return nomAgence;
    }

    /**
     * Sets the value of the nomAgence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomAgence(String value) {
        this.nomAgence = value;
    }

}
