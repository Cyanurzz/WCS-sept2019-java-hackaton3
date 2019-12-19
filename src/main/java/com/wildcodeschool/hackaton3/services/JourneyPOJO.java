package com.wildcodeschool.hackaton3.services;

import java.util.ArrayList;

public class JourneyPOJO {
	
	private int walkDistance;
	private String tarifCentimes;
	private Double co2Emissions;
	private ArrayList<Coordinates> coordinates = new ArrayList<Coordinates>();
	
	public JourneyPOJO() {
		
	}

	public int getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(int walkDistance) {
		this.walkDistance = walkDistance;
	}

	public String getTarifCentimes() {
		return tarifCentimes;
	}

	public void setTarifCentimes(String tarifCentimes) {
		this.tarifCentimes = tarifCentimes;
	}

	public Double getCo2Emissions() {
		return co2Emissions;
	}

	public void setCo2Emissions(Double co2Emissions) {
		this.co2Emissions = co2Emissions;
	}

	public ArrayList<Coordinates> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(ArrayList<Coordinates> coordinates) {
		this.coordinates = coordinates;
	}
	
	
	
	
}
