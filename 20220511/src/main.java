
public class main {
	public static void main(String[] args) {
		System.out.println("프로그램이 시작 되었습니다.");
		Method function = new Method();
		String data = "데이터";
		int num = 10;
		function.setData(data, data);
		System.out.println("main data: " + data);
		function.setInt(0);
		System.out.println("main int: " + num);
	}

}
