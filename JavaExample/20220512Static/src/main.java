
public class main {
	public static void main(String[] args) {

		Student.addCount();
	
		System.out.println("메서드: " + Student.serialNum);
		
		Student stu1 = new Student();
		stu1.serialNum++;
		System.out.println("인스턴스 생성: " + stu1.serialNum);
	}
}

