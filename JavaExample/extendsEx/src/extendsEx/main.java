package extendsEx;

public class main {
	public static void main(String[] args) {
		Developer devPark = new Developer("박재현", 32, "대전", 200, 100);
		
		devPark.showInfo();
		devPark.showLang();
		
		Police polLee = new Police("이현수",31,"대전",199,99);
		polLee.showEx();
	}
}
