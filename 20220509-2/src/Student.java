
public class Student {
	String studentName;
	int grade;
	int studentID;
	String address;
	
	public Student() {
		System.out.println("학생출력");
		studentName = "이름없음";
		grade = 1;
		studentID = 1;
		address = "모름";
	}
	
	public Student(String _name, int _grade, int _id, String _address) {
		System.out.println("생성자2 호출");
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
		System.out.println("showInfo 호출(student)");
		System.out.println(getStudentName());
		System.out.println(getGrade());
		System.out.println(getStudentID());
		System.out.println(getAddress());
	}
	
	public void prinThis() {
		System.out.println(this);
	}
}


