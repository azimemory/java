package com.kh.z3_coffeemanager_decoration;

public class Account {
	
	private int balance; //잔고
	private int salesVolume; //매출
	private int expences; //지출
	
	//매출 등록 : 잔고 += 판매금액
	//			  매출 += 판매금액	
	
	//지출 등록 : 잔고 -= 매입금액
	//			  지출 += 매입금액
	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public int getSalesVolume() {
		return salesVolume;
	}

	public int getExpences() {
		return expences;
	}
	
	//매출 등록 메서드
	//매개변수로 판매금액을 받아서 매출과 잔고에 반영하고, 잔고를 반환
	public int registerSale(int payPrice) {
		//매출 등록 : 잔고 += 판매금액
		//			  매출 += 판매금액	
		balance += payPrice;
		salesVolume += payPrice;
		return balance; //잔고 반환
	}
	
	public boolean isExpendable(int expencesPrice) {
		return balance > expencesPrice;
	}
	
	//지출 등록 메서드
	//매개변수로 매입금액을 받아서 지출과 잔고에 반영하고, 성공실패 여부를 반환
	public void registerExpences(int expencesPrice) {
			balance -= expencesPrice;   //지출 등록 : 잔고 -= 매입금액
			expences += expencesPrice; //			  지출 += 매입금액
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
