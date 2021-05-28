package com.kh.d_controllStatement.c_branchingStatement;

import java.util.Scanner;

public class A_break {
	
	//break문은 반복문 안에서 즉시 반복을 멈추기 위한 예약어
	//일반적으로 if문과 함께 사용해서 특정 조건일 때 반복을 멈추기 위해 사용
	public static void main(String[] args) {
		A_break test = new A_break();
		test.testBreak();
	}
	
	public void testBreak() {
		//문자열을 입력받아 문자열의 문자수를 출력하는 메서드
		//사용자가 "end" 를 입력하면 반복을 종료함
		Scanner sc = new Scanner(System.in);
		//boolean flg = true;
		while(true) {
			System.out.print("문자열 입력:");
			String str = sc.nextLine();
			
			if(str.equals("end")) {
				System.out.println("프로그램을 종료하다.");
				//flg = false;
				break;
			}
			
			//String.length() : 문자열의 길이를 반환하는 메서드
			System.out.println("글자개수 : " + str.length());
		}
	}

	    //사용자로부터 정수하나를 입력받아 
		//정수가 1~9사이의 숫자라면 그 수의 구구단을 출력하시오
		//아니라면 "1~9 사이의 숫자를 입력해야합니다"를 출력
		public void quiz() {
			
			//사용자로부터 정수 하나 입력받기
			Scanner sc = new Scanner(System.in);
			int dan = sc.nextInt();
			
			//정수가 1~9사이인지 확인
			if(dan >= 1 && dan <= 9) {
				//구구단을 출력
				for(int su = 1; su < 10; su++) {
					if(su > 3) {
						break;
					}
					System.out.println(dan + "*" + su + "= " + (dan*su));
				}
			//아니라면
			}else {
				//"1~9사이의 수를 입력해야 합니다" 출력
				System.out.println("1~9사이의 수를 입력해야 합니다.");
			}				
		}	
	
	
	
	
	
}
