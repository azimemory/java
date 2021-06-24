package com.kh.tour__refectoring.view;

import java.util.Scanner;

import com.kh.tour__refectoring.controller.TourController;

public class MainMenu {
	
	Scanner sc = new Scanner(System.in);
	private TourController tourController = new TourController();
	
	public MainMenu() {
		
	}
	
	public void mainMenu() {
		
		System.out.println("******KH항공사에 오신 고객님 환영합니다******");
		System.out.println("현재 보유 금액 : " + tourController.bringMyMoney());
		System.out.println("현재 보유 마일리지 : " + tourController.bringMyMile());
		
		while(true) {
			System.out.println("\n번호     목적지            가격           마일리지");
			System.out.println("1     미국행      300000     3000");
			System.out.println("2     중국행      200000     2000");
			System.out.println("3     일본행      150000     1500");
			System.out.print("목적지 선택(번호입력) : ");
			int inputNum = sc.nextInt();
			
			if(inputNum < 1 || inputNum > 3) {
				System.out.println("잘못된 행선지를 입력하였습니다. \n");
				continue;
			}
			
			//사용자가 선택한 비행기 티켓을 구매 가능한 경우
			if(tourController.isAble(inputNum)) {
				tourController.buyTicket(inputNum);
				System.out.println("티케팅 후 잔액은 : " + tourController.bringMyMoney());
				System.out.println("티케팅 후 마일리지 : " + tourController.bringMyMile());
			//구매가 불가능한 경우	
			}else {
				System.out.println("현재 보유금액이 부족합니다.");
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	

}
