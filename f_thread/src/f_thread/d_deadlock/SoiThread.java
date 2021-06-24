package f_thread.d_deadlock;

import f_thread.d_deadlock.space.House;

public class SoiThread extends Thread{

	private Bottle bottle;
	private House house;

	public SoiThread(Bottle bottle, House house) {
		super();
		this.bottle = bottle;
		this.house = house;
	}
	
	@Override
	public void run() {
		for(int i = 0; true; i++) {
			
			System.out.println(Thread.currentThread().getName() 
					+ ":  간장 발견!");
			System.out.println(Thread.currentThread().getName() 
					+ ": " + bottle.input("간장") + " 냉장고에 넣는다.");
			
			house.leaveHouse("간장");
		}
	}
	
	
}
