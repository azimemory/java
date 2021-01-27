package f_thread.c_threadSafe;

public class CoffeeThread extends Thread{
	
	private InputDrink id;

	public CoffeeThread(InputDrink id) {
		super();
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i = 0;  i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() 
					+ ":  커피 발견!");
			System.out.println(Thread.currentThread().getName() 
					+ ": " + id.input("커피") + " 마신다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
