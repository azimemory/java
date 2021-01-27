package com.kh.tour_refactoring.view;

import java.util.Scanner;

import com.kh.tour_refactoring.controller.TourController;

public class MainMenu {
	
	Scanner sc = new Scanner(System.in);
	private TourController tc = new TourController();
	
	{
		//환영문구 출력
		System.out.println("******KH항공사에 오신 고객님 환영합니다******");
	}
	
	public MainMenu() {
		
	}
	
	public void mainMenu() {
		
		System.out.println("현재 보유 금액 : " + tc.bringMyMoney());
		System.out.println("현재 보유 마일리지 : " + tc.bringMyMile());
		
		boolean flg = true;
		while(flg) {
			System.out.println("\n번호     목적지            가격           마일리지");
			System.out.println("1     미국행      300000     3000");
			System.out.println("2     중국행      200000     2000");
			System.out.println("3     일본행      150000     1500");
			System.out.print("목적지 선택(번호입력) : ");
			int inputNum = sc.nextInt();
			
			switch(inputNum) {
				
			case 1:
				//사용자가 선택한 비행기 티켓을 구매 가능한 경우
				if(tc.isAble(inputNum)) {
					tc.buyTicket1();
					System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
					System.out.println("티케팅 후 마일리지 : " + tc.bringMyMile());
				//구매가 불가능한 경우	
				}else {
					System.out.println("현재 보유금액이 부족합니다.");
					flg = false; //반복문 탈출
				}
				break;
			case 2:
				if(tc.isAble(inputNum)) {
					tc.buyTicket2();
					System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
					System.out.println("티케팅 후 마일리지 : " + tc.bringMyMile());
				//구매가 불가능한 경우	
				}else {
					System.out.println("현재 보유금액이 부족합니다.");
					flg = false; //반복문 탈출
				}
				
				break;
			case 3:
				if(tc.isAble(inputNum)) {
					tc.buyTicket3();
					System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
					System.out.println("티케팅 후 마일리지 : " + tc.bringMyMile());
				//구매가 불가능한 경우	
				}else {
					System.out.println("현재 보유금액이 부족합니다.");
					flg = false; //반복문 탈출
				}
				
				break;
			default : System.out.println("잘못된 번호를 입력하셨습니다.");
			}
		}
	}
	
	
	
	
	
	
	
	
	

}
