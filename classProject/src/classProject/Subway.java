package classProject;

public class Subway {
	int coustomerCount;
	int price;
	int subNumber;
	
	public Subway() {
		System.out.println("Sub������ ȣ��!");
	}
	//get
	public int getCoustomercount() {
		return coustomerCount;
	}
	public int getPrice() {
		return price;
	}
	public int getSubnumber() {
		return subNumber;
	}
	//set
	public void setSubway(int coustomerCount, int price, int subNumber) {
		this.coustomerCount = coustomerCount;
		this.price = price;
		this.subNumber = subNumber;
	}
	
	public void showInfo() {
		System.out.println("Subway ���");
		System.out.println(getCoustomercount());
		System.out.println(getPrice());
		System.out.println(getSubnumber());
		
	}
	
	public void take(int price) {
		this.price += price;
		System.out.println("����ö�� ������ " + getPrice() + "�� �Դϴ�.");
	}
}
