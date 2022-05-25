package averagearrayEx;

/*import java.util.ArrayList;*/

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
	
	public void checkGrade() {
		if(grade >= 4.0) {
			System.out.println("¿Ã∏ß : "+name);
		}
	}
	

	
}
