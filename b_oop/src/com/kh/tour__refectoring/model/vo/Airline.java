package com.kh.tour__refectoring.model.vo;

public class Airline {
	
	private String country; //나라
	private int mileage; //마일리지
	private int airfare; //항공가격
	
	public Airline() {
		
	}

	public Airline(String country, int mileage, int airfare) {
		super();
		this.country = country;
		this.mileage = mileage;
		this.airfare = airfare;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getAirfare() {
		return airfare;
	}

	public void setAirfare(int airfare) {
		this.airfare = airfare;
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
}
