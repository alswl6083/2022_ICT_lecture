package averagearrayClassEx;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		//간략하게 클래스로 checkGrade메서드를 호출하기위한 메서드(가독성이 떨어져서 권장하지않음)
		ArrayList<People> peopleList = new ArrayList<People>();
		People peo = new People("ㄱㄱㄱ", 4.3);
		peopleList.add(peo);
		peo.checkGrade(peopleList);

		
	}
}
