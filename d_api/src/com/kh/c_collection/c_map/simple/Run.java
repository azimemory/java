package com.kh.c_collection.c_map.simple;

import com.kh.c_collection.model.vo.Music;

public class Run {
	public static void main(String[] args) {
		SimpleMap<String, Music> map = new SimpleMap<>();
		
		//1. Map에 데이터를 추가
		map.put("백산예술대상", new Music("김경호","오아시스"));
		map.put("연예대상", new Music("임창정","소주한잔"));
		map.put("골든디스크상", new Music("자우림","하하하쏭"));
		
		//2. Map에 추가한 데이터 중 Key값이 "백산예술대상"인 데이터를 출력 
		System.out.println(map.get("백산예술대상"));
		System.out.println("=================================");
		
		for(String key:map.keySet()) {
			System.out.println("Key : " + key);
			System.out.println("Value : " +map.get(key));
		}
		System.out.println("=================================");
		
		//3. Map안에 저장된 데이터의 개수를 확인
		System.out.println("map에 저장된 데이터의 개수 :  " + map.size());
		
		//4. Map에 저장된 데이터를 수정(위의 주석 확인!)
		System.out.println("=================================");
		map.put("연예대상",new Music("아이유","너랑나"));
		System.out.println(map.get("연예대상"));
		
		//8. 키값이 "연예대상" 인 데이터 삭제
		map.remove("연예대상");
		System.out.println("연예대상 : " + map.get("연예대상"));

	}
}
