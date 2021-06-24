package com.review.googoodan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GooGooDan {

	public static void main(String[] args) {
		no10();
	}
	
	public static void no1() {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println( i + " * " + j + "=" + i*j);
			}
		}
	}
	
	public static void no2() {
		
		int[][] googooArr = new int[9][9];
		
		for (int i = 0, n = 1; i < googooArr.length; i++, n++) {
			for(int j = 0, m = 1; j < googooArr[i].length; j++, m++) {
				googooArr[i][j] = n*m;
			}
		}
		
		for (int i = 0; i < googooArr.length; i++) {
			System.out.println(Arrays.toString(googooArr[i]));
		}
	}
	
	public static void no3() {
		int[][] googooArr = new int[4][9];
		
		for (int i = 0, n = 1; i < googooArr.length; i++, n+=2) {
			for (int j = 0, m = 1; j < googooArr[i].length; j++, m++) {
				googooArr[i][j] = n*m;
			}
		}
		
		for (int i = 0; i < googooArr.length; i++) {
			System.out.println(Arrays.toString(googooArr[i]));
		}
	}
	
	public static void no4() {
		int[][] googooArr = new int[4][9];
		
		for (int i = 0, n = 2; i < googooArr.length; i++, n+=2) {
			for (int j = 0, m = 1; j < googooArr[i].length; j++, m++) {
				googooArr[i][j] = n*m;
			}
		}
		
		for (int i = 0; i < googooArr.length; i++) {
			System.out.println(Arrays.toString(googooArr[i]));
		}
	}
	
	public static void no5() {
		int[][] googooArr = new int[4][4];
		
		for (int i = 0, n = 2; i < googooArr.length; i++, n+=2) {
			for (int j = 0, m = 2; j < googooArr[i].length; j++, m+=2) {
				googooArr[i][j] = n*m;
			}
		}
		
		for (int i = 0; i < googooArr.length; i++) {
			System.out.println(Arrays.toString(googooArr[i]));
		}
	}
	
	public static void no6() {
		int[][] googooArr = new int[4][4];
		
		for (int i = 0, n = 3; i < googooArr.length; i++, n+=2) {
			for (int j = 0, m = 1, o = 2; j < googooArr[i].length; j++) {
				if((j+1)%2 == 0) {
					googooArr[i][j] = n*o;
					o+=2;
				}else {
					googooArr[i][j] = n*m;
					m+=2;
				}
			}
		}
		
		for (int i = 0; i < googooArr.length; i++) {
			System.out.println(Arrays.toString(googooArr[i]));
		}
	}
	
	public static void no7() {
		Set<Integer> googooSet = new HashSet<Integer>();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <10; j++) {
				googooSet.add(i*j);
			}
		}
		
		System.out.println("중복 제거한 결과 값 : " + googooSet.size());
	}
	
	public static void no8() {
		Set<Integer> googooSet = new HashSet<Integer>();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <10; j++) {
				googooSet.add(i*j);
			}
		}
		
		int multiplesOfTwoCnt = 0;
		int multiplesOfThreeCnt = 0;
		
		for (Integer integer : googooSet) {
			if(integer % 2 == 0) {
				multiplesOfTwoCnt++;
			}
		}
		
		for (Integer integer : googooSet) {
			if(integer % 3 == 0) {
				multiplesOfThreeCnt++;
			}
		}
		
		System.out.println("2의 배수의 숫자 : " + multiplesOfTwoCnt);
		System.out.println("3의 배수의 숫자 : " + multiplesOfThreeCnt);
	}
	
	public static void no9() {
		Set<Integer> googooSet = new HashSet<Integer>();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <10; j++) {
				googooSet.add(i*j);
			}
		}
		
		Set<Integer> multiplesOfTwoSet = new HashSet<Integer>();
		Set<Integer> multiplesOfThreeSet = new HashSet<Integer>();
		
		for (Integer integer : googooSet) {
			if(integer % 2 == 0) {
				multiplesOfTwoSet.add(integer);
			}
		}
		
		for (Integer integer : googooSet) {
			if(integer % 3 == 0) {
				multiplesOfThreeSet.add(integer);
			}
		}
		
		multiplesOfTwoSet.retainAll(multiplesOfThreeSet);
		for (Integer integer : multiplesOfTwoSet) {
			System.out.print(integer + " ");
		}
	}
	
	public static void no10() {
		List<Integer> googooList = new ArrayList<Integer>();
		List<Integer> res = new ArrayList<Integer>();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <10; j++) {
				googooList.add(i*j);
			}
		}
		
		for (Integer integer : googooList) {
			
			int ten = integer/10;
			int one = integer%10;
			res.add(ten+one);
		}
		
		res.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		System.out.println("10의 자리수와 1의 자리수의 합 : " + res.get(0));
		System.out.println(res);
	}
	

	
	
	
	
	
	
	
	
}
