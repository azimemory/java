package com.kh.e_inheritance.after;

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
	public String toString() {
		return super.toString() + " SmartPhone [mobileAgency=" + mobileAgency + "]";
	}
	
	
	
	
	

}
