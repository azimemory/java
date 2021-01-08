package com.kh.d_controllStatement.a_decisionMakingStatement;

import java.util.Scanner;

public class C_ifElseIf {
	
	//다중조건문
	//[표현식]
	//if(조건식){
	//}else if(조건식){
	//}else if(조건식){
	//}else{
	//}

	public static void main(String[] args) {
		C_ifElseIf test = new C_ifElseIf();
		System.out.println(test);
		test.testIfElseIf();
	}
	
	public void testIfElseIf() {
		//정수로 점수를 하나 입력받아서 점수와 등급을 출력하세요.
		System.out.print("점수 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = "F";
		
		//90점 이상 'A'
		if(score >= 90) {
			grade = "A";
		//90점 미만 80점 이상 'B'
		}else if(score >= 80) {
			grade = "B";
		//80점 미만 70점 이상 'C'
		}else if(score >= 70) {
			grade = "C";
		//70점 미만 60점 이상 'D'
		}else if(score >= 60) {
			grade = "D";
		}
		
		System.out.println("당신의 점수는 " + score + "이고," + 
				"등급은 "+ grade +" 입니다.");
		
		System.out.println("프로그램 종료");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
