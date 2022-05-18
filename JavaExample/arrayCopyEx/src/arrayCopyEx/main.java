package arrayCopyEx;

public class main {
	public static void main(String[] args) {
		//얕은복사, 깊은복사 
		Book[] bookArray1 = new Book[5];
		bookArray1[0]=new Book("책1", "저자1");
		bookArray1[1]=new Book("책2", "저자2");
		bookArray1[2]=new Book("책3", "저자3");
		bookArray1[3]=new Book("책4", "저자4");
		bookArray1[4]=new Book("책5", "저자5");
		
		Book[] bookArray2 = new Book[5];
		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
		
		Book[] bookArray3 = new Book[5];
		
		bookArray3[0]=new Book("책책책1", "저자저자저자1");
		bookArray3[1]=new Book("책책책1", "저자저자저자1");
		bookArray3[2]=new Book("책책책1", "저자저자저자1");
		bookArray3[3]=new Book("책책책1", "저자저자저자1");
		bookArray3[4]=new Book("책책책1", "저자저자저자1");
		
		for(int i=0; i<bookArray3.length; i++) {
			bookArray3[i].setBookName(bookArray1[i].getBookName());
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
		}
		
	
		bookArray1[0].setBookName("다른책1");
		bookArray1[0].setAuthor("다른저자1");

		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showInfo();
		}
		System.out.println();
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
		System.out.println();
		for(int i=0; i<bookArray3.length; i++) {
			bookArray3[i].showInfo();
		}
		
		System.out.println(bookArray1[0].hashCode());
		System.out.println(bookArray2[0].hashCode());
		System.out.println(bookArray3[0].hashCode());
	}
}
