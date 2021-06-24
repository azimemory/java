package com.kh.z3_coffeemanager_decoration;

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

	public int refundProduct(Coffee refundCoffee, Account account, int refundCnt) {
		// 1. Coffee클래스의 환불등록 메서드를 호출해, 재고를 추가하고 환불금액을 반환받는다.
		int refundPrice = refundCoffee.registerRefund(refundCnt,account);
		
		// 2. 환불금액을 지출등록해준다.
		if(account.isExpendable(refundPrice)) {
			account.registerExpences(refundPrice);
		}
		
		// 3. 환불금액 반환
		return refundPrice;
	}
	
	
	
	
	
	
	
	
	
	
	

}
