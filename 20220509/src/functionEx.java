
public class functionEx {
	public static void main(String[] args) {
		String strMessage = "프로그래밍이 시작되었습니다.";
		System.out.println(strMessage);
		int firstArg = 15;
		int secondArg = 5;
		int resultAdd = funcAdd(firstArg,secondArg);
		System.out.println(resultAdd);
		int resultMinus = funcMinus(firstArg,secondArg);
		System.out.println(resultMinus);
		int resultProduct = funcProduct(firstArg,secondArg);
		System.out.println(resultProduct);
		int resultDivision = funcDivision(firstArg,secondArg);
		System.out.println(resultDivision);
		int resultDivision2 = funcDivision2(firstArg,secondArg);
		System.out.println(resultDivision2);
	}
	
	static int funcAdd(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static int funcMinus(int a, int b) {
		int result = a - b;
		return result;
	}
	
	static int funcProduct(int a, int b) {
		int result = a * b;
		return result;
	}
	
	static int funcDivision(int a, int b) {
		int result = a / b;
		return result;
	}
	
	static int funcDivision2(int a, int b) {
		int result = a % b;
		return result;
	}
	
}

