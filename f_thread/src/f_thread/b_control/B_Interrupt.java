package f_thread.b_control;

import java.util.Scanner;

public class B_Interrupt {
	public void interruptTest(Thread thread) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("빨리감기를 하려면 아무키나 누르세요 :");
			sc.nextLine();
			
			//매개변수로 넘겨받은 thread의 일시정지 상태를 해제한다.
			//interrupt() : InterruptedException을 발생시켜 일시정지 상태를 해제
			thread.interrupt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
