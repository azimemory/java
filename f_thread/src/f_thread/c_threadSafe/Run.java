package f_thread.c_threadSafe;

public class Run {

	public static void main(String[] args) {
		
		Bottle bottle = new Bottle();
		
		CoffeeThread coffee = new CoffeeThread(bottle);
		coffee.setName("coffee boy");
		
		SoiThread soi = new SoiThread(bottle);
		soi.setName("soi girl");
		
		coffee.start();
		soi.start();
	}
}
