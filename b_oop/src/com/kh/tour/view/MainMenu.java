package com.kh.tour.view;

import java.util.Scanner;

import com.kh.tour.controller.TourController;

public class MainMenu {

	Scanner sc = new Scanner(System.in);
	private TourController tc = new TourController();

	{
		System.out.println("******KH항공사에 오신 고객님 환영합니다******");
	}

	public MainMenu() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {

		System.out.println("현재 보유 금액 : " + tc.bringMyMoney());
		System.out.println("현재 보유 마일리지 : " + tc.bringMyMile());

		while (true) {
			
			System.out.println(" 번호      목적지       가격     마일리지");
			System.out.println("  1       미국행     300000    3000");
			System.out.println("  2       중국행     200000    2000");
			System.out.println("  3       일본행     150000    1500");
			System.out.print("목적지 선택 : ");
			int input = sc.nextInt();
			
			if(input < 1 || input > 3) {
				System.out.println("잘못된 행선지를 입력하였습니다. \n");
				continue;
			}

			if(tc.isAble(input)) {
				switch (input) {
				case 1:
					tc.buyTicket1();
					System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
					System.out.println("티케팅 후 마일리지는  : " + tc.bringMyMile());
					break;
				case 2:
					tc.buyTicket2();
					System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
					System.out.println("티케팅 후 마일리지는  : " + tc.bringMyMile());
					break;
				case 3:
					tc.buyTicket3();
					System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
					System.out.println("티케팅 후 마일리지는  : " + tc.bringMyMile());
					break;
				}
			}else {
				System.out.println("현재 보유 금액이 부족합니다.");
				break;
			}
		}

	}

}
