package com.awb.dto;

import java.math.BigDecimal;

public class Operation {
	private BigDecimal autorisation;
	private BigDecimal blocage;
	private BigDecimal depassement;
	private String destinataire;
	private String emetteur;
	private Integer idOpe;
	private String libelle;
	private BigDecimal montant;
	private BigDecimal montantViser;
	private BigDecimal provision;
	private BigDecimal solde;
	
	
	public BigDecimal getAutorisation() {
		return autorisation;
	}
	public void setAutorisation(BigDecimal autorisation) {
		this.autorisation = autorisation;
	}
	public BigDecimal getBlocage() {
		return blocage;
	}
	public void setBlocage(BigDecimal blocage) {
		this.blocage = blocage;
	}
	public BigDecimal getDepassement() {
		return depassement;
	}
	public void setDepassement(BigDecimal depassement) {
		this.depassement = depassement;
	}
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	public String getEmetteur() {
		return emetteur;
	}
	public void setEmetteur(String emetteur) {
		this.emetteur = emetteur;
	}
	public Integer getIdOpe() {
		return idOpe;
	}
	public void setIdOpe(Integer idOpe) {
		this.idOpe = idOpe;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public BigDecimal getMontant() {
		return montant;
	}
	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}
	public BigDecimal getMontantViser() {
		return montantViser;
	}
	public void setMontantViser(BigDecimal montantViser) {
		this.montantViser = montantViser;
	}
	public BigDecimal getProvision() {
		return provision;
	}
	public void setProvision(BigDecimal provision) {
		this.provision = provision;
	}
	public BigDecimal getSolde() {
		return solde;
	}
	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}
	public Operation(BigDecimal autorisation, BigDecimal blocage, BigDecimal depassement, String destinataire,
			String emetteur, Integer idOpe, String libelle, BigDecimal montant, BigDecimal montantViser,
			BigDecimal provision, BigDecimal solde) {
		super();
		this.autorisation = autorisation;
		this.blocage = blocage;
		this.depassement = depassement;
		this.destinataire = destinataire;
		this.emetteur = emetteur;
		this.idOpe = idOpe;
		this.libelle = libelle;
		this.montant = montant;
		this.montantViser = montantViser;
		this.provision = provision;
		this.solde = solde;
	}

	
	
}
