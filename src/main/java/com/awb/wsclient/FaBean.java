
package com.awb.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for faBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeEmetteur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depassement" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="disponible" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="identifiantOperation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="libelleOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montantAutorisations" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="montantBlocages" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="montantOperation" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="montantVise" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nomEmetteur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faBean", propOrder = {
    "codeEmetteur",
    "dateOperation",
    "depassement",
    "disponible",
    "identifiantOperation",
    "libelleOperation",
    "montantAutorisations",
    "montantBlocages",
    "montantOperation",
    "montantVise",
    "nomEmetteur",
    "numeroCompte",
    "solde"
})
public class FaBean {

    protected String codeEmetteur;
    protected String dateOperation;
    protected long depassement;
    protected long disponible;
    protected int identifiantOperation;
    protected String libelleOperation;
    protected long montantAutorisations;
    protected long montantBlocages;
    protected long montantOperation;
    protected long montantVise;
    protected String nomEmetteur;
    protected String numeroCompte;
    protected long solde;

    /**
     * Gets the value of the codeEmetteur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeEmetteur() {
        return codeEmetteur;
    }

    /**
     * Sets the value of the codeEmetteur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeEmetteur(String value) {
        this.codeEmetteur = value;
    }

    /**
     * Gets the value of the dateOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOperation() {
        return dateOperation;
    }

    /**
     * Sets the value of the dateOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOperation(String value) {
        this.dateOperation = value;
    }

    /**
     * Gets the value of the depassement property.
     * 
     */
    public long getDepassement() {
        return depassement;
    }

    /**
     * Sets the value of the depassement property.
     * 
     */
    public void setDepassement(long value) {
        this.depassement = value;
    }

    /**
     * Gets the value of the disponible property.
     * 
     */
    public long getDisponible() {
        return disponible;
    }

    /**
     * Sets the value of the disponible property.
     * 
     */
    public void setDisponible(long value) {
        this.disponible = value;
    }

    /**
     * Gets the value of the identifiantOperation property.
     * 
     */
    public int getIdentifiantOperation() {
        return identifiantOperation;
    }

    /**
     * Sets the value of the identifiantOperation property.
     * 
     */
    public void setIdentifiantOperation(int value) {
        this.identifiantOperation = value;
    }

    /**
     * Gets the value of the libelleOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleOperation() {
        return libelleOperation;
    }

    /**
     * Sets the value of the libelleOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleOperation(String value) {
        this.libelleOperation = value;
    }

    /**
     * Gets the value of the montantAutorisations property.
     * 
     */
    public long getMontantAutorisations() {
        return montantAutorisations;
    }

    /**
     * Sets the value of the montantAutorisations property.
     * 
     */
    public void setMontantAutorisations(long value) {
        this.montantAutorisations = value;
    }

    /**
     * Gets the value of the montantBlocages property.
     * 
     */
    public long getMontantBlocages() {
        return montantBlocages;
    }

    /**
     * Sets the value of the montantBlocages property.
     * 
     */
    public void setMontantBlocages(long value) {
        this.montantBlocages = value;
    }

    /**
     * Gets the value of the montantOperation property.
     * 
     */
    public long getMontantOperation() {
        return montantOperation;
    }

    /**
     * Sets the value of the montantOperation property.
     * 
     */
    public void setMontantOperation(long value) {
        this.montantOperation = value;
    }

    /**
     * Gets the value of the montantVise property.
     * 
     */
    public long getMontantVise() {
        return montantVise;
    }

    /**
     * Sets the value of the montantVise property.
     * 
     */
    public void setMontantVise(long value) {
        this.montantVise = value;
    }

    /**
     * Gets the value of the nomEmetteur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomEmetteur() {
        return nomEmetteur;
    }

    /**
     * Sets the value of the nomEmetteur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomEmetteur(String value) {
        this.nomEmetteur = value;
    }

    /**
     * Gets the value of the numeroCompte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * Sets the value of the numeroCompte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCompte(String value) {
        this.numeroCompte = value;
    }

    /**
     * Gets the value of the solde property.
     * 
     */
    public long getSolde() {
        return solde;
    }

    /**
     * Sets the value of the solde property.
     * 
     */
    public void setSolde(long value) {
        this.solde = value;
    }

}
