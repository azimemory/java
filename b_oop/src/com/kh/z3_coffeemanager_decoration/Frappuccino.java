package com.kh.z3_coffeemanager_decoration;

import java.util.Calendar;

public class Frappuccino extends Coffee {

	public Frappuccino(String name, int price, int cost, int stock, int safetyStock) {
		super(name, price, cost, stock, safetyStock);
		// TODO Auto-generated constructor stub
	}

	//외부로 부터 커피판매등록 메세지를 전달받을 메서드
	//판매를 등록하고 결제금액을 반환
	public int registerSales(int salesCnt, Account account) {
		
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH)+1;
		
		if(month < 6 || month > 9) {
			System.out.println(" * 해당 음료는 계절상품입니다. 6~10월 사이에만 구매가 가능합니다.");
			return 0;
		}
		
		int payPrice = price * deductStock(salesCnt, account);
		//결재금액이 0원이면 결재에 실패한 상황
		if (payPrice == 0) {
			return 0;
		}

		totalSaleCnt += salesCnt; //누적판매량 추가

		if (stock < safetyStock) { //재고 차감 이후 재고가 안전재고보다 적다면 안전재고 확보
			addSafetyStock(account);
		}

		return payPrice;
	}

}
