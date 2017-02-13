package com.awb.dto;

public class Utilisateur {
	private String codeAgence;
	private String codeUtilisateur;

	public String getCodeAgence() {
		return codeAgence;
	}

	public Utilisateur() {

	}

	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}

	public String getCodeUtilisateur() {
		return codeUtilisateur;
	}

	public void setCodeUtilisateur(String codeUtilisateur) {
		this.codeUtilisateur = codeUtilisateur;
	}

	private String nom;
	private String prenom;
	private String tel;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Utilisateur(String nom, String prenom, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
	}

}
