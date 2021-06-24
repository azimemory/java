package f_thread.d_deadlock;

import f_thread.d_deadlock.space.House;
import f_thread.d_deadlock.space.School;

public class Run {

	public static void main(String[] args) {
		
		Bottle bottle = new Bottle();
		School school = new School();
		House house = new House();
		school.setHouse(house);
		house.setSchool(school);
		
		CoffeeThread coffee = new CoffeeThread(bottle, school);
		coffee.setName("coffee boy");
		
		SoiThread soi = new SoiThread(bottle, house);
		soi.setName("soi girl");
		
		coffee.start();
		soi.start();
	}
}
