package f_thread.a_thread.runnable;

//Runnable 인터페이스 구현을 통한 쓰래드 생성
public class MyDaemonThread implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
									//쓰래드의 이름
			System.out.println(i+"."+Thread.currentThread().getName()
									//데몬쓰래드 여부
					+": 데몬스래드? : " + Thread.currentThread().isDaemon());
		}
	}
}
