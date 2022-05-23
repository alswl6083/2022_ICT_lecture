package narrayEx;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		String[][] nArray = new String[3][3];
		ArrayList<String> strArraylist = new ArrayList<String>();
		nArray[0][0] = "6";
		nArray[0][2] = "4";
		nArray[1][1] = "4";
		nArray[2][1] = "6";
		nArray[2][2] = "5";
//		strArraylist.add("4");
//		strArraylist.add("5");
//		strArraylist.add("6");
//		
//		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				if(nArray[i][j]==null) {
//					nArray[i][j] = strArraylist.get(0);
//					}
//			for(int k=0; k<strArraylist.size(); k++) {
//					if(strArraylist.get(k) == nArray[i][j]) {
//					strArraylist.remove(k);
//					}//k가 다 비교가 안됨.
//				}	
//				
//				System.out.print(nArray[i][j]+" ");
//			}
//			strArraylist.clear();
//			strArraylist.add("4");
//			strArraylist.add("5");
//			strArraylist.add("6");
//			
//			System.out.println();
//		}
		for(int i=0; i<3; i++) {
			strArraylist.clear();
			strArraylist.add("4");
			strArraylist.add("5");
			strArraylist.add("6");
			for(int j=0; j<3; j++) {
				if(nArray[i][j] == null) {
					continue;
				}
				strArraylist.remove(nArray[i][j]);
			}
			for(int j=0; j<3; j++) {
				if(nArray[i][j] == null && strArraylist.size()>0) {
					nArray[i][j] = strArraylist.get(0);
					strArraylist.remove(0);
				}
			}
			
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(nArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}


