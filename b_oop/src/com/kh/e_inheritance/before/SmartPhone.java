package com.kh.e_inheritance.before;

public class SmartPhone {
	
	//제조사, 상품명, 가격, cpu, ram, 통신사
	private String brand; //제조사
	private String pName; //상품명
	private int price; //가격
	
	private String cpu; //cpu
	private int ram; //ram
	private String mobileAgency; //통신사
	
	public SmartPhone() {
		
	}

	public SmartPhone(String brand, String pName, int price, String cpu, int ram, String mobileAgency) {
		super();
		this.brand = brand;
		this.pName = pName;
		this.price = price;
		this.cpu = cpu;
		this.ram = ram;
		this.mobileAgency = mobileAgency;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return "SmartPhone [brand=" + brand + ", pName=" + pName + ", price=" + price + ", cpu=" + cpu + ", ram=" + ram
				+ ", mobileAgency=" + mobileAgency + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
