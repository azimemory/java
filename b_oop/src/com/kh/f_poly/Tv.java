package com.kh.f_poly;

//Product 클래스를 상속받는다.
public class Tv extends Product{
	
	//제조사, 상품명, 가격, 인치(크기)
	private int inch;

	public Tv(String brand, String pName, int price, int inch) {
		super(brand, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	/*
	 * @Override 
	 * private void info(){ 
	 * 	System.out.println("TV입니다"); 
	 * }
	 */

	@Override
	public String toString() {
		return super.toString() + "Tv [inch=" + inch + "]";
	}
	
}
