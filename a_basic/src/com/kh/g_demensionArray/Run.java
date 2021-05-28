package com.kh.g_demensionArray;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		DemensionArray test = new DemensionArray();
		test.testDemensionArray();
//		//test.testDemensionArray2();
		
		DemensionArrayPrac testPrac = new DemensionArrayPrac();
		//testPrac.quize2();
		
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		int[] c = {1,2,3};
		
		int[] res = testPrac.quizeAboutEllipsis(a,b,c);
		//System.out.println(Arrays.toString(res));
	}
}
