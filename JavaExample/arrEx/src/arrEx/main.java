package arrEx;

public class main {
	public static void main(String[] args) {
		System.out.println("arrayEx ���α׷� ����!");
		
		/*int[] arr = new int[] {0, 1, 2};
		
		int[] arr2 = new int[3];
		
		arr2[0]=0;
		arr2[1]=1;
		arr2[2]=2;
		
		int[] arr3 = {0, 1, 2};
		*/
		
		/*int arr[] = new int[100]; //int�ڷ��� 100���� ���� �迭 ����
		//�迭�� ���ҿ� ����
		for(int i=0; i<100; i++) {
			arr[i] = i+1;
		}
		
		//�迭�� ���� ���
		for(int i=0; i<100; i++) {
			System.out.println(arr[i]);
		}
		
		
		//while������ ����
		int i=0;
		while(i<100) {
			arr[i]=i+1;
			System.out.println(arr[i]);
			i++;
		}
		
		//�� Ǯ��(A~J ���)
		char[] arr = new char[10];
		for(char ch=65; ch<75; ch++) {
			int i = 0;
			arr[i]= ch;
			System.out.println(arr[i]);
			i++;	
		}
		
		//�ٸ� Ǯ��
		int a = 65;
		
		for(int i=0; i<10; i++) {
			arr[i]=(char)a;
			System.out.println(arr[i]);
			a++;
		}
*/	
		//�迭�� ����(length)
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
}
