package averagearrayEx;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		ArrayList<People> peopleList = new ArrayList<People>();
		peopleList.clear();
		/*
		peopleList.add(new People("�̼���",4.5));
		peopleList.add(new People("������",4.5));
		peopleList.add(new People("ȫ�籤",4.5));
		peopleList.add(new People("�ŵ���",4.5));
		peopleList.add(new People("��μ�",4.5));
		peopleList.add(new People("���̸�",4.2));
		peopleList.add(new People("���̸�",3.9));
		peopleList.add(new People("ȫ�̸�",2.4));
		peopleList.add(new People("���̸�",1.7));
		peopleList.add(new People("���̸�",2.8));
		*/
		
		Scanner scan = new Scanner(System.in);
		String name;
		double grades = 0.0;
		
		for(int i=0; i<3; i++) {
		System.out.println("�̸��� ������ �Է��ϼ���.");
		name = scan.next();
		grades = scan.nextDouble();
		peopleList.add(new People(name, grades));
		scan.nextLine();
		}
		
		System.out.println("---������ 4.0�̻��� �ο� ���---");
		for(int i=0; i<peopleList.size(); i++) {
			peopleList.get(i).checkGrade();
		}
		
		
		double dSum = 0.0;
		
		
		System.out.println("---------------------------");
		System.out.println("---��ü �ο��� ���� ���---");
		for(int i=0; i<peopleList.size(); i++) {
			dSum += peopleList.get(i).getGrade();	
		}
		System.out.println("���� ��� : " + dSum / peopleList.size());
		System.out.println("----------------------");
		
		
		scan.close();
	}
}
