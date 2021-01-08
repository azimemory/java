package com.kh.f_array.study;

import java.util.Arrays;
import java.util.Scanner;

public class A_array {
	
	Scanner sc = new Scanner(System.in);
	
	public void testArray() {
		//배열 : 같은 타입의 데이터들을 하나의 묶음으로 다루는 것
		//		각 데이터들은 해당 데이터에 접근할 수 있도록 인덱스 번호가 부여된다.
		//      배열은 참조자료형으로 heap영역에 저장된다.
		// 		참조형 변수(reference)를 통해 배열에 접근할 수 있고, 인덱스를 통해 배열 안의 데이터에 접근할 수 있다.
		
		//배열 생성해보기
		String[] sArr = new String[5]; //String 타입의 데이터 5개를 보관할 수 있는 배열 생성.
		sArr[0] = "치킨"; //0번 인덱스의 변수방에 치킨을 저장
		sArr[1] = "족발"; //1번 인덱스에 족발을 저장
		sArr[2] = "감자튀김"; //2번 인덱스에 감자튀김을 저장
		sArr[3] = "군고구마"; //3번 인덱스에 군고구마 저장
		sArr[4] = "탕수육"; //4번 인덱스에 탕수육 저장
		
		//저장한 데이터는 인덱스로 접근해 꺼내올 수 있다.
		System.out.println("sArr : " + sArr);
		System.out.println("sArr[3] : " + sArr[3]);
	}
	
	public void testArray2() {
		//배열을 사용하는 이유
		//타입이 같은 복수의 데이터를 편하게 다루기 위해.
		
		int sum = 0;
		int arrSum = 0;
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;

		//num1 ~ num5 의 합계를 sum에 저장
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		System.out.println("num1~num5 까지의 합계 : " + sum);
		
		//배열을 사용한다면?
	
		/*
		 * int[] iArr = new int[5];
		 * iArr[0] = 10;
		 * iArr[1] = 20;
		 * iArr[2] = 30;
		 * iArr[3] = 40;
		 * iArr[4] = 50;
		 */
		 
		
		int[] iArr = {10,20,30,40,50};
		//Array.length : 배열의 크기를 가지고 있는 변수
		//System.out.println(iArr.length) -> 5 출력 
		for(int i = 0; i < iArr.length; i++) {
			arrSum += iArr[i];
		}
		
		System.out.println("iArr[0] ~ iArr[4] 까지의 합계 : " + arrSum);
	}
	
