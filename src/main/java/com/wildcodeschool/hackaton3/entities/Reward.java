package com.wildcodeschool.hackaton3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reward {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titre;
	private String montant;
	private String code;


	public Reward() {
		
	};
	
	
	public Reward(String titre, String montant, String code) {
		super();
		this.titre = titre;
		this.montant = montant;
		this.code = code;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getMontant() {
		return montant;
	}


	public void setMontant(String montant) {
		this.montant = montant;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}

}
