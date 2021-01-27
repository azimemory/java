package skillup.day04.silsub.model.vo;

//인터페이스는 다중 상속이 가능하다.
public interface CellPhone extends Phone, Camera{
	void charge();
}
