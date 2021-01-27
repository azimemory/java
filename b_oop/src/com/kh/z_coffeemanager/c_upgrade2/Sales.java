package com.kh.z_coffeemanager.c_upgrade2;

public class Sales {
	
	private Account account;
	
	public Sales() {}
	
	public Sales(Account account) {
		this.account = account;
	}
	
	//제품 판매
	//판매를 마치고 결제금액을 반환한다.
	//판매한 상품과 판매한 개수를 매개변수로 전달 받는다.
	public int sellProduct(Coffee coffee, int salesCnt) {
		//1. 판매 등록
		// 커피객체에게 판매를 등록하고 결제금액을 반환받는다.
		int payPrice = coffee.registerSales(salesCnt);
		
		//2. 매출 등록
		account.registerSale(payPrice);
		
		//3. 결제금액 반환
		return payPrice;
	}
	
	//환불할 커피와 수량을 전달받아 환불등록을 하고 환불금액을 반환
	public int refundProduct(Coffee coffee, int refundCnt) {
		int refundPrice = coffee.registerRefund(refundCnt);
		return refundPrice;
	}
	
	//반품할 커피의 수량을 전달받아 반품등록하고 및 매출등록을 진행하고 반품금액을 반환
	public int returnProduct(Coffee coffee, int returnCnt) {
		//반품등록하고 반품금액을 returnPrice에 저장
		int returnPrice = coffee.registerReturn(returnCnt);
		//returnPrice를 매출로 등록해 잔고에 반품금액을 추가
		account.registerSale(returnPrice);
		//반품금액 반환
		return returnPrice;
	}
	
	
	
	
	
	
	
	
	
	
	

}
