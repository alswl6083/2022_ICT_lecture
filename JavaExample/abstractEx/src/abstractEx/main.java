package abstractEx;

public class main {
	public static void main(String[] args) {
		Notebook com = new Notebook();
		com.turnOn();
		com.display();	
		com.typing();
		com.turnOff();
		
		Computer com2 = new Notebook();
		com2.turnOn();
		com2.display();	
		com2.typing();
		com2.turnOff();
	}
}
