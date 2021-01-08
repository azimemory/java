package com.kh.b_variable;

public class A_변수선언 {
	public static void main(String[] args) {
		//자바의 기본형(primitive)타입
		//논리형(boolean), 문자형(char)
		//, 숫자형(byte,short,int,long,float,double)
		
		//변수의 선언
		//타입 변수명;
		// 변수의 명명규칙 
		// 1. 영어의 대소문자를 구분하며 길이 제한 없습니다.
		// 2. 예약어를 사용하면 안된다.
		// 3. 숫자로 시작하면 안된다.
		// 4. 이름에는 공백이 들어갈 수 없다.
		// 5. 특수문자는 '_'와 '$'만 허용된다.
		// 6. 변수명은 소문자로 작성한다. (CamelCase)
		//		여러 단어를 결합해서 변수명을 지을 때는
		//		단어의 첫글자를 대문자로 한다. 단 첫번째 단어의 첫글자는 소문자이다.
		//		ex)bookIndex
		
		//변수를 선언하면 메모리에 변수의 타입이 필요로하는 만큼의 공간을 미리 확보한 뒤
		//기본값으로 채워둔다.
		//숫자형 
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//실수형
		float fnum;
		double dnum;
		
		//문자형
		char ch;
		//논리형
		boolean isTrue;
		
		//------------값 대입----------------
		//변수의 초기화 : 선언한 변수에 처음으로 값을 넣는 것.
		bnum = 1;
		System.out.println("bnum : " + bnum);
		snum = 2;
		System.out.println("snum : " + snum);
		inum = 4;
		System.out.println("inum : " + inum);
		
		//The literal 100000000000 of type int is out of range 
		//literal : 변수에 넣는 값 자체
		//literal은 int type이다.
		lnum = 20000000000L;
		System.out.println("lnum : " + lnum);
		
		//값 처리 규칙
		//1. 같은 자료형(타입)끼리 대입
		//2. 같은 자료형(타입)끼리 연산
		fnum = 4.0f;
		System.out.println("fnum : " + fnum);
		dnum = 5.0;
		System.out.println("dnum : " + dnum);
		isTrue = false;
		System.out.println("isTrue : " + isTrue);
		ch = 'A'; //초기화
		System.out.println("ch : " + ch);
		ch = 97;
		System.out.println("ch : " + ch);		
		
		//문자열 참조형 타입
		//String
		//참조형타입의 변수는 생성할 때 new연산자와 생성자함수를 사용하게 된다.
		//이를 인스턴스화라고 한다.
		
		//String str = new String("pclass");
		//String str;   //선언
		//str = "pclass"; //초기화
		
		//String은 참조형 타입이지만 많이 사용되기 때문에 기본형처럼
		//literal로 변수에 값을 담을 수 있는 특권을 가짐
		String str = "pclass"; //선언 + 초기화
		System.out.println("str : " + str);
		 
		
		
		
		
		

	}
}
