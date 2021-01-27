package com.kh.e_inheritance.before;

public class Desktop {
	//제조사, 상품명, 가격, cpu, ram, 일체여부
	
	private String brand;//제조사
	private String pName;//상품명
	private int price;//가격
	private String cpu;//cpu
	private int ram;//ram
	private boolean allInOne;//일체여부
	
	public Desktop() {
		super(); //부모클래스의 생성자를 호출
				//작성하지 않으면 JVM이 자동으로 생성
	}

	public Desktop(String brand, String pName, int price, String cpu, int ram, boolean allInOne) {
		super();
		this.brand = brand;
		this.pName = pName;
		this.price = price;
		this.cpu = cpu;
		this.ram = ram;
		this.allInOne = allInOne;
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

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String toString() {
		return "Desktop [brand=" + brand + ", pName=" + pName + ", price=" + price + ", cpu=" + cpu + ", ram=" + ram
				+ ", allInOne=" + allInOne + "]";
	}

}
