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
		
		list.add(new Book("태백산맥", "조정래"));
		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("해리포터", "조앤 K 롤링"));
		list.add(new Book("토지", "박경리"));
		list.add(new Book("어린왕자", "생텍쥐페리"));
			
		for(int i=0; i<list.size(); i++) {
			Book book = list.get(i);
			book.showInfo();
		}
	
		
		
	}
}
