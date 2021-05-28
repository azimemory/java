package com.kh.f_array;
import java.util.Arrays;

import com.kh.f_array.study.A_array;
import com.kh.f_array.study.B_arrayPrac;
import com.kh.f_array.util.ArrayUtil;

public class Run {

	public static void main(String[] args) {
		A_array test = new A_array();
		//test.quizeArray();
		
		ArrayUtil util = new ArrayUtil();
		int[] testArr  = {1,2,3,4,54};
		
		System.out.println(Arrays.toString(util.remove(testArr, 2)));
		
	}
}
