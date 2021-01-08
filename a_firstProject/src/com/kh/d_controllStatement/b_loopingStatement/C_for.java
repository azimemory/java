package com.kh.d_controllStatement.b_loopingStatement;

import java.util.Scanner;

public class C_for {
	//[표현식]
	//for(초기식;조건식;증감식){실행코드}
	public static void main(String[] args) {
		C_for test = new C_for();
		test.testFor();
	}
	
	public void testFor() {
		//5회 반복하는 반복문으로 수정하기
		for(int i = 0; i < 5; i++) {
			System.out.println("5회 반복되는 반복문입니다. " + i);
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
				System.out.println(dan + "*" + su + "= " + (dan*su));
			}
		//아니라면
		}else {
			//"1~9사이의 수를 입력해야 합니다" 출력
			System.out.println("1~9사이의 수를 입력해야 합니다.");
		}				
	}	
	
}
