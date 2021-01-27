package com.kh.tour_refactoring.controller;

import com.kh.tour.model.vo.Airline;
import com.kh.tour.model.vo.Tourist;

public class TourController {
	
	private Airline al1 = new Airline("미국행",3000,300000);
	private Airline al2 = new Airline("중국행",2000,200000);
	private Airline al3 = new Airline("일본행",1500,150000);
	
	private Tourist tt = new Tourist(1000000, 50000);
	
	public TourController() {
		
	}
	
	public boolean isAble(int num) {
		
		Airline[] aas = new Airline[3];
		//잔액 + 마일리지 한 금액으로 비행기 티켓을 살 수 있는지 없는 지 판단
		int myAll = tt.getMyMoney() + tt.getMyMile();
		//미국행을 선택했다면
		if(num == 1) {
			if(myAll < al1.getAirfare()) {
				return false;
			}
		//중국행
		}else if(num == 2) {
			if(myAll < al2.getAirfare()) {
				return false;
			}
		//일본행	
		}else {
			if(myAll < al3.getAirfare()) {
				return false;
			}
		}
		return true;
	}
	
	public void buyTicket1() {
		if(tt.getMyMoney() >= al1.getAirfare()) {
			//1. 잔액으로 티켓을 살 수 있는 경우
			//잔액 - 비행기요금
			tt.setMyMoney(tt.getMyMoney()-al1.getAirfare());
			//마일리지 + 비행기 마일리지
			tt.setMyMile(tt.getMyMile()+al1.getMileage());
		}else {
			//2. 잔액 + 마일리지로 티켓을 살 수 있는 경우
			//부족한 금액 산정 -> 비행기 요금 - 잔액
			int needMile =  al1.getAirfare() - tt.getMyMoney();
			//마일리지 - 부족한 금액
			tt.setMyMile(tt.getMyMile()-needMile);
			//마일리지 + 비행기 마일리지
			tt.setMyMile(tt.getMyMile()+al1.getMileage());
			//잔액을 전액 차감
			tt.setMyMoney(0);
		}
	}
	
	public void buyTicket2() {
		if(tt.getMyMoney() >= al2.getAirfare()) {
			//1. 잔액으로 티켓을 살 수 있는 경우
			//잔액 - 비행기요금
			tt.setMyMoney(tt.getMyMoney()-al2.getAirfare());
			//마일리지 + 비행기 마일리지
			tt.setMyMile(tt.getMyMile()+al2.getMileage());
		}else {
			//2. 잔액 + 마일리지로 티켓을 살 수 있는 경우
			//부족한 금액 산정 -> 비행기 요금 - 잔액
			int needMile =  al2.getAirfare() - tt.getMyMoney();
			//마일리지 - 부족한 금액
			tt.setMyMile(tt.getMyMile()-needMile);
			//마일리지 + 비행기 마일리지
			tt.setMyMile(tt.getMyMile()+al2.getMileage());
			//잔액을 전액 차감
			tt.setMyMoney(0);
		}
	}

	public void buyTicket3() {
		if(tt.getMyMoney() >= al3.getAirfare()) {
			//1. 잔액으로 티켓을 살 수 있는 경우
			//잔액 - 비행기요금
			tt.setMyMoney(tt.getMyMoney()-al3.getAirfare());
			//마일리지 + 비행기 마일리지
			tt.setMyMile(tt.getMyMile()+al3.getMileage());
		}else {
			//2. 잔액 + 마일리지로 티켓을 살 수 있는 경우
			//부족한 금액 산정 -> 비행기 요금 - 잔액
			int needMile =  al3.getAirfare() - tt.getMyMoney();
			//마일리지 - 부족한 금액
			tt.setMyMile(tt.getMyMile()-needMile);
			//마일리지 + 비행기 마일리지
			tt.setMyMile(tt.getMyMile()+al3.getMileage());
			//잔액을 전액 차감
			tt.setMyMoney(0);
		}
	}
	
	public int bringMyMoney() {
		return tt.getMyMoney();
	}
	
	public int bringMyMile() {
		return tt.getMyMile();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
