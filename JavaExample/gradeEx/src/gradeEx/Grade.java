package gradeEx;

public class Grade {	
	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		return (this.math + this.science + this.english) / 3; 
	}
}
