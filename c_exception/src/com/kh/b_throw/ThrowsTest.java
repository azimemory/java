package com.kh.b_throw;

public class ThrowsTest {
	
	//throws : 예외 상황이 발생하였을 때 해당 예외에 대한 처리를 메서드를 호출한 대상에게 넘길 수 있다.
	//throws는 여러 단계로 넘길 수 있다.
	//최종적으로는 main메서드로 넘겨지게 되며 main 메서드에서도 throws를 할 경우
	//jvm이 받아서 처리한다.
	//하지만 이는 결국 예외처리를 하지 않은 것이나 마찬가지임으로 개발자 코드에서 적절한 예외처리를 해주는게
	//바람직하다.
	public static void main(String[] args){
			new ThrowsTest().testA();
	}
	
	//throws는 여러차래 던질 수 있다.
	//여러 종류의 예외도 throws할 수 있다.
	public void testA() {
		try {
			testB();
			testC();
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//NullPointerException
	public void testB() throws NullPointerException{
		String str = null;
		str.length();
		System.out.println("호출한 메서드에게 돌려보낸다.");
	}
	
	//ArrayIndexOutOfBoundsException
	public void testC() throws ArrayIndexOutOfBoundsException{
		String[] strArr = {"A","B"};
		strArr[2] = "C";
	}

	
	
	
	
	
	
	
	
	
	
}
