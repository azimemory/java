package f_thread.e_solution;

import f_thread.e_solution.space.House;
import f_thread.e_solution.space.School;

public class CoffeeThread extends Thread{
	
	private Bottle bottle;

	public CoffeeThread(Bottle bottle) {
		super();
		this.bottle = bottle;
	}
	
	@Override
	public void run() {
		School school = new School();
		House house = new House();
		school.setHouse(house);
		
		for(int i = 0;  true; i++) {
			
			school.leaveSchool("커피");
			
			System.out.println(Thread.currentThread().getName() 
					+ ":  커피 발견!");
			System.out.println(Thread.currentThread().getName() 
					+ ": " + bottle.input("커피") + " 마신다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
