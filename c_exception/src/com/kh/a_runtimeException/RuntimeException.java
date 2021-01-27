package com.kh.a_runtimeException;

import java.util.Scanner;

public class RuntimeException {
	
	// 예외(Exception) : 
	//		 Compile Exception : 자바 문법 상의 예외, 이클립스가 빨간 줄로 표시해주는 예외
	//		 Runtime Exception : 실행 상황에서 발생하는 예외
	
	//		 Checked Exception : 코드로 대비가 불가능하기 때문에, 예외처리(후속처리)를 강제하는 예외
	//		 UnChecked Exception : 코드로 대비가 가능, 예외처리를 강제하지 않음.
	
	// 예외처리 방법
	// 1. 조건문 : 조건문을 사용해 예외가 발생할 수 있는 상황을 미리 회피
	// 2. try-catch문 : try{}으로 예외가 발생할 수 있는 코드를 감싸고, catch{} 에는
	//				예외상황이 발생할 경우 처리할 후속조치를 작성
	// 3. try-catch-finally : finally블록에 예외가 발생하든 발생하지 않든 반드시 실행할 코드를 작성
	
	Scanner sc = new Scanner(System.in);
	
	//1. if문으로 예외처리
	public void arithEx() {
		//숫자를 0으로 나눠 ArithmeticException을 발생시켜보자.
		
		int ran = 0;
		double result;
		
		//사용자가 입력한 수를 0~3사이의 난수로 나누는 코드
		while(true) {
			//제수 : 나누는 수 , 피제수 : 나누어지는 수
			System.out.print("피제수를 하나 정수로 입력하세요 : ");
			int inputNum = sc.nextInt();
			//0~3사이의 랜덤한 수로 제수를 지정
			ran = (int)(Math.random() * 4);
			
			if(ran != 0) {
				result = inputNum/ran;
				System.out.println(ran + "으로 나눈 결과 : " +  result);
			}else {
				System.out.println("숫자는 0으로 나눌 수 없습니다.");
			}
		}
	}
	
	//2. try-catch문으로 예외처리
	public void arithEx2() {
		//숫자를 0으로 나눠 ArithmeticException을 발생시켜보자.
		int ran = 0;
		double result;
		
		//사용자가 입력한 수를 0~3사이의 난수로 나누는 코드
		while(true) {
			//제수 : 나누는 수 , 피제수 : 나누어지는 수
			System.out.print("피제수를 하나 정수로 입력하세요 : ");
			int inputNum = sc.nextInt();
			
			//0~3사이의 랜덤한 수로 제수를 지정
			ran = (int)(Math.random() * 4);
			
			try {
				//try블록에서 예외가 발생하면 즉시 catch블록의 코드가 실행
				result = inputNum/ran;
				System.out.println(ran + "으로 나눈 결과 : " + result);
			//발생할 수 있는 예외의 레퍼런스를 catch()에 작성
			//try블록에서 예외가 발생하면 해당 예외의 인스턴스를 catch의 레퍼런스에 넣어준다.
			}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("숫자는 0으로 나눌 수 없습니다.");
			}
		}
	}
	
	//3. try-catch-finally 문으로 예외처리
	public void arithEx3() {
		//숫자를 0으로 나눠 ArithmeticException을 발생시켜보자.
		int ran = 0;
		double result;
		
		//사용자가 입력한 수를 0~3사이의 난수로 나누는 코드
		while(true) {
			//제수 : 나누는 수 , 피제수 : 나누어지는 수
			System.out.print("피제수를 하나 정수로 입력하세요 : ");
			int inputNum = sc.nextInt();
			
			//0~3사이의 랜덤한 수로 제수를 지정
			ran = (int)(Math.random() * 4);
			
			try {
				//try블록에서 예외가 발생하면 즉시 catch블록의 코드가 실행
				result = inputNum/ran;
				System.out.println(ran + "으로 나눈 결과 : " + result);
			//발생할 수 있는 예외의 레퍼런스를 catch()에 작성
			//try블록에서 예외가 발생하면 해당 예외의 인스턴스를 catch의 레퍼런스에 넣어준다.
			}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("숫자는 0으로 나눌 수 없습니다.");
			//예외가 발생하든 발생하지 않든 실행되는 블록
			}finally {
				System.out.println("finalBlock");
			}
		}
	}
	
	
	//try문 안에서 발생하는 여러개의 예외를 처리하는 방법
	public void classNArrayEx() {
		
		try {
			//ClassCastException
			Object obj = new Object();
			//String str = (String)obj;
			
			//ArrayIndexOutOfBoundsException
			int[] arr = new int[2];
			//arr[2] = 3;
			
			//NullPointerException
			String nullStr = null;
			nullStr.charAt(2);
		
		//자바 1.7 이전 코드	
		/*} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}*/
		
		//다형성을 활용
		/*} catch(Exception e) {
			System.out.println(e.getMessage());
		}*/
		
		//자바 1.7이후 코드
		}catch(ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
