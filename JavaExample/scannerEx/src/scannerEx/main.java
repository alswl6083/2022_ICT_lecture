package scannerEx;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("���̸� �Է��ϼ���.");
		age = scan.nextInt();
		System.out.println("�̸��� �Է��ϼ���.");
		name = scan.next();
		
		System.out.println("���� : " + age);
		System.out.println("�̸� : " + name);
		scan.close();
	}
}
