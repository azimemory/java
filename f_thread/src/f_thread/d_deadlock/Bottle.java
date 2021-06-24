package f_thread.d_deadlock;

public class Bottle {

	// Static과 Heap영역은 모든 thread가 공유하는 영역이다.
	// 필드변수 heap 영역(thread가 공유하는)에 저장된다. -> 공유자원
	private String drink;

	// 임계영역 : 코드 블록 내에서 공유자원을 사용하고 있어
	// 둘 이상의 쓰래드가 동시에 접근할 경우 문제가 발생할 수 있는 코드블록
	// 동기화를 통해 작업(job)의 순서를 지정해줘야 한다.

	// synchronized 예약어
	// 메서드 또는 synchronized 블록으로 활용
	// 메서드에 synchronized 예약어를 사용할 경우 객체에 lock을 건다.
	// 즉 A 쓰래드에 의해 메서드가 사용되는 동안
	// 다른 쓰래드들은 A 쓰래드가 사용하는 메서드 뿐 아니라 객체의 다른 메서드나 속성에도 접근할 수 없다.
	public String input(String drink) {

		// synchronized블록을 사용할 경우 객체가 아니라 필요한 부분에만 lock을 건다.
		// 지금 같은 경우 drink 속성에만 lock을 건다.
		synchronized (this) {
			this.drink = drink;
			System.out.println("Bottle : 물병에 " + drink + " 채운다.");
			return this.drink;
		}

	}

}
