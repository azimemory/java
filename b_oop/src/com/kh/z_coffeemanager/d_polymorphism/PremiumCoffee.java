package com.kh.z_coffeemanager.d_polymorphism;

//고급포장비용 2000원이 추가되는 프리미엄커피
//판매가에 포장비용 2000원이 더해지고
//제품을 매입할 때도 포장비용 2000원이 추가 지출되어야 한다.
public class PremiumCoffee extends Coffee{
	
	private int packagingCost; //포장비용
	
	public PremiumCoffee() {
		
	}

	public int getPackagingCost() {
		return packagingCost;
	}

	public void setPackagingCost(int packagingCost) {
		this.packagingCost = packagingCost;
	}
	
	//판매가에 포장비용 반영
	@Override
	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice + packagingCost;
	}
	
	@Override
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
		//재고를 추가할 경우 매입가 + 포장비용이 지출되어야 함
		}else if(addStock(coffeeCnt, perchacePrice + packagingCost) > 0) {
			stock -= coffeeCnt;
			return coffeeCnt;
		//재고를 추가할 때 필요한 금액이 잔고 보다 많아 재고 추가가 불가능한 경우
		}else {
			return 0;
		}
	}
	
	@Override
	protected void secureSafetyStock() {
		System.out.println(" * 안전 재고가 부족해 재고를 확보합니다.");
		//안전재고가 부족할 때는 안전재고 * 2만큼 수량을 확보
		int needCnt = safetyStock * 2;
		addStock(needCnt, perchacePrice + packagingCost);
	}
	
	

}
