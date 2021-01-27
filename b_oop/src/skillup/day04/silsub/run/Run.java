package skillup.day04.silsub.run;

import skillup.day04.silsub.model.vo.GalaxyNote9;
import skillup.day04.silsub.model.vo.SmartPhone;
import skillup.day04.silsub.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		SmartPhone[] phone = new SmartPhone[2];
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		for (int i = 0; i < phone.length; i++) {
			phone[i].printMaker();
			phone[i].makeacall();
			phone[i].takeaCall();
			phone[i].charge();
			phone[i].picture();
			System.out.println();
		}
	}
}
