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
		System.out.println("------생성한 사람------");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("돈 : " + this.money);
		System.out.println("직업 : " + this.job);
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
		System.out.println(this.name+"님의 잔액: " + this.money);
		System.out.println("버스가 번 수입: " + bus.money);
		System.out.println("버스에 탄 사람의 수: " + bus.peopleCount);
		System.out.println("--------------------");
		
	}
	public void takeSubway() {
		Subway subway =Subway.getInstance();
		subway.takeSubway(this);
		System.out.println(this.name+"님의 잔액: "+this.money);
		System.out.println("지하철이 번 수입: " + subway.money);
		System.out.println("지하철에 탄 사람의 수: " + subway.peopleCount);
		System.out.println("--------------------");
	}
	

}
