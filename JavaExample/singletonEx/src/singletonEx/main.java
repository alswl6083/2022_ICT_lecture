package singletonEx;

public class main {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		Basic basic1 = new Basic();
		Basic basic2 = new Basic();
		
	}
}
