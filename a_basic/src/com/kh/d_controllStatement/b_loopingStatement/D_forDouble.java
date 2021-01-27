package com.kh.d_controllStatement.b_loopingStatement;

import java.util.Scanner;

public class D_forDouble {

	public static void main(String[] args) {
		D_forDouble test = new D_forDouble();
		//test.testForDouble();
		//test.quizeForDouble();
		//test.quizeDouble3();
		//test.quizeDouble3_2();
		//test.quizeDouble3_3();
		test.printStar2();
	}
	
	public void testForDouble() {
		for(int i = 0; i < 10; i++) {
			for(int j=0; j < 5; j++) {
				System.out.println("몇번 반복될까? " + j);
			}
			System.out.println("=========================");
		}
	}
	
	//2중for문으로 구구단
	//2단~9단까지 출력해보기
	public void quizeForDouble() {
		for(int i = 2; i < 10; i++) {
			System.out.println("========="+i+"단=======");
			for(int j=1; j < 10; j++) {
				System.out.println(i+"*"+ j +"="+ (i*j));
			}
		}
	}
	
	//사용자로부터 다운로드 받을 프로그램 갯수를 입력받아
	//다운로드 진행창을 출력하시오
	
	//사용자로부터 다운로드 받을 프로그램의 개수 입력받는다.
	//[출력양식]
	//n번째 프로그램 다운로드 받습니다.
	//0% 진행중...
	//20% 진행중...
	//40% 진행중...
	//60% 진행중...
	//80% 진행중...
	//100% 진행중...
	//n번째 프로그램 다운로드 완료되었습니다.
	//-------------------------------
	//모든 프로그램 다운로드 완료
	public void quizeForDouble2() {
		Scanner sc = new Scanner(System.in);
		//사용자로 정수를 입력받는다.
		System.out.print("프로그램 개수 : ");
		int cnt = sc.nextInt();
		
		for(int i=0; i < cnt; i++) {
			System.out.println(i+1+"번째 프로그램 다운로드 받습니다.");
			for(int j =0; j < 6; j++) {
				System.out.println(j*20 + "% 진행중...");
			}
			System.out.println(i+1+"번째 프로그램 다운로드 완료되었습니다.");
			System.out.println("==========================");
		}
		System.out.println("--------------------------");
		System.out.println("모든 프로그램 다운로드가 완료되었습니다.");
	}
	
	//사용자로부터 줄 수와 칸수를 입력받아서
	//사각형을 별로 그리는 이중반복문 작성하시오
	//System.out.print()
	//System.out.println()  
	//차이를 잘 생각하시면 쉽게 해결할 수 있습니다.
	public void quizeDouble3() {
		
		Scanner sc = new Scanner(System.in);
		//사용자로 부터 줄 수 입력
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		//사용자로부터 칸 수 입력
		System.out.print("칸 수 : ");
		int column = sc.nextInt();
		
		//사용자가 입력한 칸 수만큼 별을 출력하는 코드를 
		//사용자가 입력한 줄 수 만큼 반복한다.
		for(int i = 0; i < row; i++) {
			//사용자가 입력한 칸수만큼
			for(int j = 0; j < column; j++) {
				//별을 한 줄로 출력한다
				System.out.print("*");
			}
			//안쪽 for문이 종료되면 줄바꿈 처리를 해준다.
			System.out.println();
		}
	}
	
	//사용자로부터 정수를 하나 입력받아
	//사각형을 별로 그리는 데, 대각선에는 숫자를 출력하시오
	//숫자는 1~사용자가 입력한 숫자까지.
	public void quizeDouble3_2() {
		//사용자로부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j < cnt; j++) {
				if(i==j) {
					System.out.print(i+1);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void quizeDouble3_3() {
		
		//사용자로부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j < cnt; j++) {
				if(i==j) {
					System.out.print(i+1);
					break;
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void printStar2() {
		
		//사용자로 부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int row = sc.nextInt();
		
		//입력받은 정수가 0보다 클 때
		if(row > 0) {
			//삼각형
			for(int i = 1; i <= row; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		//0보다 작을 때
		}else if(row < 0) {
			int d = -row;
			//역삼각형
			for(int i = 0; i < -row; i++) {
				
				for(int j = 0; j < d; j++) {
					System.out.print("*");
				}
				System.out.println();
				d--;
			}
		//0일때
		}else {
			//"출력기능이 없습니다" 
			System.out.println("출력기능이 없습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
