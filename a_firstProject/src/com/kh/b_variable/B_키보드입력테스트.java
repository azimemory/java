package com.kh.b_variable;

import java.util.Scanner;

public class B_키보드입력테스트 {

	public static void main(String[] args) {
		//Scanner : 표준입력장치(키보드)를 통해 외부로부터 데이터를 입력받는 
		//		것을 도와주는 클래스
		
		Scanner sc = new Scanner(System.in);
		// 클래스의 fullName은 패키지경로 + 클래스명
		// import를 하지 않고 다른 패키지의 클래스를 사용하려면
		//	클래스의 fullname을 작성해야한다.
		// import를 선언하면 클래스명만으로 클래스를 사용할 수 있다.
		// java.lang패키지는 자동 import처리가 된다.
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("나의 이름은 " + name + " 입니다.");
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		System.out.println("키(소수점 첫째자리까지) : ");
		double height = sc.nextDouble();
		System.out.println("키 : " + height);
		
		
		
		
		
		
		

	}
}
