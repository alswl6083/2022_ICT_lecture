package classProject;

public class Student {
	private String stuName;
	private int grade;
	private int money;
	
	//set
	public void setStudent(String stuName, int grade, int money) {
		this.stuName = stuName;
		this.grade = grade;
		this.money = money;
	}
	
	//get
	public String getName() {
		return stuName;
	}
	public int getGrade() {
		return grade;
	}
	public int getMoney() {
		return money;
	}
	
	public void showInfo() {
		System.out.println("Student");
		System.out.println(getName());
		System.out.println(getGrade());
		System.out.println(getMoney());
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		System.out.println("학생의 돈은 "+getMoney()+"원 남았습니다.");
	}
	public void takeSubway(Subway subway) {
		subway.take(1000);
		this.money -= 1000;
		System.out.println("학생의 돈은 "+getMoney()+"원 남았습니다.");
	}
	
	
	
	
}
