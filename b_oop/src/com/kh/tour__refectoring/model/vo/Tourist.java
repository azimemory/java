package com.kh.tour__refectoring.model.vo;

public class Tourist {
	
	private int myMoney;//보유 금액
	private int myMile;//마일리지
	
	public Tourist() {
		
	}

	public Tourist(int myMoney, int myMile) {
		super();
		this.myMoney = myMoney;
		this.myMile = myMile;
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getMyMile() {
		return myMile;
	}

	public void setMyMile(int myMile) {
		this.myMile = myMile;
	}
}
