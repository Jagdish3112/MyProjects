package com.second.models;

import java.util.Date;

public class Coin {

	private int id;
	private String country;
	private String denomination;
	private int yearofminting;
	private double currentValue;
	private Date acquiredDate;
	
	public Coin() {
		
	}

	public Coin(int id, String country, String denomination, int yearofminting, double currentValue,
			Date acquiredDate) {
		super();
		this.id = id;
		this.country = country;
		this.denomination = denomination;
		this.yearofminting = yearofminting;
		this.currentValue = currentValue;
		this.acquiredDate = acquiredDate;
	}
	
	public Coin(String country, String denomination, int yearofminting, double currentValue,
			Date acquiredDate) {
		super();
		this.country = country;
		this.denomination = denomination;
		this.yearofminting = yearofminting;
		this.currentValue = currentValue;
		this.acquiredDate = acquiredDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public int getYearofminting() {
		return yearofminting;
	}

	public void setYearofminting(int yearofminting) {
		this.yearofminting = yearofminting;
	}

	public double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}

	public Date getAcquiredDate() {
		return acquiredDate;
	}

	public void setAcquiredDate(Date acquiredDate) {
		this.acquiredDate = acquiredDate;
	}

	@Override
	public String toString() {
		return "Coin [id=" + id + ", country=" + country + ", denomination=" + denomination + ", yearofminting="
				+ yearofminting + ", currentValue=" + currentValue + ", acquiredDate=" + acquiredDate + "]";
	}
	
	
}
