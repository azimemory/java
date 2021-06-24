package f_thread.e_solution;

import f_thread.e_solution.space.House;
import f_thread.e_solution.space.School;

public class SoiThread extends Thread{

	private Bottle bottle;

	public SoiThread(Bottle bottle) {
		super();
		this.bottle = bottle;
	}
	
	@Override
	public void run() {
		School school = new School();
		House house = new House();
		house.setSchool(school);
		
		for(int i = 0; true; i++) {
			
			System.out.println(Thread.currentThread().getName() 
					+ ":  간장 발견!");
			System.out.println(Thread.currentThread().getName() 
					+ ": " + bottle.input("간장") + " 냉장고에 넣는다.");
			
			house.leaveHouse("간장");
		}
	}
	
	
}
