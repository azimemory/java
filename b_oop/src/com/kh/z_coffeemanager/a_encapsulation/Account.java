package com.kh.z_coffeemanager.a_encapsulation;

//잔고, 지출, 매출
public class Account {
	private int balance; //잔고
	private int salesPrice; //매출
	private int expences; //지출
	
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
	//매개변수로 넘어온 판매금액을 매출에 등록하고, 잔고를 반환
	public int registerSale(int payPrice) {
		//잔고에 판매금액 추가
		balance += payPrice;
		//매출액에 판매금액 추가
		salesPrice += payPrice;
		//잔고반환
		return balance;
	}
	
	//지출 등록 메서드
	//매개변수로 넘어온 금액이 지출 가능한 금액인지 판단해
	//가능하다면 잔고를 차감하고 true를 반환
	//불가능하다면 잔고를 차감하지 않고 false를 반환
	public boolean registerExpences(int expencesPrice) {
		if(expencesPrice < balance) {
			//잔고차감
			balance -= expencesPrice;
			//지출등록
			expences += expencesPrice;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	

}
