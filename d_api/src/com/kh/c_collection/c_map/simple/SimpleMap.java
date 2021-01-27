package com.kh.c_collection.c_map.simple;

import java.util.HashSet;
import java.util.Set;

public class SimpleMap<K,V> {

	private int arraySize = 17;
	private Object[] simpleMap;
	private Set<K> keySet = new HashSet<K>();
	private int size = 0;
	
	public SimpleMap() {
		this.simpleMap = new Object[arraySize];
	}
	
	public SimpleMap(int arraySize) {
		this.arraySize = arraySize;
		this.simpleMap = new Object[arraySize];
	}
	
	//hash함수
	private int simpleHashMethod(K key) {
		int res = Math.abs(key.hashCode());
		res %= arraySize;
		return res;
	}
	
	//put
	public void put(K key, V value) {
		
		//keySet에 key값을 저장
		keySet.add(key);
		
		//배열에 공간이 남은 경우
		if(size < arraySize) {
			//Key를 해싱해 저장할 인덱스를 지정
			int index = simpleHashMethod(key);
			simpleMap[index] = value;
			size++;
		//배열이 가득 찬 경우
		}else {
			//배열의 크기를 두배로 확장
			arraySize *= 2;
			Object[] tempArr = new Object[arraySize];
			//기존 배열의 값들을 tempArr로 복제
			for (int i = 0; i < simpleMap.length; i++) {
				tempArr[i] = simpleMap[i];
			}
			//simpleMap의 레퍼런스에 tempArr 저장
			simpleMap = tempArr;
			
			//키값을 해싱해 인덱스를 지정
			int index = simpleHashMethod(key);
			//데이터를 추가
			simpleMap[index] = value;
			//저장된 요소의 개수를 1증가
			size++;
		}
	}
	
	//get
	public V get(K key) {
		//키값을 해싱해 반환할 데이터가 저장된 인덱스를 구한다.
		int index = simpleHashMethod(key);
		//반환한다.
		return (V)simpleMap[index];
	}
	
	//remove
	//삭제된 데이터를 반환
	public V remove(K key) {
		//키값을 해싱해 삭제할 데이터가 저장된 인덱스를 구한다.
		int index = simpleHashMethod(key);
		//인덱스에 저장된 데이터를 미리 res에 담아둔다.
		V res = (V)simpleMap[index];
		//인덱스에 저장된 데이터를 삭제한다.
		simpleMap[index] = null;
		//keySet에서 매개변수로 넘어온 key값을 지워준다.
		keySet.remove(key);
		//size를 1 감소시킨다.
		size--;
		//res 반환
		return res;
	}
	
	//keySet
	public Set<K> keySet(){
		return keySet;
	}
	
	//size
	public int size() {
		return size;
	}
	
	
	
	
	
	
	
	
	
}
