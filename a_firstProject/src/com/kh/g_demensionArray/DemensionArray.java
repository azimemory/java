package com.kh.g_demensionArray;

public class DemensionArray {
	
	public void testDemensionArray() {
		
		//2차원 배열은 배열을 여러개 가지고 있는 배열의 배열이다.
		//2차원 배열 선언
		int[][] doubleArr;
		
		//가능하지만 권하지는 않음
		//int[] doubleArr[]; 
		int doubleArr2[][]; //권장하지 않음

		//2차원 배열의 메모리 할당
		//크기가 4인 int[] 3개를 가지는 2차원 배열
		doubleArr = new int[3][4];
		//주소 배열의 크기가 3
		//데이터를 저장할 int[] 크기는 4
		//quize! 이때 heap 영역에 생성되는 배열의 개수 ?
		//정답 : 4 -> 배열을 저장할 주소 배열 1개, int[] 3개
		
		//2차원배열 초기화
		//주소배열의 0번 인덱스에 참조되어있는
		//int[] 0번 인덱스에 값을 1 넣음
		doubleArr[0][0] = 1;
		doubleArr[0][1] = 2;
		doubleArr[0][2] = 3;
		doubleArr[0][3] = 4;
		//doubleArr[0][4] = 5; -> indexOutofBoundsException  
		
		//주소배열의 1번 인덱스에 참조되어있는
		//int[] 0번 인덱스에 값을 5 넣음
		doubleArr[1][0] = 5;
		doubleArr[1][1] = 6;
		doubleArr[1][2] = 7;
		doubleArr[1][3] = 8;
		
		//주소배열의 2번 인덱스에 참조되어있는
		//int[] 0번 인덱스에 값을 9 넣음
		doubleArr[2][0] = 9;
		doubleArr[2][1] = 10;
		doubleArr[2][2] = 11;
		doubleArr[2][3] = 12;
		
		//2차원 배열의 주소 및 값 출력
		System.out.println("doubleArr 변수에 담겨 있는 주소 값 : " + doubleArr); //주소배열의 주소
		System.out.println("주소배열의 0번 인덱스에 담겨있는 주소 값 : " + doubleArr[0]); //배열의 주소
		System.out.println("주소배열의 0번 인덱스로 참조되는 배열의 0번 인덱스의 값 : " + doubleArr[0][0]);
		
		//반복문을 활용한 2차원 배열의 출력
		
		//주소배열의 길이 만큼 바깥쪽 반복문 반복
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.println("주소배열의 " + i + "번 인덱스에 담겨 있는 배열");
			//주소배열의 해당 인덱스 길이만큼 안쪽 반복문 반복
			for(int j = 0; j < doubleArr[i].length; j++) {
				//값 출력
				System.out.print(doubleArr[i][j]);
			}
			System.out.println("\n=================================");
		}
		
		//doubleArr2를 주소배열의 크기 10, int[]의 크기 10으로 메모리를 할당하고
		//doubleArr2를 1~100까지의 수로 초기화 하세요.
		doubleArr2 = new int[10][10];
		int value = 1;
		for(int i = 0; i < doubleArr2.length; i++) {
			for(int j = 0; j < doubleArr2[i].length; j++) {
				doubleArr2[i][j] = value;
				value++;
			}
		}
		
		//doubleArr2 2차원배열안에 들어있는 모든 값을 출력해주세요.
		for(int i = 0; i < doubleArr2.length; i++) {
			for(int j = 0; j < doubleArr2[i].length; j++) {
				System.out.print(doubleArr2[i][j] + " ");	
			}
			System.out.println();
		}
	}
	
	public void testDemensionArray2() {
		//가변배열
		//주소배열의 크기는 지정하지만 값을 저장할 배열의 크기는 지정하지 않고 메모리를 할당
		int[][] doubleArr = new int[2][];
		doubleArr[0] = new int[3];
		doubleArr[1] = new int[2];
		
		//for문으로 2차원 배열 초기화
		//1~6 값을 저장
		int value = 1;
		for(int i = 0; i < doubleArr.length; i++) {
			for(int j = 0; j < doubleArr[i].length; j++) {
				doubleArr[i][j] = value++;
			}
		}
		
		//2차원배열 출력
		for(int i = 0; i < doubleArr.length; i++) {
			for(int j = 0; j < doubleArr[i].length; j++) {
				System.out.print(doubleArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
