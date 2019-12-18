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
	 @ManyToOne
	 @JoinColumn(name = "user_id")
	 private User user;
	
	
	public Stats() {
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
