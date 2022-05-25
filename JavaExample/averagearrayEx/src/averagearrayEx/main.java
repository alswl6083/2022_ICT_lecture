package averagearrayEx;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		ArrayList<People> peopleList = new ArrayList<People>();
		peopleList.clear();
		/*
		peopleList.add(new People("이선민",4.5));
		peopleList.add(new People("박재현",4.5));
		peopleList.add(new People("홍재광",4.5));
		peopleList.add(new People("신도현",4.5));
		peopleList.add(new People("김민수",4.5));
		peopleList.add(new People("이이름",4.2));
		peopleList.add(new People("박이름",3.9));
		peopleList.add(new People("홍이름",2.4));
		peopleList.add(new People("신이름",1.7));
		peopleList.add(new People("김이름",2.8));
		*/
		
		Scanner scan = new Scanner(System.in);
		String name;
		double grades = 0.0;
		
		for(int i=0; i<3; i++) {
		System.out.println("이름과 학점을 입력하세요.");
		name = scan.next();
		grades = scan.nextDouble();
		peopleList.add(new People(name, grades));
		scan.nextLine();
		}
		
		System.out.println("---학점이 4.0이상인 인원 목록---");
		for(int i=0; i<peopleList.size(); i++) {
			peopleList.get(i).checkGrade();
		}
		
		
		double dSum = 0.0;
		
		
		System.out.println("---------------------------");
		System.out.println("---전체 인원의 학점 평균---");
		for(int i=0; i<peopleList.size(); i++) {
			dSum += peopleList.get(i).getGrade();	
		}
		System.out.println("학점 평균 : " + dSum / peopleList.size());
		System.out.println("----------------------");
		
		
		scan.close();
	}
}
