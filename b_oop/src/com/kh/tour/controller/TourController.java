package com.kh.tour.controller;

import com.kh.tour.model.vo.Airline;
import com.kh.tour.model.vo.Tourist;

public class TourController {
	
	private Airline[] airs = {
			 new Airline("미국행",3000,300000)
			,new Airline("중국행",2000,200000)
			,new Airline("일본행",1500,150000)
	};
	
	private Tourist tourlist = new Tourist(1000000, 1000);
	
	public TourController() {
		
	}
	
	public boolean isAble(int num) {
		
		int idx = num - 1;
		//잔액 + 마일리지 한 금액으로 비행기 티켓을 살 수 있는지 없는 지 판단
		int myAll = tourlist.getMyMoney() + tourlist.getMyMile();
		//미국행을 선택했다면
		if(num == 1) {
			if(myAll < airs[idx].getAirfare()) {
				return false;
			}
		}
		return true;
	}
	
	public void buyTicket(int num) {
		
		int idx = num - 1;
		if(tourlist.getMyMoney() >= airs[idx].getAirfare()) {
			//1. 잔액으로 티켓을 살 수 있는 경우
			//잔액 - 비행기요금
			tourlist.setMyMoney(tourlist.getMyMoney()-airs[idx].getAirfare());
			//마일리지 + 비행기 마일리지
			tourlist.setMyMile(tourlist.getMyMile()+airs[idx].getMileage());
		}else {
			//2. 잔액 + 마일리지로 티켓을 살 수 있는 경우
			//부족한 금액 산정 -> 비행기 요금 - 잔액
			int needMile =  airs[idx].getAirfare() - tourlist.getMyMoney();
			//마일리지 - 부족한 금액
			tourlist.setMyMile(tourlist.getMyMile()-needMile);
			//마일리지 + 비행기 마일리지
			tourlist.setMyMile(tourlist.getMyMile()+airs[idx].getMileage());
			//잔액을 전액 차감
			tourlist.setMyMoney(0);
		}
	}

	public int bringMyMoney() {
		return tourlist.getMyMoney();
	}
	
	public int bringMyMile() {
		return tourlist.getMyMile();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
