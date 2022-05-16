package takeEx;

public class Bus {
	private static Bus instance;
	int money;
	int stuPee;
	int wrkPee;
	int peopleCount;
	
	private Bus() {
		money = 0;
		peopleCount = 0;
		stuPee=720;
		wrkPee=1250;
		System.out.println("--------------------");
		System.out.println("103�� ���� ���� ����!");
		System.out.println("--------------------");
	}
	
	public static Bus getInstance() {
		if(instance == null){
			instance = new Bus();
		}
		return instance;
	}
	
	public void takeBus(People people) {
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

