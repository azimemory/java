package com.kh.z_coffeemanager.d_polymorphism;

public class Account {

	private int balance; //잔고
	private int salesPrice; //매출
	private int expences; // 지출
	
	public Account() {}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getExpences() {
		return expences;
	}

	public void setExpences(int expences) {
		this.expences = expences;
	}
	
	//매출 등록 메서드
	//매출 등록하고 잔고를 반환
	public int registerSale(int payPrice) {
		//잔고에 판매금액 추가
		balance += payPrice;
		//매출액에 판매금액 추가
		salesPrice  += payPrice;
		//판매금액을 추가한 잔고 반환
		return balance;
	}
	
	//지출 등록 메서드
	//지출 가능 여부를 판단해 지출을 등록하고 성공여부를 반환함
	public boolean registerExpences(int expencesPrice) {
		if(expencesPrice < balance) {
			balance -= expencesPrice;
			expences += expencesPrice;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
