package skillup.day04.silsub.model.vo;

public class GalaxyNote9 extends SmartPhone{

	@Override
	public void charge() {
		System.out.println("고속 충전, 고속 무선 충전");
	}

	@Override
	public void picture() {
		System.out.println("1200만 듀얼 카메라");
	}

	@Override
	public void touch() {
		System.out.println("정전식, 와콤펜 지원");
	}

	@Override
	public void printMaker() {
		System.out.println("삼성");
	}
}
