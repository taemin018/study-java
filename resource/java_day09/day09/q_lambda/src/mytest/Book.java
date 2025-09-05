package mytest;

public class Book {
	
	private int bookId;
	private String title;
	private String author;
	private boolean avilable;
	public Book(int bookId, String title, String author, boolean avilable) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.avilable = avilable;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isAvilable() {
		return avilable;
	}
	public void setAvilable(boolean avilable) {
		this.avilable = avilable;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", avilable=" + avilable + "]";
	}
	
	
	
	
}
