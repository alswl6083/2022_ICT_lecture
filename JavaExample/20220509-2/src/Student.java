
public class Student {
	String studentName;
	int grade;
	int studentID;
	String address;
	
	public Student() {
		System.out.println("�л����");
		studentName = "�̸�����";
		grade = 1;
		studentID = 1;
		address = "��";
	}
	
	public Student(String _name, int _grade, int _id, String _address) {
		System.out.println("������2 ȣ��");
		studentName = _name;
		grade = _grade;
		studentID = _id;
		address = _address;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setStudentName(String name) {
		this.studentName= name;
	}
	
	public void setGrade(int grade) {
		this.grade= grade;
		
	}
	
	public void setStudentID(int studentID) {
		this.studentID=studentID;
	}

	public void setAddress(String address) {
		this.address=address;
	}
	
	public void showInfo() {
		System.out.println("showInfo ȣ��(student)");
		System.out.println(getStudentName());
		System.out.println(getGrade());
		System.out.println(getStudentID());
		System.out.println(getAddress());
	}
	
	public void prinThis() {
		System.out.println(this);
	}
}


