package com.kh.d_controllStatement.b_loopingStatement;

import java.util.Scanner;

public class A_while {
	
	//[표현식]
	//while(조건식){실행코드}
	//조건식이 참이면 실행코드를 반복수행하고
	//조건식이 거짓이면 실행코드를 무시한다.
	public static void main(String[] args) {
		A_while test = new A_while();
		//test.testWhile();
		//test.testWhile2();
		//test.testWhile3();
		test.quize2();
	}
	
	public void testWhile() {
		while(true) {
			System.out.println("무한반복문 출동!");
		}
	}
	
	//다섯번만 동작하는 while문 만들기
	public void testWhile2() {
		int i = 0;
		while(i < 5) {
			System.out.println(i+1 + "번 수행하였습니다.");
			i++;
		}
	}
	
	//사용자로부터 비밀번호를 입력받아서
	//비밀번호가 일치하면 "로그인 되었습니다."를 출력하고 반복문을 종료
	//비밀번호가 일치하지 않으면 "비밀번호가 틀렸습니다"를 출력하고 다시 비밀번호를
	//입력받을 수 있도록 한다.
	//비밀번호를 5회 틀리게 되면 "비밀번호를 5회 잘못 입력하여 프로그램을 종료합니다."
	//라고 출력하고 반복문을 종료한다.
	// * 비밀번호 :  123abc
	public void quize2() {
		Scanner sc = new Scanner(System.in);
		//저장된 비밀번호
		String password = "123abc";
		boolean flg = true;
		int tryCnt = 1;
		
		while(flg) {
			//사용자로부터 비밀번호를 입력받는다.
			System.out.print("비밀번호 입력 : ");
			String input = sc.nextLine();
		
			//입력받은 비밀번호와 저장된 비밀번호가 일치
			if(input.equals(password)) {
				//"로그인에 성공하였습니다." 출력
				System.out.println("로그인에 성공하였습니다.");
				//반복문 종료
				flg = false;
			//불일치
			}else {
				//"비밀번호가 틀렸습니다" 출력  후 
				System.out.println("비밀번호가 틀렸습니다. " + tryCnt + "회 오류");
				tryCnt++;
			}
			
			//시도횟수가 5회가 되면
			//"비밀번호를 5회 잘 못 입력하여 프로그램을 종료합니다."
			//출력 후 반복문 종료
			if(tryCnt > 5) {
				System.out.println("비밀번호를 5회 잘못 입력하여 프로그램을 종료합니다.");				
				flg = false;
			}
		}
	}
	
	//정수를 하나 입력받아, 정수가 1~9 사이의 숫자라면 그 수의 구구단을 출력하고
	//정수가 1~9를 벗어나는 숫자라면 "1~9사이의 숫자를 입력하세요" 출력
	public void testWhile3() {
		//사용자로부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int dan = sc.nextInt();
		
		//정수가 1~9사이의 숫자라면	
		if(dan >= 1 && dan <= 9) {
			int su = 1;
			while(su < 10) {
				System.out.println(dan + "*" + su + "=" +(dan*su));
				su++;
			}
		//아니라면 	
		}else {
			//"1~9사이의 숫자를 입력하세요" 출력
			System.out.println("1~9사이의 숫자를 입력하세요");
		}
	}
	
	
	
	
	
	
	
	

}
