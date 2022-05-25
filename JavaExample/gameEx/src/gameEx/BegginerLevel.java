package gameEx;

public class BegginerLevel extends PlayerLevel{
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	public void jump() {
		System.out.println("jump 기능이 해제되지 않았습니다.");
	}
	public void turn() {
		System.out.println("turn 기능이 해제되지 않았습니다.");
	}
	public void showLevel() {
		System.out.println("****초급자 레벨입니다.****");
	}
}
