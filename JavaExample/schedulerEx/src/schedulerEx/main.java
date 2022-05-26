package schedulerEx;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isSupport = true;
		for(int i=0; i<3; i++) {
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		char ch = scan.next().charAt(0);
		Scheduler scheduler = null;
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin(); 
			isSupport =true;
		}
		else if(ch =='L' || ch=='l') {
			scheduler = new LeastJob();
			isSupport =true;
		}
		else if(ch== 'P' || ch=='p') {
			scheduler = new PriorityAllocation();
			isSupport =true;
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			isSupport = false;
		}
		
		if(isSupport == true) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		}
				
		scan.close();
	}
}
