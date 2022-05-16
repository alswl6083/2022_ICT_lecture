
public class main {
 public static void main(String[] args) {
	 System.out.println("프로그래밍이 시작되었습니다.");//프로그램 시작 메세지 선언
	 Student student1 = new Student(); //클래스 선언과 할당
     
	 student1.setStudentName("정민지");//student클래스 멤버 변수에 값을 넣음
	 student1.setAddress("대전광역시");
	 student1.setStudentID(1);
	 student1.setGrade(2);
	 
	 String strStudentN = student1.getStudentName(); //참조변수 선언 후 student 클래스 멤버변수 값 가져옴
	 String strStudentA = student1.getAddress();
	 int studentID = student1.getStudentID();
	 int stugrade = student1.getGrade();
	 
	 System.out.println(strStudentN);//가져온 student클래스 변수 값을 출력
	 System.out.println(strStudentA);
	 System.out.println(studentID);
	 System.out.println(stugrade);
	 
	 Professor proPark = new Professor();
	 
	 proPark.setproName("박재현");
	 proPark.setproGender("남자");
	 proPark.setproAge(32);
	 proPark.setproNumber("010-9650-9705");
	 proPark.setproAddress("대전광역시 유성구 죽동");
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
	 System.out.println(strgrade+"(년차)");
	 
	 Student studentJeong = new Student("정민지",10,11,"대전광역시");
	 System.out.println(studentJeong.getGrade());
	 
	 student1.showInfo();
	 proPark.showInfo();
	 
	 //this가 하는 일 = 자신의 주소
	 student1.prinThis();
	 System.out.println(student1);
	 
	
	 
	 
 }
}
