package skillup.day03.libraray.view;

import java.util.Scanner;
import skillup.day03.libraray.controller.LibraryManager;
import skillup.day03.libraray.model.vo.Book;
import skillup.day03.libraray.model.vo.Member;

public class LibraryMenu {
	
	private LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public LibraryMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		
		System.out.print("이름을 입력하시오 : ");
		String name = sc.next();
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		System.out.print("성별(F/M)을 입력하시오 : ");
		char gender = sc.next().charAt(0);
		
		lm.insertMember(new Member(name,age,gender));
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 제목 검색");
			System.out.println("4. 도서 대여");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("입력 : ");
			
			switch (sc.nextInt()) {
			case 1:System.out.println(lm.myPage());		
				break;
			case 2:selectAll();
				break;
			case 3:searchBook();
				break;
			case 4:rentBook();
				break;
			case 9:return;
			default:System.out.println("잘못된 번호를 입력하셨습니다.");break;
			
			}
		}
	}
	
	private void selectAll() {
		Book[] bList = lm.selectAll();
		System.out.println("\n====도서 목록====");
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i]);
		}
	}
	
	private void searchBook() {
		System.out.print("검색할 제목 : ");
		Book[] searchList = lm.searchBook(sc.next());
		for (int i = 0; i < searchList.length; i++) {
			System.out.println(searchList[i]);
		}
	}
	
	private void rentBook() {
		System.out.print("대여할 도서 번호 선택 : ");
		System.out.println(lm.rentBook(sc.nextInt()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
