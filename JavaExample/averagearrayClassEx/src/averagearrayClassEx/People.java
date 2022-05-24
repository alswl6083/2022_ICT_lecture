package averagearrayClassEx;
import java.util.ArrayList;



public class People {
	public String name;
	public double grade;
		
	public People(String name, double grade) {
			this.name = name;
			this.grade = grade;
	}
	public double getGrade() {
			return this.grade;
	}
	public String getName() {
			return this.name;
	}
	public void checkGrade(ArrayList<People> arrList) {
		for(int i=0; i<arrList.size(); i++) {
			People people = arrList.get(i);
			if(grade >= 4.0) {	
				System.out.println("이름: "+arrList.get(i).getName()+"학점: "+arrList.get(i).getGrade());
			}
		}
	}
}
