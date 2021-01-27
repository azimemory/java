package com.kh.f_poly;

public class SmartPhone extends Computer{
	
	//제조사, 상품명, 가격, cpu, ram, 통신사
	private String mobileAgency; //통신사

	public SmartPhone(String brand, String pName
			, int price, String cpu, int ram, String mobileAgency) {
		super(brand, pName, price, cpu, ram);
		this.mobileAgency = mobileAgency;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the mobileAgency
	 */
	public String getMobileAgency() {
		return mobileAgency;
	}

	/**
	 * @param mobileAgency the mobileAgency to set
	 */
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	@Override
	public void powerOn() {
		System.out.println("휴대폰 전원을 켭니다.");
		isOn = true;
	}
	
	@Override
	public void powerOff() {
		System.out.println("휴대폰 전원을 끕니다.");
		isOn = false;
	}

	@Override
	public String toString() {
		return super.toString() + " SmartPhone [mobileAgency=" + mobileAgency + "]";
	}
	
	
	
	
	

}
