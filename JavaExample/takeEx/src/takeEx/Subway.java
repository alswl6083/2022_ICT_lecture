package takeEx;

public class Subway {
	private static Subway instance;
	int money;
	int stuPee;
	int wrkPee;
	int peopleCount;
	
	private Subway(){
		money=0;
		peopleCount=0;
		stuPee=720;
		wrkPee=1250;
		System.out.println("--------------------");
		System.out.println("����ö 1ȣ�� ���� ����!");
		System.out.println("--------------------");
	}
	
	public static Subway getInstance() {
		if(instance == null) {
			instance = new Subway();
		}
		return instance;
	}
	
	public void takeSubway(People people) {
		if(people.payFee(wrkPee) == true) {
			System.out.println("--------------------");
			System.out.println("�ߺ�! ������ �Դϴ�.");
			this.money += this.wrkPee;
			this.peopleCount++;
			}
		else if(people.payFee(stuPee) == true) {
			System.out.println("--------------------");
			System.out.println("�ߺ�! �л� �Դϴ�.");
			this.money += this.stuPee;
			this.peopleCount++;
			}
		else {
			System.out.println("--------------------");
			System.out.println("�ߺ�! �ܾ��� �����մϴ�.");
			
		}
	}
}


