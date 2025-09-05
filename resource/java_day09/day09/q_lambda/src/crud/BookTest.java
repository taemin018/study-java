package crud;

public class BookTest {
	public static void main(String[] args) {
		
		BookManager manager = new BookManager();
		
        manager.addBook(new Book(1, "해리포터", "jk롤링"));
        manager.addBook(new Book(2, "빨간머리 앤", "맷 브라운"));
        manager.addBook(new Book(3, "어린왕자", "생텍쥐페리"));
		
		System.out.println("- 전체 도서 목록 -");
		manager.listBooks();
		
		boolean updated = manager.updateBookTitle(2, "빨간머리 앤");
		System.out.println(updated ? "\n도서 제목 수정 성공 " : "\n도서 제목 수정 실패");
		
		System.out.println("\n--수정 후 도서 목록 --");
		manager.listBooks();
		
		boolean removed = manager.removeBook(1);
		System.out.println(removed ? "\n도서 제목 수정 성공 " : "\n도서 제목 수정 실패");
		
		System.out.println("\n-- 삭제 후 도서 목록 --");
		manager.listBooks();
		
		
		
		
		
		
	}

}
