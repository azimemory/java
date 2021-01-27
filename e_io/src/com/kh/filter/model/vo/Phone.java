package com.kh.filter.model.vo;

import java.io.Serializable;

//직렬화 : 객체를 byte로 쪼개어 Stream을 통해 전송할 수 있게끔 변경
//		byte로 쪼개진 정보를 객체로 재 구성하는 것을 역직렬화라고 한다.
// Serializable : 직렬화 가능한
public class Phone implements Serializable{
	
	//클래스 버전 관리용 아이디
	//클래스별로 시리얼버전ID가 겹치지 않는 것이 좋다.
	private static final long serialVersionUID = 6990950943986013278L;
	
	private String brand;
	private int price;
	
	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
}
