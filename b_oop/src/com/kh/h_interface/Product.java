package com.kh.h_interface;

// 모든 상품에 대해 공통적인 요소들을 추출해 부모클래스를 생성
public class Product {
	
	private String brand;
	private String pName;
	private int price;
	
	//다른 생성자가 없을 경우 기본 생성자를 생략하면 JVM이 자동으로 기본생성자를 만든다.
	//매개변수가 있는 생성자가 있기 때문에 기본생성자가 생성되지 않는다.
	//Product클래스를 생성할때 반드시 brand, pName, price에 값을 넣도록 강제할 수 있다.
	public Product(String brand, String pName, int price) {
		super();
		this.brand = brand;
		this.pName = pName;
		this.price = price;
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
	
	private void info(){
		System.out.println("상품입니다");
	}
	
	@Override
	public String toString() {
		return "Product [brand=" + brand + ", pName=" + pName + ", price=" + price + "]";
	}

}
