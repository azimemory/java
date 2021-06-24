package com.kh.z_coffeemanager.a_encapsulation;

public class Sales {

	public Sales() {
		// TODO Auto-generated constructor stub
	}
	
	//제품 판매
	//판매과정을 진행하고 결제금액을 메뉴에 반환 -> 메뉴에서는 결제금액을 출력
	public int sellProduct(Coffee coffee, Account account, int salesCnt) {
		//1. Coffee클래스의 판매등록 메서드를 호출해, 재고를 차감하고 결제금액을 반환받는다.
		int payPrice = coffee.registerSales(salesCnt, account);
		
		//2. 결제금액을 매출등록해준다.
		account.registerSale(payPrice);
		
		//3. 결제금액 반환
		return payPrice;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
