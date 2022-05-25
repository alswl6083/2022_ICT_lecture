package abstractCarEx;

public class main {
	public static void main(String[] args) {
		Car car1 = new ManualCar();
		Car car2 = new AICar();
		
		car1.run();
		System.out.println();
		car2.run();
		
		System.out.println(Define.SUCCESS);
	}
}
