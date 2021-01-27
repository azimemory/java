package com.kh.z_coffeemanager.d_polymorphism;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	private Account account;
	private Sales sales;
	//관리할 커피들을 보관할 Coffee[]
	private Coffee[] coffeeArr;
	
	//기본생성자의 역할 : 필드변수 초기화
	public Menu() {
		System.out.print("잔고를 입력하세요 : ");
		account = new Account();
		//사용자에게 잔고를 입력 받아서 account객체의 balance 필드변수에 넣어준다.
		account.setBalance(sc.nextInt());
		
		sales = new Sales(account);
		
		System.out.println("=============================");
		System.out.print("커피 종류의 가짓수를 입력하세요 : ");
		//사용자가 입력한 가짓수 만큼 커피를 보관할 수 있는 커피배열 생성
		coffeeArr = new Coffee[sc.nextInt()];
		
		System.out.println("=============================");
		//사용자로부터 커피의 이름, 판매가, 매입가, 재고, 안전재고를 입력받는다.
		//커피 객체를 생성해서 커피배열에 추가
		for(int i = 0; i < coffeeArr.length; i++) {
			Coffee coffee;

			//커피객체의 생성자를 통해 account 객체를 주입한다.
			//Coffee coffee = new Coffee(account);
			int no = i + 1;
			
			System.out.print(no + "번째 커피의 등급을 입력하세요. 프리미엄:p | 일반:n");
			String type = sc.next();
			switch(type) {
				//사용자가 p를 입력한 경우 프리미엄커피 클래스로 인스턴스화
				//사용자가 n을 입력한 경우 커피클래스로 인스턴스화
			case "p": coffee = new PremiumCoffee();
					  coffee.setAccount(account);
					  System.out.print("포장비용을 입력하세요 : ");
					  //setPackageCost() 는 PremiumCoffee 클래스에 작성되어있다.
					  ((PremiumCoffee)coffee).setPackagingCost(sc.nextInt());
					  break;
			case "n": coffee = new Coffee();
					coffee.setAccount(account);
					break;
			default : System.out.println("커피등급을 잘 못 입력하였습니다.");
					i--; continue;
			}
			
			System.out.print(no + "번째 커피의 이름을 등록하세요 : ");
			coffee.setName(sc.next());
			System.out.print(no + "번째 커피의 판매가를 등록하세요 : ");
			coffee.setSalesPrice(sc.nextInt());
			System.out.print(no + "번째 커피의 매입가를 등록하세요 : ");
			coffee.setPerchacePrice(sc.nextInt());
			System.out.print(no + "번째 커피의 재고를 등록하세요 : ");
			coffee.setStock(sc.nextInt());
			System.out.print(no + "번째 커피의 안전재고를 등록하세요 : ");
			coffee.setSafetyStock(sc.nextInt());
			
			coffeeArr[i] = coffee;
		}
	}
	
	public void showIndex() {
		
		do {
			System.out.println("\n=======메뉴=======");
			System.out.println("메뉴(0)");
			System.out.println("현황(1)");
			System.out.println("종료(2)");
			System.out.print("입력 : ");
			int inputMenu = sc.nextInt();
			
			switch (inputMenu) {
			case 0:	showMenu(); break;
			case 1 : showStats(); break;
			case 2 : System.out.println(" * 프로그램 종료"); return;
			default: System.out.println(" * 잘못된 번호를 입력하였습니다.");	break;
			}
			
		}while(true);
	}
	
	private void showMenu() {
		System.out.println("\n*********** 음료 메뉴");
		for(int i = 0; i < coffeeArr.length; i++) {
			//coffeeArr[i]로 접근하면 Coffee 인스턴스 주소가 있다.
			//coffee클래스의 메서드를 사용할 수 있다.
			System.out.println(coffeeArr[i].getName() + "(" + i + ")");
		}
		
		System.out.println("\n 판매 등록(0)");
		System.out.println(" 환불 등록(1)");
		System.out.println(" 반품 등록(2)");
		System.out.print(" 입력 : ");
		int inputMenu = sc.nextInt();
		
		switch(inputMenu) {
			case 0 : showSales(); break;
			case 1 : showRefund(); break;
			case 2 : showReturn(); break;
			default : System.out.println(" * 잘못된 번호를 입력하였습니다.");
		}
	}
	
	private void showSales() {
		System.out.print("\n * 판매한 커피의 코드를 입력하세요 : ");
		int inputCode = sc.nextInt();
		
		//없는 커피코드를 입력한 경우 예외처리
		if(inputCode >= coffeeArr.length || inputCode < 0) {
			System.out.println("커피코드를 잘못 입력하셨습니다.");
			return;
		}
		
		System.out.print(" * 판매량을 입력하세요 : ");
		int salesCnt = sc.nextInt();
		
		//판매 진행
		int payPrice = sales.sellProduct(coffeeArr[inputCode], salesCnt);
		
		//결재가 정상적으로 진행되어서 결재금액이 0보다 크다면
		if(payPrice > 0) {
			System.out.println("\n 제품명 : " + coffeeArr[inputCode].getName()
					+"\n 판매가 : " + coffeeArr[inputCode].getSalesPrice()
					+"\n 판매갯수 : " + salesCnt
					+"\n 결제 금액 : " + payPrice
					+"\n 남은 재고 : " + coffeeArr[inputCode].getStock());
		}else {
			System.out.println(" * 주문이 취소 되었습니다.");
		}
	}
	
	private void showRefund() {
		System.out.print("\n * 환불한 커피의 코드를 입력하세요 : ");
		int inputCode = sc.nextInt();
		
		//없는 커피코드를 입력한 경우 예외처리
		if(inputCode >= coffeeArr.length || inputCode < 0) {
			System.out.println("커피코드를 잘못 입력하셨습니다.");
			return;
		}
		
		System.out.print(" * 환불수량을 입력하세요 : ");
		int refundCnt = sc.nextInt();
		
		//환불 진행
		int payPrice = sales.refundProduct(coffeeArr[inputCode], refundCnt);
		
		//결재가 정상적으로 진행되어서 결재금액이 0보다 크다면
		if(payPrice > 0) {
			System.out.println("\n 제품명 : " + coffeeArr[inputCode].getName()
					+"\n 판매가 : " + coffeeArr[inputCode].getSalesPrice()
					+"\n 환불 갯수 : " + refundCnt
					+"\n 환불 금액 : " + payPrice
					+"\n 남은 재고 : " + coffeeArr[inputCode].getStock());
		}else {
			System.out.println(" * 환불이 취소 되었습니다.");
		}
	}
	
	private void showReturn() {
		System.out.print("\n * 반품할 커피의 코드를 입력하세요 : ");
		int inputCode = sc.nextInt();
		
		//없는 커피코드를 입력한 경우 예외처리
		if(inputCode >= coffeeArr.length || inputCode < 0) {
			System.out.println("커피코드를 잘못 입력하셨습니다.");
			return;
		}
		
		System.out.print(" * 반품수량을 입력하세요 : ");
		int returnCnt = sc.nextInt();
		
		//반품 진행
		int returnPrice = sales.returnProduct(coffeeArr[inputCode], returnCnt);
		
		//결재가 정상적으로 진행되어서 결재금액이 0보다 크다면
		if(returnPrice > 0) {
			System.out.println("\n 제품명 : " + coffeeArr[inputCode].getName()
					+"\n 판매가 : " + coffeeArr[inputCode].getSalesPrice()
					+"\n 반품 갯수 : " + returnCnt
					+"\n 반품 금액 : " + returnPrice
					+"\n 남은 재고 : " + coffeeArr[inputCode].getStock());
		}else {
			System.out.println(" * 반품이 취소 되었습니다.");
		}
	}
	
	//현황창 출력
	private void showStats() {
		System.out.println("\n==============================");
		//모든 커피들의 재고와 판매량 출력
		//for-each문
		//coffeeArr의 인덱스에 접근해 coffee변수에 주소값을 담아준다.
		//첫번째 바퀴때는 0번인덱스에 저장된 Coffee의 인스턴스가 coffee변수에
		//두번째 바퀴때는 1번 인덱스에 저장된 Coffee의 인스턴스가 coffee변수에
		//...
		for(Coffee coffee : coffeeArr) {
			System.out.printf("%5s 재고 : %5d | 판매량 : %5d"
					,coffee.getName(),coffee.getStock(), coffee.getSalesCount());
		}
		
		//현재 계좌의 잔고/매출/지출
		System.out.println("\n * 잔고 :  " + account.getBalance()
					+ " | 매출 : " + account.getSalesPrice()
					+ " | 지출 : " + account.getExpences());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
