package com.kh.f_poly;

public class Desktop extends Computer{
	//제조사, 상품명, 가격, cpu, ram, 일체여부
	private boolean allInOne;//일체여부

	public Desktop(String brand, String pName, int price
					, String cpu, int ram, boolean allInOne) {
		super(brand, pName, price, cpu, ram);
		this.allInOne = allInOne;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the allInOne
	 */
	public boolean isAllInOne() {
		return allInOne;
	}

	/**
	 * @param allInOne the allInOne to set
	 */
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String toString() {
		return super.toString() +  " Desktop [allInOne=" + allInOne + "]";
	}
	
}
