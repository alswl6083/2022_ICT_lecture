package interface2Ex;

public class main {
	public static void main(String[] args) {
		Customer ctm = new Customer();
		Buy buyer = ctm;
		buyer.buy();
		
		Sell seller = ctm;
		seller.sell();
		
		ctm.order();
		buyer.order();
		seller.order();
	}

}
