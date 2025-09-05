package crud;

import java.util.ArrayList;

public class BookManager {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void listBooks() {
		if(books.isEmpty()) {
			System.out.println("도서 목록이 비어 있습니다.");
			return;
			
		}
		for(Book b : books) {
			System.out.println(b);
		}
				
	}
	
	public boolean updateBookTitle(int id, String newTitle) {
		for(Book b : books) {
			if(b.getId() == id) {
				b.setTitle(newTitle);
				return true;
				
			}
		}
		return false;
	}
	
	public boolean removeBook(int id) {
		return books.removeIf(b -> b.getId() == id);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
