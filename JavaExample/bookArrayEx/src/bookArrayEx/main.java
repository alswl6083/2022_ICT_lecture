package bookArrayEx;


public class main {
	public static void main(String[] args) {
	/*	Book[] bookArr = new Book[5];
		bookArr[0] = new Book("해리포터", "J.K.롤링");
		bookArr[1] = new Book("정의란 무엇인가", "마이클 샌델");
		bookArr[2] = new Book("Do it java 프로그래밍", "박은종");
		bookArr[3] = new Book("어린왕자", "앙투안 드 생텍쥐페리");
		bookArr[4] = new Book("괭이 부리말 아이들", "김중미");
		
		
		for(int i=0; i<bookArr.length; i++) {
			bookArr[i].showInfo();
		} 
		
		//arraycopy
		int[] array = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array, 0, array2, 1, 4);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}*/
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("책1", "저자1");
		bookArray1[1] = new Book("책2", "저자2");
		bookArray1[2] = new Book("책3", "저자3");
		
		/*System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}*/
		
		System.arraycopy(bookArray1,0,bookArray2,0,bookArray1.length);
		
		bookArray1[0].setBookName("다른책1");
		bookArray1[0].setAuthor("다른저자1");
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
			//System.out.println(bookArray2[i]);//주소값
		}
		
		
		
		
	}
}
