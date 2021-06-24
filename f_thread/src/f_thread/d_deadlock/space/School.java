package f_thread.d_deadlock.space;

public class School {
	
	private House house;
	
	public void setHouse(House house) {
		this.house = house;
	}

	public synchronized void goToSchool(String name) {
		System.out.println(name + " 학교로 갑니다.");
	}
	
	public synchronized void leaveSchool(String name) {
		System.out.println("학교에서 떠납니다.");
		house.goToHouse(name);
	}

}
