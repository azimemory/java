package f_thread.c_threadSafe;

public class SoiThread extends Thread{

	private InputDrink id;

	public SoiThread(InputDrink id) {
		super();
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i = 0;  i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() 
					+ ":  간장 발견!");
			System.out.println(Thread.currentThread().getName() 
					+ ": " + id.input("간장") + " 냉장고에 넣는다.");
		}
	}
	
	
}
