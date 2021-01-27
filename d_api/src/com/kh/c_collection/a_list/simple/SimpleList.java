package com.kh.c_collection.a_list.simple;

import java.util.Iterator;

//Generic : 클래스 내부에서 사용하는 타입을 외부에서 결정하는 것.
//			인스턴스화 할 때 타입이 결정된다.
//			클래스명 뒤에 <E> 와 같은 형태로 Generic을 지정할 수 있다.
//			Generic은 어떤 알파벳으로든 지정할 수가 있지만, 주로 아래의 알파벳이 많이 사용된다.
//E : Element, 배열기반의 구조에서 Generic을 사용할 때 주로 E로 사용
//T : 일반적인 Type을 의미
//K : Map에서 Key의 타입을 Generic으로 지정할 경우 많이 사용
//V : Map에서 Value의 타입을 Genric으로 지정할 경우 많이 사용

//Generic은 한 클래스 내에서 여러개 지정이 가능.
//public class SimpleList<E,V> implements Iterable<E>

//Genric을 선언할 때 외부에서 지정할 Generic 타입에 제한을 걸 수 있다.
//<? extends List> List의 후손 타입만 Generic으로 지정이 가능
//<? super List> List의 선조 타입만 Generic으로 지정이 가능
//public class SimpleList<E extends List> {
public class SimpleList<E> implements Iterable<E>{
	
	//데이터를 저장할 Object 배열
	private Object[] simpleList;
	
	//이 배열의 초기크기
	private int arraySize = 10;
	
	//배열안에 저장된 요소의 개수
	private int size = 0;
	
	//기본생성자로 SimpleList를 생성할 경우 Object배열은 기본값(10)으로 생성
	public SimpleList() {
		simpleList = new Object[arraySize];
	}
	
	//매개변수로 넘어온 크기로 Object배열을 생성
	public SimpleList(int arraySize) {
		this.arraySize = arraySize;
		simpleList = new Object[arraySize];
	}
	
	//size()
	//리스트에 저장된 요소들의 개수를 반환하는 메서드
	public int size() {
		return size;
	}
	
	//1. add
	//List의 끝에 요소를 추가하는 메서드
	public void add(E data) {
		
		//현재 배열이 다차지 않은 경우
		if(size < arraySize) {
			simpleList[size] = data;
		//현재 배열이 다 찬 경우
		}else {
			//배열의 크기를 두 배 확장
			arraySize *= 2;
			Object[] tempArr = new Object[arraySize];
			//기존 배열에서 임시 배열로 데이터 복제
			for (int i = 0; i < simpleList.length; i++) {
				tempArr[i] = simpleList[i];
			}
			tempArr[size] = data;
			simpleList = tempArr;
		}
		
		//size 1증가
		size++;
	}
	
	//2. get
	public E get(int index) {
		if(index < size) {
			return (E)simpleList[index];
		}else {
			//만약 사용자가 범위를 벗어나는 index를 입력하면 예외발생
			//예외가 발생하면 메서드를 탈출
			throw new ArrayIndexOutOfBoundsException("인덱스의 범위를 초과했습니다.");
		}
	}
	
	//3. set
	public E set(int index, E data) {
		//수정 전에 미리 수정 될 요소를 저장
		E res = (E)simpleList[index];
		//수정
		simpleList[index] = data;
		return res;
	}
	
	//4. remove
	public E remove(int index) {
		//삭제될 요소 저장
		E res = (E)simpleList[index];
		
		//삭제할 데이터 뒤의 요소들을 앞으로 한칸씩 땡겨준다.
		for(int i = 0; i < size - 1; i++) {
			if(i >= index) {
				simpleList[i] = simpleList[i+1];
			}
		}
		
		//마지막 인덱스를 null로 채워준다.
		simpleList[size-1] = null;
		//삭제했음으로 size는 1감소
		size--;
		return res;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		
		//상속이나 구현을 통해 메서드를 오버라이드 해 사용하고
		//인스턴스를 단발성으로 생성하는 경우라면 익명클래스로 생성해서 사용하는 방법도 있다.
		//익명클래스는 부모 또는 인터페이스의 타입명(){} 와 같은 형식으로 생성할 수 있다.
		return new Iterator<E>() {
			//Iterator가 읽은 데이터의 개수
			private int iterIdx;

			@Override
			public boolean hasNext() {
				//iterIdx(next()로 반환한 요소의 개수)가 size보다 작으면 true
				if(iterIdx < size) {
					return true;
				}
				return false;
			}

			@Override
			public E next() {
				E res = (E)simpleList[iterIdx];
				iterIdx++;
				return res;
			}
		};
	}
	
	//내부클래스(Inner Class, Member Class)
	//클래스 안에 클래스를 선언할 수 있다.
	//외부클래스의 필드를 공유한다.
	private class SimpleIterator<E> implements Iterator<E>{
		//Iterator가 읽은 데이터의 개수
		private int iterIdx;

		@Override
		public boolean hasNext() {
			//iterIdx(next()로 반환한 요소의 개수)가 size보다 작으면 true
			if(iterIdx < size) {
				return true;
			}
			return false;
		}

		@Override
		public E next() {
			E res = (E)simpleList[iterIdx];
			iterIdx++;
			return res;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
