package f_thread.c_threadSafe;

public class Run {

	public static void main(String[] args) {
		InputDrink id = new InputDrink();
		CoffeeThread coffee = new CoffeeThread(id);
		coffee.setName("coffee boy");
		
		SoiThread soi = new SoiThread(id);
		soi.setName("soi girl");
		
		coffee.start();
		soi.start();
	}
}
