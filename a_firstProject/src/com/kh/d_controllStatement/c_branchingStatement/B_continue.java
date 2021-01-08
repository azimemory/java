package com.kh.d_controllStatement.c_branchingStatement;

public class B_continue {
	
	//continue : 사용하면 즉시 조건식(while) 또는 증감식(for)으로 돌아간다.
	public static void main(String[] args) {
		B_continue test = new B_continue();
		test.testContinue();
	}
	
	public void testContinue() {
		//1~10까지 정수들의 합계를 출력
		//단 4의 배수는 제외하고 계산
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			if(i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1~10까지의 합계 그런데 4의 배수는 제외한 : " + sum);
	}
	
	public void quize() {
		int sum = 0;
		int i = 1;
		while(i < 11) {
			if(i % 4 == 0) {
				i++;
				continue;
			}
			sum += i;
			i++;
		}
		System.out.println("sum : " + sum);
	}
	
	
	
	
	
	
	
	
}
