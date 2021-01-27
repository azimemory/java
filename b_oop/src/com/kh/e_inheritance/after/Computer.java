package com.kh.e_inheritance.after;

public class Computer extends Product{
	
	private String cpu;
	private int ram;
	
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
