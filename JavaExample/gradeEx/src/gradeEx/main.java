package gradeEx;

public class main {
	public static void main(String[] args) {
		System.out.println("성적 출력 프로그램 시작!");
		int math = 90;
		int science = 88;
		int english = 96;
		Grade me = new Grade(math, science, english);
		System.out.println("수학, 과학, 영어 점수의 평균: " + me.average());
		
	}
}
