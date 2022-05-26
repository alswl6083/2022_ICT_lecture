package interface2Ex;

public interface Sell {
	void sell();
	default void order() {System.out.println("판매 주문");}
}
