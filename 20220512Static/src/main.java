
public class main {
	public static void main(String[] args) {

		Student.addCount();
	
		System.out.println("�޼���: " + Student.serialNum);
		
		Student stu1 = new Student();
		stu1.serialNum++;
		System.out.println("�ν��Ͻ� ����: " + stu1.serialNum);
	}
}

