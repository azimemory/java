package com.kh.a_first;
// 주석: 프로그램 소스의 내용 이해를 돕기 위해 작성하는 설명
//		컴파일 시 주석은 소스로 포함되지 않는다.
//		 //   : 한 줄을 주석처리 할 때
//		/* */ : 여러 줄을 주석처리 할 때 사용.

/* 
 * JAVA 파일 작성 서식
 1. 반드시 첫 줄에 패키지(package)를 선언한다.
	*package : 목적이 같은 클래스들을 묶어 놓은 그룹(폴더)
	 package 경로를 생성할 때는 유일성을 갖출 수 있는 형식으로 패키지명을 작성
   ex)회사의 도메인 + 프로젝트명 : com.kh.a_first
 2. import 선언문 작성
 3. 클래스 작성  
 */
public class ValuePrinter {
	
	public static void main(String[] args) {
		//main method
		//자바 어플리케이션을 실행 시키면 시작점과 끝점이 되는 메서드
		//main메서드의 첫줄 부터 코드를 읽기 시작한다.
		System.out.println("Hello World!!");
	}
}
