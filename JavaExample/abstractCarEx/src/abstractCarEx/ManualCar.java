package abstractCarEx;

public class ManualCar extends Car{
	public void drive() {
		System.out.println("사람이 직접 운전합니다.");
	}
	public void stop() {
		System.out.println("사람이 브레이크를 밟아 멈춥니다.");
	}
}
