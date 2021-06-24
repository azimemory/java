package f_thread.d_deadlock.space;

public class House {
	
	private School school;
	
	public void setSchool(School school) {
		this.school = school;
	}

	public synchronized void goToHouse(String name) {
		System.out.println(name + " 집으로 갑니다.");
	}
	
	public synchronized void leaveHouse(String name) {
		System.out.println(name + " 집에서 떠납니다.");
		school.goToSchool(name);
	}

}
