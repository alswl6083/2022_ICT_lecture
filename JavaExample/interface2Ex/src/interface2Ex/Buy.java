package interface2Ex;

public interface Buy {
	void buy();
	
	default void order() {System.out.println("���� �ֹ�");}
	
}
