package singletonEx;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Singlethon 생성자 호출!");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
		
	
}
