package classProject;

public class main {
	public static void main(String[] args) {
		System.out.println("���α׷��� ���۵Ǿ����ϴ�.");
		Student stu1 = new Student();
		Subway sub1 = new Subway();
		Subway sub2 = new Subway();
		Worker wk1 = new Worker();
		
		wk1.setWorker(null, 3, 20000);
		stu1.setStudent("������", 1, 10000);
		Bus.getInstance();
		
		/*stu1.takeBus(Bus.getInstance());
		wk1.takeBus(Bus.getInstance());
		*/
		
		stu1.takeSubway(sub1);
		System.out.println();
		wk1.takeSubway(sub2);
		System.out.println();
		wk1.takeSubway(sub1);
		
		
		
	}
}
