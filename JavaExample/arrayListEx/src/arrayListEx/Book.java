package arrayListEx;

public class Book {
	String bookName;
	String author;

	public Book(String bookname, String author) {
		this.bookName = bookname;
		this.author = author;
	}
	
	public void setBookName(String bookname) {
		this.bookName = bookname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void showInfo() {
		System.out.println("책 이름은 : " + bookName + "이며,");
		System.out.println("책 저자는 : " + author + "입니다");
	}
}

