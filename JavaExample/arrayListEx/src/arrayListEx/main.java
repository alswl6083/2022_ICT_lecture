package arrayListEx;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		/* ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.clear();
		arrayList.add("aaaaa");
		arrayList.add("bbbbb");
		arrayList.add("ccccc");
		
		for(int i=0; i<arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
		}
		
		System.out.println(arrayList.size());
		System.out.println(arrayList.isEmpty());
		
		arrayList.remove(1);
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			} */
		
		ArrayList<Book> list = new ArrayList<Book>();
		list.clear();
		
		list.add(new Book("�¹���", "������"));
		list.add(new Book("���̾�", "�츣�� �켼"));
		list.add(new Book("�ظ�����", "���� K �Ѹ�"));
		list.add(new Book("����", "�ڰ渮"));
		list.add(new Book("�����", "�������丮"));
			
		for(int i=0; i<list.size(); i++) {
			Book book = list.get(i);
			book.showInfo();
		}
	
		
		
	}
}
