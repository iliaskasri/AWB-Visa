
package com.awb.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for habilitationBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="habilitationBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeHabilitation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="libelleHabilitation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "habilitationBean", propOrder = {
    "codeHabilitation",
    "libelleHabilitation"
})
public class HabilitationBean {

    protected String codeHabilitation;
    protected String libelleHabilitation;

    /**
     * Gets the value of the codeHabilitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeHabilitation() {
        return codeHabilitation;
    }

    /**
     * Sets the value of the codeHabilitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeHabilitation(String value) {
        this.codeHabilitation = value;
    }

    /**
     * Gets the value of the libelleHabilitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleHabilitation() {
        return libelleHabilitation;
    }

    /**
     * Sets the value of the libelleHabilitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleHabilitation(String value) {
        this.libelleHabilitation = value;
    }

}
