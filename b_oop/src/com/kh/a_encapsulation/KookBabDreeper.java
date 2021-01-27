package com.kh.a_encapsulation;

public class KookBabDreeper {
	
	//얼마짜리 무슨 음식을 먹었다는 이야기를 듣는다.
	
	//국밥드립을 친다.
	// -> 뭐? 그 돈 주고 그거 사먹을 바에야 뜨끈한 국밥 n그릇 든든하게 먹고말지
	
	//국밥 가격
	private final int KOOKBABPRICE = 5000;
	//음식명
	private String foodName;
	//음식가격
	private int foodPrice;
	
	// getter/setter 메서드
	public String getFoodName() {
		return foodName;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public int getFoodPrice() {
		return foodPrice;
	}
	
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	// -> 뭐? 그 돈 주고 그거 사먹을 바에야 뜨끈한 국밥 n그릇 든든하게 먹고말지
	public void dreep() {
		
		int kookbabCnt = foodPrice/KOOKBABPRICE;
		
		if(kookbabCnt == 0) {
			kookbabCnt = 1;
		}
		
		System.out.println("뭐? " + foodPrice + "원 주고 " 
						+ foodName + " 사먹을 바에야 뜨끈한 국밥 "
						+ kookbabCnt + " 그릇 든든하게 먹고말지.");
	}
	
	
	
	
	
	
	
	

}
