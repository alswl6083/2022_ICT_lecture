package bookArrayEx;


public class main {
	public static void main(String[] args) {
	/*	Book[] bookArr = new Book[5];
		bookArr[0] = new Book("�ظ�����", "J.K.�Ѹ�");
		bookArr[1] = new Book("���Ƕ� �����ΰ�", "����Ŭ ����");
		bookArr[2] = new Book("Do it java ���α׷���", "������");
		bookArr[3] = new Book("�����", "������ �� �������丮");
		bookArr[4] = new Book("���� �θ��� ���̵�", "���߹�");
		
		
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
		
		bookArray1[0] = new Book("å1", "����1");
		bookArray1[1] = new Book("å2", "����2");
		bookArray1[2] = new Book("å3", "����3");
		
		/*System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}*/
		
		System.arraycopy(bookArray1,0,bookArray2,0,bookArray1.length);
		
		bookArray1[0].setBookName("�ٸ�å1");
		bookArray1[0].setAuthor("�ٸ�����1");
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
			//System.out.println(bookArray2[i]);//�ּҰ�
		}
		
		
		
		
	}
}
