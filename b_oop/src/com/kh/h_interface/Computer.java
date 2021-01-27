package com.kh.h_interface;

public class Computer extends Product{
	
	private String cpu;
	private int ram;
	//컴퓨터 전원이 켜져있는 지 여부
	protected boolean isOn;
	
	public Computer(String brand, String pName, int price, String cpu, int ram) {
		super(brand, pName, price);
		this.cpu = cpu;
		this.ram = ram;
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
	
	public void powerOn() {
		System.out.println("컴퓨터 전원을 킵니다.");
		isOn = true;
	}
	
	public void powerOff() {
		System.out.println("컴퓨터 전원을 끕니다.");
		isOn = false;
	}
	
	public void powerSaving() {
		if(isOn) {
			System.out.println("절전모드에 들어갑니다.");
		}
	}

	//toString  메서드 오버라이드
	//오버라이드 : 자식클래스가 상속받은 부모 클래스의 메서드를 재정의 하는 것.
	//오버라이드 성립 조건 
	// - 메서드명 동일
	// - 매개변수의 개수, 타입 동일
	// - 반환형 동일
	// - 접근제어자는 부모클래스의 메서드 보다 넓은 범위로 변경이 가능하다.
	//	 protected -> public 가능
	//   public -> protected 불가능
	
	@Override
	public String toString() {
		return super.toString() + " Computer [cpu=" + cpu + ", ram=" + ram + "]";
	}
}
