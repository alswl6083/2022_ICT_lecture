
public class Professor {
	String proName;
	String proGender;
	int proAge;
	String proNumber;
	String proAddress;
	int proGrade;
	
	public Professor() {
		System.out.println("���������");
		proName = "�̸�����";
		proGender = "��";
		proAge = 1;
		proNumber = "�˼�����";
		proAddress = "�˼�����";
		proGrade = 1;
	}
	
	public String getproName() {
		return proName;
	}
	
	public String getproGender() {
		return proGender;
	}
	
	public int getproAge() {
		return proAge;
	}
	
	public String getproNumber() {
		return proNumber;
	}
	public String getproAddress() {
		return proAddress;
	}
	public int getproGrade() {
		return proGrade;
	}
	
	public void setproName(String name) {
		this.proName = name;
	}
	public void setproGender(String gender) {
		this.proGender = gender;
	}
	public void setproAge(int age) {
		this.proAge = age;
	}
	public void setproNumber(String number) {
		this.proNumber = number;
	}
	public void setproAddress(String address) {
		this.proAddress = address;
	}
	public void setproGrade(int grade) {
		this.proGrade = grade;
	}
	
	public void showInfo() {
		System.out.println("showInfoȣ��(professor)");
		System.out.println(getproName());
		System.out.println(getproGender());
		System.out.println(getproAge());
		System.out.println(getproNumber());
		System.out.println(getproAddress());
		System.out.println(getproGrade()+"(����)");
	}
}
