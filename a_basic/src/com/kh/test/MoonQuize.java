package com.kh.test;

import java.util.Scanner;

public class MoonQuize {
	
	//필드변수
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MoonQuize test = new MoonQuize();
		//test.example3();
		test.quizeop2();
	}
	
	//QuizeVar 3번 
	//영어 문자열 값을 키보드로 입력 받아 각 자리의 문자를 출력하시오.
	public void example3() {
		//사용자로부터 문자열 하나 입력
		System.out.print("영어 문자열 입력 : ");
		String input = sc.nextLine();
		
		//입력 받은 값 출력
		System.out.println("입력값 : " + input);
		
		//String 클래스의 charAt(idx) 
		//첫번째, 두번째 세번째 문자 출력
		System.out.println("첫번째 글자 : " + input.charAt(0));
		System.out.println("두번째 글자 : " + input.charAt(1));
		System.out.println("세번째 글자 : " + input.charAt(2));
		
		//String 클래스의 length() : 문자열의 길이를 반환
		int strLength = input.length();
		System.out.println("문자열의 길이 : " + strLength);
	}
	
	//사용자로부터 국어, 영어, 수학 점수를 입력 받아
	//총점, 평균을 구하고
	//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상이면 합격,
	//아니면 불합격 처리하시오.
	public void sample1() {
		//국어, 영어, 수학 점수를 사용자로부터 입력받음
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		//총점, 평균 구하기
		int total = kor + eng + math;
		double avg = total/3;
		
		//String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60?"합격":"불합격";
		//3항연산자 [표현식]: 조건식? 값 또는 연산 : 값 또는 연산
		String result = "";
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		
		System.out.println(kor + " , " + eng + " , " + math + " , " + avg+ " , " + result);
	}
	
	public void scannerBufferTest() {
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		//Scanner의 nextLine()을 제외한 메서드들은 키보드로 입력받은 값을 반환할 때
		// \r\n을 기준으로 끊어서 \r\n의 앞 문자까지만 반환한다.
	
		//Scanner nextLine()메서드는 \r\n을 만나면 \r\n을 포함한 문자열을 반환한다.
		
		// 입력할때 enter를 입력하면, 줄바꿈문자가 Scanner의 버퍼에 저장이 된다.
		// ex) 가격 : 10000 -> enter 입력 >>> Scanner에는 10000\r\n 형태로 저장 
		// 		>>> 반환하면 10000을 반환하고 Scanner 버퍼안에는 \r\n 이 남아있다.
		//      nextLine() 메서드를 호출하면, 버퍼안에 반환할 \r\n 값이 있기 때문에
		//		남아있는 \r\n을 반환하고 메서드 종료
		
		//따라서 버퍼값을 비워줘야 한다.
		sc.nextLine();
		
		System.out.print("상품명 : ");
		String product = sc.nextLine();
		
		System.out.println(product + "의 가격은 " + price + "입니다.");
	}
	
	//학생이름, 학년, 반, 번호, 성별, 성적을 입력 받은 후 출력하시오
	//성별은 'M'이 입력되면 '남학생' 'F'가 입력되면 '여학생'을 출력하시오
	//성적은 소수점 둘째자리까지 입력 받으시오
	public void quizeop2() {
		
		System.out.print("학생이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		String year = sc.next();
		System.out.print("반 : ");
		int classNo = sc.nextInt();
		System.out.print("번호 : ");
		int no = sc.nextInt();
		System.out.print("성별(남:M/여:F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점아래 둘째자리까지 입력) : " );
		double score = sc.nextDouble();
		
		System.out.println("이름은 " +  name
				+ " 학년은 " + year + "학년, "
				+ " 반은 " + classNo + "반, "
				+ " 번호는 " + no + "번, "
				+ " 성별은 " + (gender == 'M'?"남":"여") + "학생, "
				+ " 성적이 " + score + "이다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
