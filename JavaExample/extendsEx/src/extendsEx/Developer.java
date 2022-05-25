package extendsEx;

public class Developer extends People{
	
	private int language = 100;

	public Developer(String name, int age, String address, int height, int weight) {
		super(name, age, address, height, weight);
	}
	
	public void showLang() {
		System.out.println(super.getName()+"님의 가능한 언어는 "+language+"개 입니다.");
	}
	
	
}
