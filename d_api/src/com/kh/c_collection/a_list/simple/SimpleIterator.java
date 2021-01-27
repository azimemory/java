package com.kh.c_collection.a_list.simple;

import java.util.Iterator;

public class SimpleIterator<E> implements Iterator<E>{
	
	private Object[] simpleList;
	//배열안의 저장된 요소의 개수
	private int size;
	//Iterator가 읽은 데이터의 개수
	private int iterIdx;

	public SimpleIterator(Object[] simpleList, int size) {
		super();
		this.simpleList = simpleList;
		this.size = size;
	}

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
