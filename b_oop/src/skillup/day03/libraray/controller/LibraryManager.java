package skillup.day03.libraray.controller;

import skillup.day03.libraray.model.vo.AniBook;
import skillup.day03.libraray.model.vo.Book;
import skillup.day03.libraray.model.vo.CookBook;
import skillup.day03.libraray.model.vo.Member;

public class LibraryManager {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public LibraryManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myPage() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		
		Book[] searchList = new Book[5];
		int count = 0;
		for (int i = 0; i < searchList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				searchList[count] = bList[i];
				//검색된 도서 권수
				count++;
			}
		}
		
		//검색된 도서 개수 크기의 배열
		Book[] resList = new Book[count];
		for (int i = 0; i < resList.length; i++) {
			//검색된 도서 정보를 resList로 옮겨담는다.
			resList[i] = searchList[i];
		}
		
		//반환
		return resList;
	}
	
	public int rentBook(int index) {
		
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			//회원의 나이와 도서관람연령을 비교해서 result 값을 결정
			if(((AniBook)bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		}else if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon()) {
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
