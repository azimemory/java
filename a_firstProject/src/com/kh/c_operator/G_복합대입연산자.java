package com.kh.c_operator;

public class G_복합대입연산자 {
	//다른 연산자와 대입연산자를 함께 사용하는 연산자
	// +, -, *, / , %
	// =
	// +=, -=, *=, /=, %=
	public static void main(String[] args) {
		G_복합대입연산자 test = new G_복합대입연산자();
		test.opTest();
	}
	
	public void opTest() {
		
		int num = 12;
		//대입연산자와 산술연산자를 따로!
		num = num + 12;  //24
		System.out.println("num = num + 12 = " + num);
		
		//복합대입연산자를 사용. 메모리에서 직접 연산을 수행하여 연산속도가 빠르다.
		num += 12; // 36
		System.out.println("num += 12 = " + num);
		
		num -= 5; // 31
		System.out.println("num -= 5 = " + num);
		
		num *= 2; // 62
		System.out.println("num *= 2 = " + num);
		
		num /= 2; // 31
		System.out.println("num /= 2 = " + num);
		
		num %= 2; // 1
		System.out.println("num %= 2 = " + num);
		
		
		
		
		
		
	}

}
