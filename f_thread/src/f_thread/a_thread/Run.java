package f_thread.a_thread;

public class Run {
	public static void main(String[] args) {
		//메인쓰래드 이름 찍어보기
		System.out.println("메인메서드가 동작하고 있는 쓰래드 : "
				+ Thread.currentThread().getName());
		
		MyThread m1 = new MyThread();
		//Thread 이름을 지정
		m1.setName("m1");
		//Thread 실행
		m1.start();
		
		System.out.println("======================");
		System.out.println("Main Method의 마지막 코드");
		System.out.println("======================");
		
		//프로그램은 모든 쓰래드가 종료되면 종료된다.
	}
}
