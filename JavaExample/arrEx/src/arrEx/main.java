package arrEx;

public class main {
	public static void main(String[] args) {
		System.out.println("arrayEx 프로그램 시작!");
		
		/*int[] arr = new int[] {0, 1, 2};
		
		int[] arr2 = new int[3];
		
		arr2[0]=0;
		arr2[1]=1;
		arr2[2]=2;
		
		int[] arr3 = {0, 1, 2};
		*/
		
		/*int arr[] = new int[100]; //int자료형 100개를 가진 배열 선언
		//배열의 원소에 접근
		for(int i=0; i<100; i++) {
			arr[i] = i+1;
		}
		
		//배열의 원소 출력
		for(int i=0; i<100; i++) {
			System.out.println(arr[i]);
		}
		
		
		//while문으로 변경
		int i=0;
		while(i<100) {
			arr[i]=i+1;
			System.out.println(arr[i]);
			i++;
		}
		
		//내 풀이(A~J 출력)
		char[] arr = new char[10];
		for(char ch=65; ch<75; ch++) {
			int i = 0;
			arr[i]= ch;
			System.out.println(arr[i]);
			i++;	
		}
		
		//다른 풀이
		int a = 65;
		
		for(int i=0; i<10; i++) {
			arr[i]=(char)a;
			System.out.println(arr[i]);
			a++;
		}
*/	
		//배열의 길이(length)
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
}
