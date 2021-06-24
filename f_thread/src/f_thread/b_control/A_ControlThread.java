package f_thread.b_control;

public class A_ControlThread implements Runnable{
	@Override
	public void run() {
		int cnt = 0;
		while(cnt < 10) {
			try {
				System.out.println(
						Thread.currentThread().getName()
						+" : " + cnt + "초");
				cnt++;
				
				Thread.sleep(3000); //이 쓰래드를 3초동안 일시정지 sleep()
			} catch (InterruptedException e) {
				System.out.println("빨리감기!!");
			}
		}
	}
}
