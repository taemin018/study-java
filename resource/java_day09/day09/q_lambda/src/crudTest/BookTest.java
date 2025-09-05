package crudTest;

import java.util.ArrayList;
import java.util.Comparator;

public class BookTest {
	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Java Programming", "홍길동", 450));
		books.add(new Book("Python Basics", "김철수", 320));
		books.add(new Book("Web Design", "홍길동", 280));
		books.add(new Book("Data Structures", "이영희", 370));
		books.add(new Book("Algorithms", "박민수", 250));

		
//		1. 페이지 수가 300쪽 이상인 책만 출력하세요.
		
		books.stream().filter(book -> book.getPages() >= 300).forEach(System.out::println);
		
//		2. 저자가 "홍길동"인 책이 몇 권인지 출력하세요.
		
		long count =
		books.stream().map(book -> book.getAuthor().equals("홍길동")).count();
		System.out.println(count + "권");
		
//		3. 모든 책 제목을 대문자로 변환하여 출력하세요.
		
		books.stream().map(book -> book.getTitle().toUpperCase())
		.forEach(System.out::println);
		
//		4. 책 제목을 기준으로 오름차순 정렬하여 출력하세요.
		
		books.stream().sorted(Comparator.comparing(Book::getTitle))
		.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}

}
