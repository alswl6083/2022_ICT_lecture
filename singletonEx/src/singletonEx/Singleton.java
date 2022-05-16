package singletonEx;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Singlethon ������ ȣ��!");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
		
	
}
