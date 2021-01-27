package skillup.day04.silsub.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
		
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void printMaker();
	
	@Override
	public void makeacall() {
		System.out.println("번호를 누르고 통화버튼을 누름");
	}

	@Override
	public void takeaCall() {
		System.out.println("수신 버튼을 누름");
	}
	
}
