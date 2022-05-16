package classProject;

public class Worker {
	private String wkName;
	private int wkGrade;
	private int wkMoney;
	
	//set
	public void setWorker(String wkName, int wkGrade, int wkMoney) {
		this.wkName = wkName;
		this.wkGrade = wkGrade;
		this.wkMoney = wkMoney;
	}
	
	//get
	public String getName() {
		return wkName;
	}
	public int getGrade() {
		return wkGrade;
	}
	public int getMoney() {
		return wkMoney;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.wkMoney -= 1000;
		System.out.println("회사원의 돈은 "+getMoney()+"원 남았습니다.");
	}
	public void takeSubway(Subway subway) {
		subway.take(1000);
		this.wkMoney -= 1000;
		System.out.println("회사원의 돈은 "+getMoney()+"원 남았습니다.");
	}
}
