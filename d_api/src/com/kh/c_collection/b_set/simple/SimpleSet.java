package com.kh.c_collection.b_set.simple;

import java.util.Iterator;

public class SimpleSet<E> implements Iterable<E>{
	
	//배열의 초기크기
	private int arraySize = 17;
	private Object[] simpleSet;
	//배열안에 들어간 요소들 개수
	private int size = 0;
	
	public SimpleSet() {
		simpleSet = new Object[arraySize];
	}
	
	public SimpleSet(int arraySize) {
		this.arraySize = arraySize;
		simpleSet = new Object[arraySize];
	}
	
	//해쉬함수 작성
	//해싱 : 입력받은 값을 일정한 자리수의 다른 값으로 변환하는 것
	// 해싱의 기본원칙 : 같은 값이 입력되면 늘 같은 값으로 변환되어야 한다.
	//				다른 값을 넣으면 해싱값은 반드시 달라야 한다.
	//				-> 불가능, 다른 값을 넣었는데 같은 해싱값이 반환되는 것을 해쉬충돌이라 한다.
	
	//우리가 만들 해쉬함수 : 사용자가 입력한 데이터를 Object배열의 인덱스로 해싱
	//만약 배열의 크기가 현재 17일 경우 해싱값의 범위는 0~16
	private int simpleHashMethod(E data) {
		//인스턴스를 식별할 수 있는 숫자값을 hashCode 메서드를 통해 반환 받는다.
		//hashCode의 결과값은 음수가 나오기도 한다. 인덱스는 음수일 수 없다.
		//Math.abs : 절대값으로 변환해주는 메서드
		int res = Math.abs(data.hashCode());
		
		//res를 배열의 크기로 나눈 나머지를 구한다.
		//나머지는 0 ~ (나누는 수-1) 사이의 값이기 때문이다.
		res %= arraySize;
		return res;
	}
	
	public void add(E data) {
		
		if(size < arraySize) {
			//배열의 몇번 인덱스에 data를 저장할지 결정
			int index = simpleHashMethod(data);
			if(simpleSet[index] == null) {
				simpleSet[index] = data;
				size++;
			}
		}else {
			//배열의 크기를 두배로 확장
			arraySize *= 2;
			Object[] tempArr = new Object[arraySize];
			for(int i = 0; i < simpleSet.length; i++) {
				tempArr[i] = simpleSet[i];
			}
			//simpleSet의 레퍼런스에 두배 확장한 배열을 옮겨담고
			simpleSet = tempArr;
			
			//확장한 크기로 인덱스를 구한다.
			int index = simpleHashMethod(data);
			//만약 배열의 값이 null일 때만
			if(simpleSet[index] == null) {
				//데이터를 추가하고
				simpleSet[index] = data;
				//배열의 크기를 1 증가
				size++;
			}
		}
	}
	
	public E remove(E data) {
		//해당 data가 몇번 인덱스에 있는 지 확인
		int index = simpleHashMethod(data);
		//삭제 될 값을 미리 저장
		E res = (E) simpleSet[index];
		//삭제
		simpleSet[index] = null;
		
		return res;
	}

	@Override
	public Iterator<E> iterator() {		
		return new Iterator<E>() {
			
			//Iterator로 반환한 요소의 개수
			private int iterIdx;
			//Object[]안에서 실제로 탐색한 인덱스
			private int setIdx;

			@Override
			public boolean hasNext() {
				if(iterIdx < size) {
					return true;
				}
				return false;
			}

			@Override
			public E next() {
				//null이 아닌 데이터를 탐색
				while(simpleSet[setIdx] == null) {
					setIdx++;
				}
				
				//setIdx에 있는 데이터를 반환
				E res = (E)simpleSet[setIdx];
				//데이터가 있는 인덱스의 다음 인덱스가 되게끔 1 증가
				setIdx++;
				//반환한 개수 증가
				iterIdx++;
				
				return res;
			}
		};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
