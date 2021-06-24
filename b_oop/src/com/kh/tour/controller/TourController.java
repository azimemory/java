package com.kh.tour.controller;

import com.kh.tour.model.vo.Airline;
import com.kh.tour.model.vo.Tourist;

public class TourController {

	private Airline al1 = new Airline("미국행", 3000, 300000);
	private Airline al2 = new Airline("중국행", 2000, 200000);
	private Airline al3 = new Airline("일본행", 1500, 150000);

	private Tourist tt = new Tourist(1000000, 1000);

	public TourController() {
		// TODO Auto-generated constructor stub
	}

	public boolean isAble(int num) {

		switch (num) {
		case 1:
			if(tt.getMyMoney() >= al1.getAirfare()) {
				return true;
			}
			break;
		case 2:
			if(tt.getMyMoney() >= al2.getAirfare()) {
				return true;
			}
			break;
		case 3:
			if(tt.getMyMoney() >= al3.getAirfare()) {
				return true;
			}
			break;
		}

		return false;
	}

	public void buyTicket1() {
		tt.setMyMoney(tt.getMyMoney() - al1.getAirfare());
		tt.setMyMile(tt.getMyMile() + al1.getMileage());
	}

	public void buyTicket2() {
		tt.setMyMoney(tt.getMyMoney() - al2.getAirfare());
		tt.setMyMile(tt.getMyMile() + al2.getMileage());
	}	

	public void buyTicket3() {
		tt.setMyMoney(tt.getMyMoney() - al3.getAirfare());
		tt.setMyMile(tt.getMyMile() + al3.getMileage());
	}

	public int bringMyMoney() {
		return tt.getMyMoney();
	}

	public int bringMyMile() {
		return tt.getMyMile();
	}

}
