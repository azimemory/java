package com.kh.tour.model.vo;

public class Tourist {
	
	private int myMoney;
	private int myMile;
	
	public Tourist() {
		// TODO Auto-generated constructor stub
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
