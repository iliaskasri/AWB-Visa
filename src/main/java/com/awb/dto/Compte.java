package com.awb.dto;

import java.math.BigDecimal;

public class Compte {
	private BigDecimal disponnible;
	protected Boolean etat;
	protected String identite;
	protected String intituler;
	protected Integer numero;
	protected BigDecimal solde;
	public BigDecimal getDisponnible() {
		return disponnible;
	}
	public void setDisponnible(BigDecimal disponnible) {
		this.disponnible = disponnible;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public String getIdentite() {
		return identite;
	}
	public void setIdentite(String identite) {
		this.identite = identite;
	}
	public String getIntituler() {
		return intituler;
	}
	public void setIntituler(String intituler) {
		this.intituler = intituler;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public BigDecimal getSolde() {
		return solde;
	}
	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}
	public Compte(BigDecimal disponnible, Boolean etat, String identite, String intituler, Integer numero,
			BigDecimal solde) {
		super();
		this.disponnible = disponnible;
		this.etat = etat;
		this.identite = identite;
		this.intituler = intituler;
		this.numero = numero;
		this.solde = solde;
	}

	
}
