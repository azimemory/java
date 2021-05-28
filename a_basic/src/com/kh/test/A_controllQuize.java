package com.kh.test;

import java.util.Scanner;

public class A_controllQuize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_controllQuize test = new A_controllQuize();
		//test.quize1();
		test.quize3();
		//test.quize4();
	}
	
	public void quize1() {		
		//사용자로부터 점수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 : ");
		int score = sc.nextInt();
		String grade = "";
		
		//점수가 90점 이상
		if(score == 100) {
			grade = "A+";
		}else if(score >= 90) {
			grade = "A";
		//점수가 90점 미만 80점 이상
		}else if(score >= 80) {
			grade = "B";
		//점수가 80점 미만 70점 이상
		}else if(score >= 70) {
			grade = "C";
		//점수가 70점 미만 60점 이상
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		if(!grade.equals("F") && score % 10 >= 5) {
			grade += "+";
		}
			
		//점수와 등급을 출력
		System.out.println("점수 : " +  score + " / 등급 : " + grade);
	}
	
	public void quize2() {
		Scanner sc = new Scanner(System.in);
		boolean flg = true;
		String coupon = "";
		
		System.out.println("회원등급을 입력(dia/gold/silver/bronze) : ");
		String grade = sc.nextLine();
		
		//등급이 dia등급이라면
		if(grade.equals("dia")) {
			//다이아쿠폰, 50%할인쿠폰, 영화티켓 2매쿠폰, 20%할인쿠폰
			coupon += "다이아쿠폰 \n";
			coupon += "50%할인쿠폰 \n";
			coupon += "영화티켓 2매쿠폰 \n";
			coupon += "20%할인쿠폰 \n";
		}else if(grade.equals("gold")) {
			//50%할인쿠폰, 영화티켓 2매쿠폰, 20%할인쿠폰
			coupon += "50%할인쿠폰 \n";
			coupon += "영화티켓 2매쿠폰 \n";
			coupon += "20%할인쿠폰 \n";
		}else if(grade.equals("silver")) {
			coupon += "영화티켓 2매쿠폰 \n";
			coupon += "20%할인쿠폰 \n";
		//등급이 bronze라면
		}else if(grade.equals("bronze")){
			coupon += "20%할인쿠폰 \n";
		}else {
			System.out.println("정확한 등급명을 작성해주세요.");
			flg = false;
		}
		
		if(flg) {
			System.out.println("발급되는 쿠폰은 아래와 같습니다.");
			System.out.println(coupon);
		}
		
	}
	
	//2번 문제를 switch문으로 변환한 뒤 코드를 줄여보세요
	public void quize3() {
		Scanner sc = new Scanner(System.in);
		String coupon = "";
		boolean flg = true;
		
		System.out.print("회원등급 : ");
		String grade = sc.nextLine();		
		
		switch(grade) {
			case "dia" : coupon += "다이아쿠폰 \n";
			case "gold" : coupon += "50%할인쿠폰 \n";
			case "silver" : coupon += "영화티켓 2매쿠폰 \n";
			case "bronze" : coupon += "20%할인쿠폰 \n"; break;
			default : System.out.println("정확한 등급명을 작성해주세요.");
					  flg = false;		
		}
		
		if(flg) {
			System.out.println("발급되는 쿠폰은 아래와 같습니다.");
			System.out.println(coupon);
		}
	}
	
	public void quize4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호 입력 : ");
		
		int input = sc.nextInt();
		
		//입력받은 정수가
		switch(input) {
			case 1 : System.out.println("입력메뉴가 선택되었습니다."); break;
			case 2 : System.out.println("수정메뉴가 선택되었습니다."); break;
			case 3 : System.out.println("조회메뉴가 선택되었습니다."); break;
			case 4 : System.out.println("삭제메뉴가 선택되었습니다."); break;
			case 7 : System.out.println("프로그램이 종료됩니다."); break;
			default : System.out.println("번호를 잘못 입력하셨습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
