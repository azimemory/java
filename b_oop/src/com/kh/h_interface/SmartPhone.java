package com.kh.h_interface;

//implements : 인터페이스 구현, 인터페이스의 필드변수와 메서드, 타입을 가져온다.
public class SmartPhone extends Computer implements BatteryDetachable, Communicatable{
	
	//제조사, 상품명, 가격, cpu, ram, 통신사
	private String mobileAgency; //통신사

	public SmartPhone(String brand, String pName
			, int price, String cpu, int ram, String mobileAgency) {
		super(brand, pName, price, cpu, ram);
		this.mobileAgency = mobileAgency;
		// TODO Auto-generated constructor stub
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

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

	@Override
	public void detacheBattery() {
		System.out.println("베터리를 분리하였습니다.");
		powerOff();
	}

	@Override
	public void attacheBattery() {
		System.out.println("베터리를 끼웠습니다.");
	}

	@Override
	public void sendMessage() {
		System.out.println("메세지를 전송하였습니다.");
	}
	
	
	
	
	

}
