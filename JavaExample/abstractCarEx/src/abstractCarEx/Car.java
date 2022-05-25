package abstractCarEx;

public abstract class Car {	
	public abstract void drive();
	public abstract void stop();
	
	public void turnOn() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public final void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
