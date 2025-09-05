package mytest;

import java.util.ArrayList;

public class BookManager {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	
//	1. 도서 등록 (Create)
//	addBook(Book book)
//	동일한 bookId가 존재하면 등록 실패
//
	public void addBook(Book book) {
		for (Book b : books) {
			if(b.getBookId() == book.getBookId()) {
				System.out.println("이미 등록 되어있는 책입니다.");
				return;
			}
		}
		books.add(book);
		System.out.println("책이 추가 되었습니다.");
	}
	
	
	
	
	
//	2. 전체 도서 목록 조회 (Read)
//	printAll()
//
	
	public void printAll() {
		if(books.isEmpty()) {
			System.out.println("등록 되어 있는 책이 없습니다.");
			return;
		}
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	
	
	
	
	
	
//	3. 제목으로 도서 정보 수정 (Update)
//	updateBook(String title, String newAuthor, boolean newAvailable)
//
	public void updateBook(String title, String newAuthor, boolean newAvailable) {
		for (Book book : books) {
			if(book.getTitle().equals(title)) {
				book.setAuthor(newAuthor);
				book.setAvilable(newAvailable);
				System.out.println("책 정보가 수정되었습니다.");
				return;
			}
		}
		System.out.println("해당 제목의 도서를 찾을 수 없습니다.");
		
		
	}
	
	
	
	
	
	
	
	
	
//	4. 제목으로 도서 삭제 (Delete)
//	deleteBook(String title)
	
	public void deleteBook(String title) {
		 for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				books.remove(i);
				System.out.println("책이 삭제 되었습니다.");
				return;
			 
		}
	}
		 System.out.println("해당 제목의 책을 찾을 수 없습니다.");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
