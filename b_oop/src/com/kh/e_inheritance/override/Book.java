package com.kh.e_inheritance.override;

//override
//오버라이드 : 자식클래스가 상속받은 부모클래스의 메서드를 재정의 하는 것.
//		부모가 제공하는 기능을 자식이 일부 고쳐서 사용하겠다는 의미

//오버라이드의 성립조건
//	메서드명, 매개변수, 반환형이 모두 일치
//	접근제한자는 부모의 것과 같거나 넓은 범위로 변경
//	default -> public 가능
//	public -> protected 불가능
public class Book {
	//모든 클래스는 Object클래스의 자식클래스이다.
	//Object 클래스로 부터 상속받은 메서드를 override 해보자.
	
	private String title;
	private String author;
	private int price;
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	//두 객체의 속성이 모두 같으면 같은 객체라고 판단
	@Override
	public boolean equals(Object obj) {
		
		//객체의 주소가 같으면 같은 객체라고 판단
		if (this == obj)
			return true;
		
		//매개변수로 넘어온 레퍼런스에 null이 담겨있는 경우 같은 객체일 수가 없음으로 
		if (obj == null)
			return false; //false로 반환
		
		//getClass() : 클래스의 메타정보를 가지고 있는 Class 객체를 반환해주는 메서드
		// 이 인스턴스의 클래스와 매개변수로 넘어온 클래스가 다르면
		if (getClass() != obj.getClass())
			return false; // false로 반환
		
		Book other = (Book) obj; //다운캐스팅
		
		//인스턴스의 author null일때 
		if (author == null) {
			if (other.author != null)
				//매개변수로 넘어온 레퍼런스의 author가 null이 아니면
				//두 인스턴스의 author 속성이 다름으로 false로 반환
				return false;
		//String 타입인 author들을 비교하기 위해 equals() 로 두 값을 비교
		} else if (!author.equals(other.author))
			return false; //author의 값이 다르면 false로 반환
		
		//int 타입인 price가 다르면 false반환
		if (price != other.price)
			return false;
		
		if (title == null) {
			if (other.title != null)
				return false;			
		} else if (!title.equals(other.title))
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		//해싱 : 어떠한 값을 일정한 자리수의 값으로 변환하는 것
		// 해쉬함수 : 해싱을 위한 연산 처리를 해주는 함수
		// 1. 같은 값을 넣으면 언제나 같은 해싱값이 나와야 한다.
		// 2. 다른 값을 넣으면 언제나 다른 값이 나와야 한다. --> 이런 완벽한 해쉬알고리즘은 아직 없다.
		//	 -> 다른 값을 넣었을 때 같은 해싱값이 반환되는 것을 해쉬충돌이라고 한다.
		
		//31이라는 숫자는 해쉬함수에서 관습적으로 많이 사용하는 값
		//31은 소수이면서 홀수인 수  -> 해쉬충돌을 최소화 할 수 있는 수.
		final int prime = 31;
		int result = 1;
		
		//author.hashCode : ->  String.hashCode
		//String 클래스의 해쉬코드는 문자열값의 해싱값을 반환하도록 오버라이드 되어있다.
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	


}
