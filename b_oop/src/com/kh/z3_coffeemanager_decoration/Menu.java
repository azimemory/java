package com.kh.z3_coffeemanager_decoration;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	private Coffee[] coffeeArr;
	private Account account;
	private Sales sales;

	public Menu() {
		System.out.println("\n*************** 커피메니저를 시작합니다 ***************\n");
		System.out.print("잔고를 입력하세요 : ");
		account = new Account(sc.nextInt());
		sales = new Sales();

		System.out.println("========================================");
		System.out.print("등록할 커피 메뉴 개수를 입력하세요 : ");
		coffeeArr = new Coffee[sc.nextInt()];
		for (int i = 0, no = 1; i < coffeeArr.length; i++, no++) {
			//이름, 판매가, 매입가, 재고, 안전재고
			System.out.print(no + "번째 커피의 이름을 등록하세요 : ");
			String name = sc.next();

			System.out.print(no + "번째 커피의 판매가를 등록하세요 : ");
			int price = sc.nextInt();

			System.out.print(no + "번째 커피의 매입가를 등록하세요 : ");
			int cost = sc.nextInt();

			System.out.print(no + "번째 커피의 재고를 등록하세요 : ");
			int stock = sc.nextInt();

			System.out.print(no + "번째 커피의 안전재고를 등록하세요 : ");
			int safetyStock = sc.nextInt();

			System.out.print(no + "번째 커피의 종류를 등록하세요(일반:N / 프라푸치노: F) : ");
			String type = sc.next();
			
			if(type.equalsIgnoreCase("N")) {
				coffeeArr[i] = new Coffee(name, price, cost, stock, safetyStock);
			}else if(type.equalsIgnoreCase("F")) {
				coffeeArr[i] = new Frappuccino(name, price, cost, stock, safetyStock);
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				i--; no--;
				continue;
			}

			if (i != coffeeArr.length - 1) {
				System.out.println("\n===========다음 메뉴를 등록합니다===========\n");
			}
		}
	}

	public void showIndex() {
		while (true) {
			//메뉴출력
			System.out.println("\n==================Menu===================");
			System.out.println("메뉴(1)");
			System.out.println("현황(2)");
			System.out.println("종료(3)");
			System.out.print("입력 : ");
			int inputMenu = sc.nextInt();

			switch (inputMenu) {
			case 1:
				showCoffeeMenu();
				break;
			case 2:
				showStatus();
				break;
			case 3:
				System.out.println(" * 프로그램 종료");
				return; //메서드를 종료
			default:
				System.out.println(" * 잘못된 번호를 입력하였습니다.");

			}
		}
	}

	private void showCoffeeMenu() {
		System.out.println("----------음료 list----------");
		for (int i = 0; i < coffeeArr.length; i++) {
			System.out.println(coffeeArr[i].getName() + "(" + i + ")");
		}
		
		System.out.println("-----------------------------");
		System.out.println(" 판매등록(1)");
		System.out.println(" 환불등록(2)");
		System.out.println(" 반품등록(3)");
		System.out.print(" 입력 :");

		switch (sc.nextInt()) {
		case 1:
			showSales();
			break;
		case 2:
			showRefund();
			break;
		case 3:
			showReturn();
			break;
		default: System.out.println(" * 잘못된 번호를 입력하였습니다.");
			
		}
	}

	private void showReturn() {
		// TODO Auto-generated method stub
	}

	private void showRefund() {
		System.out.print("\n * 환불한 커피코드 : ");
		int inputCode = sc.nextInt();
		System.out.print(" * 환불 수량 : ");
		int refundCnt = sc.nextInt();

		if (inputCode < 0 || inputCode >= coffeeArr.length) {
			System.out.println(" * 잘못된 커피코드를 입력하셨습니다.");
			return;
		}

		Coffee refundCoffee = coffeeArr[inputCode]; //환불한 커피

		//판매를 진행하고 결제금액받아서 결재내역을 출력
		int refundPrice = sales.refundProduct(refundCoffee, account, refundCnt);

		if (refundPrice == 0) {
			System.out.println(" * 환불이 취소되었습니다.");
			return;
		}

		System.out.println("--------결과--------");
		System.out.println("제품명 : " + refundCoffee.getName());
		System.out.println("판매가 : " + refundCoffee.getPrice());
		System.out.println("환불수량 : " +  refundCnt);
		System.out.println("환불금액 : " + refundPrice);
		System.out.println("남은 재고 : " + refundCoffee.getStock());
	}

	private void showSales() {
		System.out.print("\n * 판매한 커피코드 : ");
		int inputCode = sc.nextInt();
		System.out.print("\n * 초코토핑 추가[y/n] : ");
		String topping = sc.next();
		System.out.print(" * 판매량 : ");
		int salesCnt = sc.nextInt();

		if (inputCode < 0 || inputCode >= coffeeArr.length) {
			System.out.println(" * 잘못된 커피코드를 입력하셨습니다.");
			return;
		}
		
		Coffee soldCoffee = null;
		if(topping.equalsIgnoreCase("y")) {
			soldCoffee = new ChocoDecorator(coffeeArr[inputCode]);
		}else {
			soldCoffee = coffeeArr[inputCode]; //판매한 커피
		}

		//판매를 진행하고 결제금액받아서 결재내역을 출력
		int payPrice = sales.sellProduct(soldCoffee, account, salesCnt);

		if (payPrice == 0) {
			System.out.println(" * 주문이 취소되었습니다.");
			return;
		}

		System.out.println("--------결과--------");
		System.out.println("제품명 : " + soldCoffee.getName());
		System.out.println("판매가 : " + soldCoffee.getPrice());
		System.out.println("판매수량 : " + salesCnt);
		System.out.println("결재금액 : " + payPrice);
		System.out.println("남은 재고 : " + soldCoffee.getStock());
	}

	private void showStatus() {
		//현황 
		//음료의 재고와 판매량
		//잔고 매출 지출
		System.out.println("\n==========================================================================");
		for (int i = 0; i < coffeeArr.length; i++) {
			System.out.printf("이름 :  %-10s | 재고 : %5d | 판매량 : %5d \n", coffeeArr[i].getName(), coffeeArr[i].getStock(),
					coffeeArr[i].getTotalSaleCnt());
		}

		System.out.println("---------------------------------------------------------------------------");
		System.out.println("잔고 : " + account.getBalance() + "  |   매출  " + account.getSalesVolume() + "  |   지출  "
				+ account.getExpences());
	}
}
