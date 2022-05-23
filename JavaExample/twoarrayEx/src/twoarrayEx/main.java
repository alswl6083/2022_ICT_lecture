package twoarrayEx;

public class main {
	public static void main(String[] args) {
	/*	int arr[][] = new int[9][9];
		
		for(int i = 0; i<9; i++) {
			for(int j=0; j<9; j++) {
				
				arr[i][j]=(i+1) * (j+1);
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}*/
		
		char[][] ch = new char[3][9];
		int a = 97;
			for(int i=0; i<3; i++) {
				for(int j=0; j<9; j++) {
					if(a==123) {
						ch[i][j] ='-';
					}
					else {
						ch[i][j] = (char)a;
						a++;
					}
					System.out.print(ch[i][j] + " ");
				}System.out.println();
			}
	}
}
