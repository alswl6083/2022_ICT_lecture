package arrayCopyEx;

public class main {
	public static void main(String[] args) {
		//��������, �������� 
		Book[] bookArray1 = new Book[5];
		bookArray1[0]=new Book("å1", "����1");
		bookArray1[1]=new Book("å2", "����2");
		bookArray1[2]=new Book("å3", "����3");
		bookArray1[3]=new Book("å4", "����4");
		bookArray1[4]=new Book("å5", "����5");
		
		Book[] bookArray2 = new Book[5];
		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
		
		Book[] bookArray3 = new Book[5];
		
		bookArray3[0]=new Book("ååå1", "������������1");
		bookArray3[1]=new Book("ååå1", "������������1");
		bookArray3[2]=new Book("ååå1", "������������1");
		bookArray3[3]=new Book("ååå1", "������������1");
		bookArray3[4]=new Book("ååå1", "������������1");
		
		for(int i=0; i<bookArray3.length; i++) {
			bookArray3[i].setBookName(bookArray1[i].getBookName());
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
		}
		
	
		bookArray1[0].setBookName("�ٸ�å1");
		bookArray1[0].setAuthor("�ٸ�����1");

		
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
