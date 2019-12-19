package com.wildcodeschool.hackaton3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Stats {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String text;
	private String type;
	private String transport;
	private String multiplicateur;
	private double prix;
	private double CO2;
	private boolean times;
	 @ManyToOne
	 @JoinColumn(name = "user_id")
	 private User user;
	
	
	public Stats() {
	}
	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}


	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}



	public double getCO2() {
		return CO2;
	}



	public void setCO2(double cO2) {
		CO2 = cO2;
	}



	public boolean isTimes() {
		return times;
	}



	public void setTimes(boolean times) {
		this.times = times;
	}



	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTransport() {
		return transport;
	}


	public void setTransport(String transport) {
		this.transport = transport;
	}


	public String getMultiplicateur() {
		return multiplicateur;
	}


	public void setMultiplicateur(String multiplicateur) {
		this.multiplicateur = multiplicateur;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	
}