	public void testArray3() {
		
		//배열의 선언과 동시에 초기화
		int[] iArr = new int[] {5,4,3,2,1};
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i]);
		}
		
		System.out.println();
		
		//배열을 리터럴로 초기화.(String 처럼 특별대우를 받는 타입)
		int[] iArr2 = {1,2,3,4,5};
		for(int i = 0; i < iArr2.length; i++) {
			System.out.print(iArr2[i]);
		}
	}
	
	public void testArray4() {
		//배열의 크기는 변수로도 지정할 수 있다.
		int size = 10;
		int[] iArr = new int[size];
		
		//사용자로부터 배열의 크기를 입력받아서 배열을 생성
		System.out.print("배열의 크기 : ");
		int input = sc.nextInt();
		int[] iArr2 = new int[input];
		
		System.out.println("생성된 배열의 크기 : " + iArr2.length);
	}
	
	public void testArray5() {
		//얕은복사
		String[] foodArr = {"치킨","피자","감자튀김","스테이크","초밥"};
		//대입연산자는 stack영역에 있는 값을 넘겨준다.
		String[] copyArr = foodArr; // stack영역의 foodArr변수방에는 주소가 저장되어있다.
		
		//foodArr의 2번 인덱스를 "장어덮밥"으로 수정
		foodArr[2] = "장어덮밥";
		
		System.out.println("=================================");
		
		System.out.println("foodArr 주소 : " + System.identityHashCode(foodArr));
		for(int i = 0; i < foodArr.length; i++) {
			System.out.print(foodArr[i] + " ");
		}
		
		System.out.println("\n=================================");
		System.out.println("\ncopyArr 주소 : " + System.identityHashCode(copyArr));
		// java.util.Arrays : 배열을 쉽게 다루기 위한 기능들을 제공 해주는 클래스
		System.out.println(Arrays.toString(copyArr));
		System.out.println("\n=================================");
		
		//true가 출력된다.
		System.out.println("foodArr == copyArr : " + (foodArr == copyArr));

		copyArr[3] = "김밥";
		for(int i = 0; i < foodArr.length; i++) {
			System.out.print(foodArr[i] + " ");
		}
	}
	
	public void testArray6() {
		//깊은 복사
		String[] foodArr = {"치킨","피자","감자튀김","스테이크","초밥"};
		String[] copyArr = new String[foodArr.length];
		
		for(int i = 0; i < foodArr.length; i++) {
			copyArr[i] = foodArr[i];
		}
		
		foodArr[2] = "장어덮밥";
		System.out.println("foodArr 주소 : " + System.identityHashCode(foodArr));
		System.out.println(Arrays.toString(foodArr));
		System.out.println("copyArr 주소: " + System.identityHashCode(copyArr));
		System.out.println(Arrays.toString(copyArr));
		//false가 출력된다.
		System.out.println("foodArr == copyArr : " + (foodArr == copyArr));
	}
	
	public void testArray7() {
		//second에 있는 값을 first에, first에 있는 값을 second에 넣어주세요.
		//단 리터럴로 직접 대입하는 방법은 금지입니다.
		int first = 10;
		int second = 20;
		
		//임시변수에 first의 값을 저장
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println("first : " + first + " / second : " + second);
		
		//iArr의 0번 인덱스와 1번 인덱스의 자리를 바꿔주세요.
		//iArr[0] = 2
		//iArr[1] = 1
		
		//임시변수에 iArr[0] 값을 저장
		int[] iArr = {1,2};
		temp = iArr[0];
		//iArr[0]에 iArr[1] 값을 저장
		iArr[0] = iArr[1];
		//iArr[1]에 temp의 값을 저장
		iArr[1] = temp;
		
		//iArr 출력
		System.out.println(Arrays.toString(iArr));
	}
	
	//배열 오름차순으로 정렬하기
	public void quizeArray() {
		int[] iArr = {5,3,4,1,2};
		//iArr을 오름차순으로 정렬 ->[1,2,3,4,5]
		
		System.out.println("정렬 전 :  " + Arrays.toString(iArr));
		
		//앞에서 두번째 칸까지 정렬이 마무리 되어야 배열의 정렬이 완성
		//필요한 반복 횟수는 배열의 크기 - 1 
		for(int i = 0; i < iArr.length - 1; i++) {
			//한 회차가 반복 될때 마다 앞의 인덱스와 뒤의 인덱스를 비교해야 하는 횟수는
			//1씩 줄어들게 된다.
			for(int j = 0; j < iArr.length - 1 - i; j++) {
				//앞의 인덱스와 뒤의 인덱스를 비교해서 앞의 인덱스가 값이 더 크다면
				if(iArr[j] > iArr[j+1]) {
					//자리를 바꿔주자
					int temp = iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = temp;
				}
			}
		}
		
		System.out.println("정렬 후 :  " + Arrays.toString(iArr));

		//시작 1회차
		//5,3,4,1,2
		//0번 인덱스와 1번 인덱스 비교 -> 5 > 3 -> 자리바꿈 발생
		//3,5,4,1,2  
		//1번 인덱스와 2번 인덱스 비교 -> 5 > 4 -> 자리바꿈 발생
		//3,4,5,1,2  
		//2번 인덱스와 3번 인덱스 비교 -> 5 > 1 -> 자리바꿈 발생
		//3,4,1,5,2
		//3번 인덱스와 4번 인덱스 비교 -> 5 > 2 -> 자리바꿈 발생
		//3,4,1,2,5
		
		//시작 2회차
		//3,4,1,2,5
		//0번 인덱스와 1번 인덱스 -> 3 < 4 -> 자리바꿈 발생 x
		//3,4,1,2,5
		//1번 인덱스와 2번 인덱스 -> 4 > 1 -> 자리바꿈 발생 
		//3,1,4,2,5
		//2번 인덱스와 3번 인덱스 -> 4 > 2 -> 자리바꿈 발생
		//3,1,2,4,5
		
		//시작 3회차
		//3,1,2,4,5
		//0번 인덱스와 1번 인덱스 -> 3 > 1 -> 자리바꿈 발생
		//1,3,2,4,5
		//1번 인덱스와 2번 인덱스 -> 3 > 2 -> 자리바꿈 발생
		//1,2,3,4,5
		
		//시작 4회차
		//1,2,3,4,5
		//0번 인덱스와 1번인덱스 -> 1 < 2 -> 자리바꿈 발생 x
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
