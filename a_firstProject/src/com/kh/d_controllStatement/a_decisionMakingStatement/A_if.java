package com.kh.d_controllStatement.a_decisionMakingStatement;

import java.util.Scanner;

public class A_if {
	
	// 제어문 : 조건문, 반복문
	// 코드의 흐름을 제어하는 문법
	public static void main(String[] args) {
		A_if test = new A_if();
		test.testIf();
	}
	
	public void testIf() {
		//단독 if문
		//[표현식]
		//if(조건식){실행코드}
		//조건식의 결과가 true이면 {} 안의 코드를 실행
		//조건식의 결과가 false이면 {} 안의 코드를 무시한다.
		
		//사용자가 입력한 숫자가 짝수인지 조건을 확인
		//짝수 일 때 "짝수 입니다." 출력
		//홀수 일 때 "홀수 입니다." 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		
		if(num % 2 != 0) {
			System.out.println("홀수 입니다.");
		}
		
		System.out.println("프로그램 종료");
	}
	
	//아까 보여드린 개발자 유머에서
	//개발자 머리속 알고리즘을 코드로 작성하시오
	//마트에 달걀 유무여부는 사용자로부터 입력받는다.
	// 있다. 'y' 없음. 'n'
	public void funQuize() {
		//사용자로부터 달걀의 유무 여부를 입력받는다.
		System.out.print("마트에 달걀이 있습니까?(y/n)");
		Scanner sc = new Scanner(System.in);
		char egg = sc.next().charAt(0);
		
		//마트에서 우유 두개 사와
		//우유 개수 2개
		int milkCnt = 2;
		
		//만약 마트에 달걀이 있으면 여섯 개 사다 줘
		if(egg == 'y' || egg == 'Y') {
			milkCnt = 6;
		}
		
		//개발자가 사온 우유 개수를 출력
		System.out.println("자기야 우유 " + milkCnt + "개 사왔어~");
	}
	
	
	
	
	
	
	
	
}
