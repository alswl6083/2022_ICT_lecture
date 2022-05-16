package takeEx;

public class People {
	String name;
	int age;
	int money;
	String job;
	
	public People(String name, int age, int money, String job) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.job = job;
		System.out.println("------������ ���------");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("�� : " + this.money);
		System.out.println("���� : " + this.job);
		System.out.println("--------------------");
	}
	
	public boolean payFee(int price) {
		if(this.money < price)
			{
			return false;
			}
		else {
			this.money -= price;
			return true;
		}
	}
	
	public void takeBus() {
		Bus bus = Bus.getInstance();
		bus.takeBus(this);
		System.out.println(this.name+"���� �ܾ�: " + this.money);
		System.out.println("������ �� ����: " + bus.money);
		System.out.println("������ ź ����� ��: " + bus.peopleCount);
		System.out.println("--------------------");
		
	}
	public void takeSubway() {
		Subway subway =Subway.getInstance();
		subway.takeSubway(this);
		System.out.println(this.name+"���� �ܾ�: "+this.money);
		System.out.println("����ö�� �� ����: " + subway.money);
		System.out.println("����ö�� ź ����� ��: " + subway.peopleCount);
		System.out.println("--------------------");
	}
	

}
