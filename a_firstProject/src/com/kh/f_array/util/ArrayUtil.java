package com.kh.f_array.util;

public class ArrayUtil {
	
	// 배열 -> int[]
	
	//매개변수로 전달 받은 배열을 오름차순으로 정렬하는 메서드
	public void sort(int[] iArr) {
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
	}
	
	//첫번째 매개변수로 넘어온 배열에, 두번째 매개변수로 넘어온 값을 추가해
	//그 배열을 반환하는 메서드
	public int[] add(int[] iArr, int data) {
		//int[] testArr = {1,2,3,4,5};
		//배열의 크기가 5로 생성된 testArr에 6개의 데이터를 담아야 하는 경우가 발생
		//testArr[5] = 19; //실행할 때 에러가 발생하는 runtime에러 발생
						//코드를 작성할 때 생기는 빨간 줄 -> compile에러
		
		//기존의 배열보다 크기가 1 큰 배열을 생성
		int[] resArr = new int[iArr.length + 1];
		
		//배열의 값들을 복제
		for(int i = 0; i < iArr.length; i++) {
			resArr[i] = iArr[i];
		}
		
		//두번째 매개변수로 넘어온 값을 새로운 배열의 마지막 인덱스에 추가
		resArr[resArr.length-1] = data;
		return resArr;
	}
	
	//기능 : 매개변수로 넘어온 두 배열을 하나의 배열로 합쳐 반환하는 메서드
	//메서드 이름 : addAll
	//메서드를 작성하고 Run 클래스에 테스트까지 완료 해주세요.
	//ex) int[] data = {1,2,3,4,5}
	//	  int[] data2 = {6,7,8,9,0}
	//    util.addAll(data,data2) -> [1,2,3,4,5,6,7,8,9,0]
	//난이도 : ***
	public int[] addAll(int[] firstArr, int[] secondArr) {
		
		//두 배열의 크기를 합친 크기의 배열을 새로 생성
		int[] res = new int[firstArr.length + secondArr.length];
		
		//첫번째 배열에 있는 값을 새로 만든 배열에 복제
		for(int i = 0; i < firstArr.length; i++) {
			//새로 만든 배열의 0 ~ 첫번째 배열의 크기 - 1 인덱스까지 첫번째 배열의 값들로 채워진다.
			res[i] = firstArr[i];
		}
		
		//두번째 배열에 있는 값을 새로 만든 배열에 복제
		for(int i = 0; i < secondArr.length; i++) {
			//첫번째 배열의 크기 인덱스 ~ 새로 만든 배열의 마지막 인덱스 까지 채워 넣으면 된다.
			res[firstArr.length + i] = secondArr[i];
		}
		
		return res;
	}

	
	//기능 : 원하는 인덱스 구간의 데이터를 잘라내어 새로운 배열로 만들어 반환하는 메서드
	//인덱스 구간 : 시작 인덱스~ 끝 인덱스의 앞 인덱스까지의 데이터
	//첫번째 매개변수 : 배열
	//두번째 매개변수 : 시작 인덱스
	//세번째 매개변수 : 끝 인덱스
	//메서드 명 : subArr
	//난이도 : **~***
	//ex) int[] data = {1,2,3,4,5}
	//	util.subArr(data,0,2); -> [1,2]
	public int[] subArr(int[] iArr, int beginIdx, int endIdx) {
		
		//beginIdx부터 endIdx 앞 까지 데이터들을 담을 새로운 배열 생성
		//새로운 배열의 크기 : endIdx - beginIdx
		int[] res = new int[endIdx - beginIdx];
		
		//beginIdx부터 endIdx 사이에 있는 값들을 
		//새로운 배열에 옮겨 담는다.
		for(int i = 0; i < res.length; i++) {
			res[i] = iArr[beginIdx+i];
		}
		
		//새로운 배열을 반환
		return res;
	}
	
	//기능 : 원하는 인덱스의 데이터를 삭제하고
	//배열의 크기를 다시 조정해 반환하는 메서드
	//첫번째 매개변수 : 배열
	//두번째 매개변수 : 인덱스
	//메서드 명 : remove
	//난이도 : ****
	//ex) int[] data = {1,2,3,4,5};
	//    util.remove(data,2) -> [1,2,4,5]
	public int[] remove(int[] iArr, int idx) {
		//매개변수로 넘어온 배열보다 크기가 1작은 새로운 배열 생성
		int[] res = new int[iArr.length -1];
		
		//iArr의 값들을 res로 옮겨 담는다.
		for(int i = 0; i < res.length; i++) {
			if(i < idx) {
				res[i] = iArr[i];
			}else {
				//매개변수로 넘어온 idx 의 인덱스 데이터 차례가 되면
				//해당 데이터는 건너뛰고 다음 데이터를 옮겨 담는다.
				res[i] = iArr[i+1];
			}
		}
		
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
