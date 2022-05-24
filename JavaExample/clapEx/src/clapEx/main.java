package clapEx;

public class main {
	public static void main(String[] args) {
		int nArr[][] = new int[10][10];
		int num = 0;
		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				nArr[i][j] = (i*10) + (j+1);
				if(nArr[i][j] == 1+Math.pow(2, num)) {
					System.out.print("(Â¦) ");
					
				}
				else if(nArr.length>100){
					break;
				}
				else {
					System.out.print("(½²) ");

				}num++;
				
				
				
			}System.out.println();
		}
	}
}
