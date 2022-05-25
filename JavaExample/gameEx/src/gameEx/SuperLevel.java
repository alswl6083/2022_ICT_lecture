package gameEx;

public class SuperLevel extends PlayerLevel{

	public void run() {
		System.out.println("매우 빠르게 달립니다.");
	}
	public void jump() {
		System.out.println("높이 jump!");
	}
	public void turn() {
		System.out.println("크게 turn!");
	}
	public void showLevel() {
		System.out.println("****고급자 레벨입니다****");
	}
}
