package extendsEx;

public class Police extends People {
	private int expert = 8;
	
	public Police(String name, int age, String address, int height, int weight) {
		super(name, age, address, height, weight);
	}
	
	public void showEx() {
		System.out.println(super.getName()+"님의 경력은 "+expert+"년 입니다.");
	}

}
