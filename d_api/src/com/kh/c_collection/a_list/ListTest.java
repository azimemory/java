package com.kh.c_collection.a_list;

import java.util.ArrayList;
import java.util.List;

import com.kh.c_collection.model.vo.Music;


public class ListTest {
	
	// CRUD : Create(생성,추가), Read(읽어오기), Update(수정), Delete(삭제)
	public void doList() {
		
		//ArrayList
		List list = new ArrayList(); //Generic을 지정하지 않으면 기본적으로 Object타입
		
		//1. list의 제일 끝에 데이터를 추가
		//추가할 데이터 : 여러분들이 좋아하는 노래 2곡 
		//ex)
		//new Music("백지영", "총맞은 것처럼")
		//new Music("윤도현", "사랑했나봐")
		list.add(new Music("백지영","총맞은 것처럼"));
		list.add(new Music("윤도현","사랑했나봐"));
		System.out.println("1) list의 제일 끝에 데이터를 추가 : \n   " + list + "\n");
		
		//2. list의 크기를 출력하세요.
		System.out.println("2) list의 크기 : \n   " + list.size() + "\n");
		
		//3. 2번 인덱스에 원하는 노래 인스턴스를 추가하세요.
		list.add(2, new Music("queen", "we will rock you"));
		System.out.println("3) 2번 인덱스에 원하는 노래 인스턴스를 추가 : \n   " + list + "\n");
		
		//4. list의 2번 인덱스에 저장된 값을 받아서 출력하세요.
		System.out.println("4) 2번 인덱스에 저장된 값 : \n   " + list.get(2) + "\n");
		
		//5. 2번 인덱스에 담긴 데이터를 new Music("아이유","너랑나") 로 수정하세요
		list.set(2, new Music("아이유","너랑나"));
		System.out.println("5) 2번 인덱스 수정 : \n   " + list + "\n");
		
		//6. 2번 인덱스에 담긴 데이터를 삭제하세요.
		list.remove(2);
		System.out.println("6) 2번 인덱스에 담긴 데이터를 삭제 : \n   " + list + "\n");
		
		//7. list의 0~1번 인덱스 사이의 데이터를 잘라내어 새로운 List로 반환받아 출력하세요.
		List subList = list.subList(0, 1);
		System.out.println("7) list의 0~1번 인덱스를 잘라내어 새로운 List로 반환 : \n   " + subList + "\n");
		
		//8. 2번 인덱스에 new Music("김광석","서른즈음에")를 추가 하세요.
		//   새롭게 추가한 new Music("김광석","서른즈음에") 이 list에 존재하는지 확인하고 결과를 출력하세요.
		//   만약 결과가 예상한 것과 다르게 출력된다면 알맞은 결과가 나오도록 코드를 수정하세요.
		list.add(2, new Music("김광석","서른즈음에"));
		System.out.println("8) 2번 인덱스에 [김광석 - 서른즈음에] 를 추가 : \n   " + list + "\n");
		System.out.println("8) [김광석 - 서른즈음에]는 list에 존재 하나요? : \n   " 
							+ list.contains(new Music("김광석","서른즈음에")) + "\n"); 	
		
		//9. [김광석 - 서른즈음에]가 담긴 인덱스를 반환 받아 출력하세요.
		System.out.println("9) [김광석 - 서른즈음에] 인덱스 : \n   " + list.indexOf(new Music("김광석","서른즈음에"))); 	

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
