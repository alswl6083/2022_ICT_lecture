package interface2Ex;

public interface Sell {
	void sell();
	default void order() {System.out.println("�Ǹ� �ֹ�");}
}
