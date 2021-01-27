package skillup.day03.libraray.model.vo;

public class AniBook extends Book{
	
	private int accessAge;
	
	public AniBook() {
		
	}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
		// TODO Auto-generated constructor stub
	}
	
	public int getAccessAge() {
		return accessAge;
	}
	
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
	@Override
	public String toString() {
		return super.toString() + " AniBook [accessAge=" + accessAge + "]";
	}
	
	

}
