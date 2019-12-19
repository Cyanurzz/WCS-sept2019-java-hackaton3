package com.wildcodeschool.hackaton3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String picture;
	private int xp;
	private int lvl;
	private Double tCar;
	private Double tBus;
	private Double tTram;
	private Double tBicycle;
	private Double tFoot;
	 
	public User() {
	}
	
	public User(Long id, String name, String picture, int xp, int lvl, Double tCar, Double tBus, Double tTram, Double tBicycle, Double tFoot) {
		super();
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.xp = xp;
		this.lvl = lvl;
		this.tCar = tCar;
		this.tBus = tBus;
		this.tTram = tTram;
		this.tBicycle = tBicycle;
		this.tFoot = tFoot;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double gettCar() {
		return tCar;
	}

	public void settCar(Double tCar) {
		this.tCar = tCar;
	}

	public Double gettBus() {
		return tBus;
	}

	public void settBus(Double tBus) {
		this.tBus = tBus;
	}

	public Double gettTram() {
		return tTram;
	}

	public void settTram(Double tTram) {
		this.tTram = tTram;
	}

	public Double gettBicycle() {
		return tBicycle;
	}

	public void settBicycle(Double tBicycle) {
		this.tBicycle = tBicycle;
	}

	public Double gettFoot() {
		return tFoot;
	}

	public void settFoot(Double tFoot) {
		this.tFoot = tFoot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	
	
}
