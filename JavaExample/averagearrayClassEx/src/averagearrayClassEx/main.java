package averagearrayClassEx;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		//�����ϰ� Ŭ������ checkGrade�޼��带 ȣ���ϱ����� �޼���(�������� �������� ������������)
		ArrayList<People> peopleList = new ArrayList<People>();
		People peo = new People("������", 4.3);
		peopleList.add(peo);
		peo.checkGrade(peopleList);

		
	}
}
