package f_thread.c_threadSafe;

public class InputDrink {
	
	//필드변수 heap 영역(thread가 공유하는)에 저장된다.
	private String drink;
	
	//synchronized 예약어
	//메서드 또는 synchronized 블록으로 활용
	//메서드에 synchronized 예약어를 사용할 경우 객체에 lock을 건다.
	//synchronized블록을 사용할 경우 객체가 아니라 필요한 부분에만
	//	lock을 건다.
	public synchronized String input(String drink) {
		synchronized(this) {
			this.drink = drink;
			System.out.println("InputDrink : 물병에 " + drink + " 채운다.");
			return this.drink;
		}
	}
	
	
	
	
	
}
