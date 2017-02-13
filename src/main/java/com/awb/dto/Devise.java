package com.awb.dto;

public class Devise {
    private String code;
    private String nom;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Devise(String code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}
    
    
}
