
public class main {
 public static void main(String[] args) {
	 System.out.println("���α׷����� ���۵Ǿ����ϴ�.");//���α׷� ���� �޼��� ����
	 Student student1 = new Student(); //Ŭ���� ����� �Ҵ�
     
	 student1.setStudentName("������");//studentŬ���� ��� ������ ���� ����
	 student1.setAddress("����������");
	 student1.setStudentID(1);
	 student1.setGrade(2);
	 
	 String strStudentN = student1.getStudentName(); //�������� ���� �� student Ŭ���� ������� �� ������
	 String strStudentA = student1.getAddress();
	 int studentID = student1.getStudentID();
	 int stugrade = student1.getGrade();
	 
	 System.out.println(strStudentN);//������ studentŬ���� ���� ���� ���
	 System.out.println(strStudentA);
	 System.out.println(studentID);
	 System.out.println(stugrade);
	 
	 Professor proPark = new Professor();
	 
	 proPark.setproName("������");
	 proPark.setproGender("����");
	 proPark.setproAge(32);
	 proPark.setproNumber("010-9650-9705");
	 proPark.setproAddress("���������� ������ �׵�");
	 proPark.setproGrade(7);
	 
	 String strname = proPark.getproName();
	 String strgender = proPark.getproGender();
	 int strage = proPark.getproAge();
	 String strnumber = proPark.getproNumber();
	 String straddress = proPark.getproAddress();
	 int strgrade = proPark.getproGrade();
	 
	 System.out.println(strname);
	 System.out.println(strgender);
	 System.out.println(strage);
	 System.out.println(strnumber);
	 System.out.println(straddress);
	 System.out.println(strgrade+"(����)");
	 
	 Student studentJeong = new Student("������",10,11,"����������");
	 System.out.println(studentJeong.getGrade());
	 
	 student1.showInfo();
	 proPark.showInfo();
	 
	 //this�� �ϴ� �� = �ڽ��� �ּ�
	 student1.prinThis();
	 System.out.println(student1);
	 
	
	 
	 
 }
}
