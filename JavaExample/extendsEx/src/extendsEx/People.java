package extendsEx;

public class People {
	private String name;
	private int age;
	private String address;
	private int height;
	private int weight;
	
	public People(String name, int age, String address, int height, int weight) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
	
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(height);
		System.out.println(weight);
	}
	
}
