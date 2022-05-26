package interface2Ex;

public class Customer implements Buy,Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
		// TODO Auto-generated method stub
		
	}
	
	public void order() {
		System.out.println("고객 주문");
	}

}
