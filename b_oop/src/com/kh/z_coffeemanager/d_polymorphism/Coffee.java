package com.kh.z_coffeemanager.d_polymorphism;

public class Coffee {
	
	protected String name;//이름
	protected int salesPrice;//판매가
	protected int perchacePrice;//매입가
	protected int stock; //재고
	protected int safetyStock;//안전재고
	protected int salesCount; //판매량
	
	private Account account; //계좌
	
	public Coffee() {}
	
	public Coffee(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getPerchacePrice() {
		return perchacePrice;
	}

	public void setPerchacePrice(int perchacePrice) {
		this.perchacePrice = perchacePrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSafetyStock() {
		return safetyStock;
	}

	public void setSafetyStock(int safetyStock) {
		this.safetyStock = safetyStock;
	}

	public int getSalesCount() {
		return salesCount;
	}

	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	//판매 등록 메서드
	//판매 등록을 하고 결제금액을 반환
	public int registerSales(int salesCnt /*  판매개수 */) {
		//재고차감
		//결제금액 계산
		int payPrice = salesPrice * deductStock(salesCnt);
		
		//결제금액이 0이 아니라면 결제가 정상적으로 이루어진 상황
		if(payPrice > 0) {
			//누적 판매량 추가
			salesCount += salesCnt;
		}
			
		//결제금액 반환
		return payPrice;
	}
	
	//환불등록 메서드
	//매개변수로 넘어온 수량만큼 재고에 더하고, 환불금액을 반환한다.
	public int registerRefund(int refundCnt) {
		//환불 수량만큼 재고 추가하고 지출금액 계산
		int expencesPrice = salesPrice * addStock(refundCnt, salesPrice);
		
		//누적판매량에서 환불수량만큼 차감
		if(expencesPrice > 0) {
			salesCount -= refundCnt;
		}
		
		//환불금액 반환
		return expencesPrice;
	}
	
	//반품등록 메서드
	//반품 수량만큼 재고를 차감하고 입금 되어야하는 금액을 반환
	public int registerReturn(int returnCnt) {
		//반품 수량만큼 재고에 차감하고 입금되어야하는 금액을 반환
		//입금되어야 하는 금액 : 매입가 * 반품수량
		return perchacePrice * deductStockForReturn(returnCnt);
	}
			
	//재고 차감
	//재고를 차감하고 차감한 재고의 수를 반환
	protected int deductStock(int coffeeCnt) {
		//재고가 충분해 재고 차감이 가능한 경우
		if(stock > coffeeCnt) {
			stock -= coffeeCnt;
			
			//재고 차감 이후 
			//만약 재고가 안전재고보다 적다면 안전재고 확보
			if(stock < safetyStock) {
				secureSafetyStock();
			}
			
			return coffeeCnt;
			
		//재고가 충분하지 않아 재고를 추가하고 차감해야 하는 경우
		}else if(addStock(coffeeCnt, perchacePrice) > 0) {
			stock -= coffeeCnt;
			return coffeeCnt;
		//재고를 추가할 때 필요한 금액이 잔고 보다 많아 재고 추가가 불가능한 경우
		}else {
			return 0;
		}
	}
	
	//반품을 위한 재고차감
	//재고를 차감하고 차감한 재고의 수를 반환
	private int deductStockForReturn(int coffeeCnt) {
		//재고가 충분해서 재고차감이 가능한 경우
			//재고 차감이 가능하지만 재고를 차감할 경우 안전재고에 걸리는 경우
		if(stock > coffeeCnt) {
			if(stock - coffeeCnt > safetyStock) {
				stock -= coffeeCnt;
				return coffeeCnt;
			}else {
				System.out.println("안전재고 이하로는 반품할 수 없습니다.");
				return 0;
			}
		}else {
			System.out.println("반품 수량이 재고보다 많습니다.");
			return 0;
		}
	}
	
	//재고 추가
	//재고를 추가하고, 추가한 재고의 수를 반환
	protected int addStock(int coffeeCnt, int price) {
		int expencesPrice = coffeeCnt * price;
		//잔고가 충분해 재고 추가가 가능한 경우
		//잔고가 지출금액보다 크면 true / 아니면 false
		if(account.registerExpences(expencesPrice)) {
			System.out.println(" * 재고를 " + coffeeCnt + "개 추가 합니다.");
			stock += coffeeCnt;
			return coffeeCnt;
		//잔고부족으로 재고 추가가 불가능한 경우
		}else {
			System.out.println(" * 잔고가 부족해 재고를 추가하지 못했습니다.");
			return 0;
		}
	}
	
	//안전재고 확보
	//안전 재고를 확보하고 추가한 재고의 수를 반환
	protected void secureSafetyStock() {
		System.out.println(" * 안전 재고가 부족해 재고를 확보합니다.");
		//안전재고가 부족할 때는 안전재고 * 2만큼 수량을 확보
		int needCnt = safetyStock * 2;
		addStock(needCnt, perchacePrice);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
