package com.kh.d_controllStatement.d_coffeeManager;

import java.util.Scanner;

public class CoffeeManager {

	public static void main(String[] args) {
		CoffeeManager test = new CoffeeManager();
		test.app();
	}
	
	public void app() {
		
		Scanner sc = new Scanner(System.in);
		
		//지출, 매출 변수
		int expences = 0; //지출
		int salesPrice = 0; //매출
		
		//잔고 -> 사용자로부터 입력
		System.out.print("잔고를 등록하세요 : ");
		int balance = sc.nextInt();
		
		//음료별 판매량 변수
		int americanoSalesCount = 0;
		int mocaSalesCount = 0;
		int latteSalesCount = 0;
		
		//커피 등록
			//아메리카노, 모카, 라떼의
			//판매가, 원가, 재고, 안전재고 -> 사용자로부터 입력
		System.out.println("============================");
		
		System.out.print("아메리카노 판매가 : ");
		int americanoPrice = sc.nextInt();
		System.out.print("아메리카노 원가 : ");
		int americanoCost = sc.nextInt();
		System.out.print("아메리카노 재고 : ");
		int americanoStock = sc.nextInt();
		System.out.print("아메리카노 안전재고 : ");
		int americanoSaftyStock = sc.nextInt();
		System.out.println("============================");
	
		System.out.print("모카 판매가 : ");
		int mocaPrice = sc.nextInt();
		System.out.print("모카 원가 : ");
		int mocaCost = sc.nextInt();
		System.out.print("모카 재고 : ");
		int mocaStock = sc.nextInt();
		System.out.print("모카 안전재고 : ");
		int mocaSaftyStock = sc.nextInt();
		System.out.println("============================");

		System.out.print("라떼 판매가 : ");
		int lattePrice = sc.nextInt();
		System.out.print("라떼 원가 : ");
		int latteCost = sc.nextInt();
		System.out.print("라떼 재고 : ");
		int latteStock = sc.nextInt();
		System.out.print("라떼 안전재고 : ");
		int latteSaftyStock = sc.nextInt();
		System.out.println("============================");

		do {
		//메뉴 출력(do_while)
		//1.판매 등록, 2.현황, 3.종료
			System.out.println("\n=========Menu=========");
			System.out.println("판매등록(1)");
			System.out.println("현황(2)");
			System.out.println("종료(3)");
			System.out.print("입력 : ");
			int inputMenu = sc.nextInt();
			
			//1.판매등록 선택
			if(inputMenu == 1) {
				//음료 목록 출력 
				System.out.println("\n아메리카노(1)");
				System.out.println("모카(2)");
				System.out.println("라떼(3)");
				//음료의 코드, 판매량 -> 사용자로부터 입력
				System.out.print("\n * 판매한 커피코드 : ");
				int inputCode = sc.nextInt();
				System.out.print(" * 판매량 : ");
				int orderCnt = sc.nextInt();
				
				//아메리카노 선택, 모카 선택, 라떼 선택
				if(inputCode == 1) {
					//판매량이 재고보다 적어 정상적인 판매가 진행
					if(orderCnt <= americanoStock) {
						//재고 - 판매수량
						americanoStock -= orderCnt;
						//음료 판매량 + 판매수량
						americanoSalesCount += orderCnt;
						//잔고 + 판매수량 * 판매가
						balance += orderCnt * americanoPrice;
						//매출 + 판매수량 * 판매가
						salesPrice += orderCnt * americanoPrice;
					//판매량이 재고보다 많아 재고 부족
					}else {
						int needMoney = orderCnt * americanoCost;
						//재고를 매입하는데 필요한 금액이 잔고보다 적어 재고 매입
							if(needMoney <= balance) {
								System.out.println(" * 재고를 " + orderCnt + "개 추가합니다.");
								//잔고 - 판매량 * 원가
								balance -= needMoney;
								//재고 + 판매량
								americanoStock += orderCnt;
								//지출 + 판매량 * 원가
								expences += needMoney;
								
								//정상적인 판매로직
								//재고 - 판매수량
								americanoStock -= orderCnt;
								//음료 판매량 + 판매수량
								americanoSalesCount += orderCnt;
								//잔고 + 판매수량 * 판매가
								balance += orderCnt * americanoPrice;
								//매출 + 판매수량 * 판매가
								salesPrice += orderCnt * americanoPrice;
							}else {
								//잔고가 부족해 재고 매입 불가
								//주문을 취소하고 콘솔에 해당 내용을 출력
								System.out.println(" * 잔고가 부족해 재고를 추가하지 못했습니다.");
								System.out.println(" * 주문이 취소 되었습니다.");
								continue;
							}
						
					}
					//판매종료	
						//제품명, 판매수량, 결재금액, 남은 재고량 출력
						System.out.println("\n 제품명 : 아메리카노"
								+" \n 판매가 : " + americanoPrice
								+" \n 판매수량 : " + orderCnt
								+" \n 결재금액 : " + americanoPrice * orderCnt
								+" \n 남은 재고 : " + americanoStock);
			
					//안전재고를 확인
						//안전재고가 부족한 경우 안전재고 * 2 만큼 재고 확보
						if(americanoStock < americanoSaftyStock) {
							System.out.println(" * 아메리카노 재고가 부족해 안전재고를 확보합니다.");
							//잔고 - 안전재고 * 2 * 원가
							balance -= americanoSaftyStock * 2 * americanoCost;
							//재고 + 안전재고 * 2
							americanoStock += americanoSaftyStock * 2;
							//지출 + 안전재고 * 2 * 원가
							expences += americanoSaftyStock * 2 * americanoCost;
							System.out.println(" * 아메리카노 재고 : " +  americanoStock);
						}
				}else if(inputCode == 2) {
					
					//판매량이 재고보다 적어 정상적인 판매가 진행
					if(orderCnt <= mocaStock) {
						//재고 - 판매수량
						mocaStock -= orderCnt;
						//음료 판매량 + 판매수량
						mocaSalesCount += orderCnt;
						//잔고 + 판매수량 * 판매가
						balance += orderCnt * mocaPrice;
						//매출 + 판매수량 * 판매가
						salesPrice += orderCnt * mocaPrice;
					//판매량이 재고보다 많아 재고 부족
					}else {
						int needMoney = orderCnt * mocaCost;
						//재고를 매입하는데 필요한 금액이 잔고보다 적어 재고 매입
							if(needMoney <= balance) {
								System.out.println(" * 재고를 " + orderCnt + "개 추가합니다.");
								//잔고 - 판매량 * 원가
								balance -= needMoney;
								//재고 + 판매량
								mocaStock += orderCnt;
								//지출 + 판매량 * 원가
								expences += needMoney;
								
								//정상적인 판매로직
								//재고 - 판매수량
								mocaStock -= orderCnt;
								//음료 판매량 + 판매수량
								mocaSalesCount += orderCnt;
								//잔고 + 판매수량 * 판매가
								balance += orderCnt * mocaPrice;
								//매출 + 판매수량 * 판매가
								salesPrice += orderCnt * mocaPrice;
							}else {
								//잔고가 부족해 재고 매입 불가
								//주문을 취소하고 콘솔에 해당 내용을 출력
								System.out.println(" * 잔고가 부족해 재고를 추가하지 못했습니다.");
								System.out.println(" * 주문이 취소 되었습니다.");
								continue;
							}
					}
					//판매종료	
						//제품명, 판매수량, 결재금액, 남은 재고량 출력
						System.out.println("제품명 : 모카"
								+" \n 판매가 : " + mocaPrice
								+" \n 판매수량 : " + orderCnt
								+" \n 결재금액 : " + mocaPrice * orderCnt
								+" \n 남은 재고 : " + mocaStock);
			
					//안전재고를 확인
						//안전재고가 부족한 경우 안전재고 * 2 만큼 재고 확보
						if(mocaStock < mocaSaftyStock) {
							System.out.println(" * 모카 재고가 부족해 안전재고를 확보합니다.");
							//잔고 - 안전재고 * 2 * 원가
							balance -= mocaSaftyStock * 2 * mocaCost;
							//재고 + 안전재고 * 2
							mocaStock += mocaSaftyStock * 2;
							//지출 + 안전재고 * 2 * 원가
							expences += mocaSaftyStock * 2 * mocaCost;
							System.out.println(" * 모카 재고 : " +  mocaStock);
						}
					
				}else if(inputCode == 3) {
					
					//판매량이 재고보다 적어 정상적인 판매가 진행
					if(orderCnt <= latteStock) {
						//재고 - 판매수량
						latteStock -= orderCnt;
						//음료 판매량 + 판매수량
						latteSalesCount += orderCnt;
						//잔고 + 판매수량 * 판매가
						balance += orderCnt * lattePrice;
						//매출 + 판매수량 * 판매가
						salesPrice += orderCnt * lattePrice;
					//판매량이 재고보다 많아 재고 부족
					}else {
						int needMoney = orderCnt * latteCost;
						//재고를 매입하는데 필요한 금액이 잔고보다 적어 재고 매입
							if(needMoney <= balance) {
								System.out.println(" * 재고를 " + orderCnt + "개 추가합니다.");
								//잔고 - 판매량 * 원가
								balance -= needMoney;
								//재고 + 판매량
								latteStock += orderCnt;
								//지출 + 판매량 * 원가
								expences += needMoney;
								
								//정상적인 판매로직
								//재고 - 판매수량
								latteStock -= orderCnt;
								//음료 판매량 + 판매수량
								latteSalesCount += orderCnt;
								//잔고 + 판매수량 * 판매가
								balance += orderCnt * lattePrice;
								//매출 + 판매수량 * 판매가
								salesPrice += orderCnt * lattePrice;
							}else {
								//잔고가 부족해 재고 매입 불가
								//주문을 취소하고 콘솔에 해당 내용을 출력
								System.out.println(" * 잔고가 부족해 재고를 추가하지 못했습니다.");
								System.out.println(" * 주문이 취소 되었습니다.");
								continue;
							}
					}
					//판매종료	
						//제품명, 판매수량, 결재금액, 남은 재고량 출력
						System.out.println("제품명 : 라떼"
								+" \n 판매가 : " + lattePrice
								+" \n 판매수량 : " + orderCnt
								+" \n 결재금액 : " + lattePrice * orderCnt
								+" \n 남은 재고 : " + latteStock);
			
					//안전재고를 확인
						//안전재고가 부족한 경우 안전재고 * 2 만큼 재고 확보
						if(latteStock < latteSaftyStock) {
							System.out.println(" * 라떼 재고가 부족해 안전재고를 확보합니다.");
							//잔고 - 안전재고 * 2 * 원가
							balance -= latteSaftyStock * 2 * latteCost;
							//재고 + 안전재고 * 2
							latteStock += latteSaftyStock * 2;
							//지출 + 안전재고 * 2 * 원가
							expences += latteSaftyStock * 2 * latteCost;
							System.out.println(" * 라떼 재고 : " +  latteStock);
						}
				}else {
					System.out.println("존재하지 않는 음료코드 입니다.");
				}
			}else if(inputMenu == 2) {
				//2. 현황 선택
				//음료의 재고, 판매량
				//잔고, 매출, 지출 출력
				System.out.println("\n 아메리카노 재고 : " + americanoStock
						+ " | 판매량 : " +americanoSalesCount);
				System.out.println(" 모카 재고 : " + mocaStock + " | 판매량 : " + mocaSalesCount);
				System.out.println(" 라떼 재고 : " + latteStock + " | 판매량 : " + latteSalesCount);
				System.out.println(" 잔고 : " + balance + " | 매출 : " + salesPrice + " |  지출 : " + expences);
			}else if(inputMenu == 3) {
				//3. 종료 선택
				//프로그램을 종료
				System.out.println(" * 프로그램을 종료합니다.");
				break;
			}else {
				System.out.println(" * 잘못된 번호를 입력하였습니다.");
			}
			
		}while(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
