package extendsEx;

public class main {
	public static void main(String[] args) {
		Developer devPark = new Developer("������", 32, "����", 200, 100);
		
		devPark.showInfo();
		devPark.showLang();
		
		Police polLee = new Police("������",31,"����",199,99);
		polLee.showEx();
	}
}
