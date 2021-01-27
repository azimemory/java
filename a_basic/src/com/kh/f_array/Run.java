package com.kh.f_array;
import java.util.Arrays;

import com.kh.f_array.study.B_arrayPrac;
import com.kh.f_array.util.ArrayUtil;

public class Run {

	public static void main(String[] args) {
		//A_array test = new A_array();
		//test.quizeArray();
		
		ArrayUtil util = new ArrayUtil();
		int[] testArr = {1,2,3,4,5};
		
		//add 메서드의 결과로 반환되는 새로운 배열의 주소를 testArr 변수에 담아준다.
		testArr = util.add(testArr, 10);
		System.out.println("데이터 추가 :  " + Arrays.toString(testArr));
		
		
		//addAll 메서드 테스트
		//첫번째 배열
		int[] firstArr = {1,2,3,4,5};
		//두번째 배열
		int[] secondArr = {1,2,3,4,5};
		//두 배열을 합쳐주자
		int[] testAddAll = util.addAll(firstArr, secondArr);
		System.out.println("두 배열을 합쳤다 : " + Arrays.toString(testAddAll));
		
		
		//subArr 메서드 테스트
		int[] testSubArr = util.subArr(firstArr, 0, 2);
		System.out.println("\nfirstArr의 0~1번 인덱스의 값 : " + Arrays.toString(testSubArr));
		
		
		//remove 메서드 테스트
		int[] testRemove = util.remove(secondArr, 2);
		System.out.println("\nsecondArr의 2번 인덱스를 삭제 : " + Arrays.toString(testRemove));
		
		
		System.out.println("================================================================");
		
		B_arrayPrac testArrayPrac = new B_arrayPrac();
		//testArrayPrac.test1();
		testArrayPrac.test2();
		
		
		
		
		
		
				
		
	}
}
