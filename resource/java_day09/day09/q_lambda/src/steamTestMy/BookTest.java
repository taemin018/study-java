package steamTestMy;

import java.util.ArrayList;
import java.util.Arrays;

public class BookTest {
	
	public static void main(String[] args) {
		
		Book[] arBook = {
			    new Book("해리포터", "jk롤링", 900),
			    new Book("어린왕자", "생텍쥐페리", 450),
			    new Book("빨간 머리 앤", "루시 몽고메리", 350),
			    new Book("다빈치코드", "댄 브라운", 700),
			};

		
//		페이지 수가 400쪽 이상인 책만 필터링한다.
//
//		필터된 책의 제목만 추출한다.
//
//		제목을 알파벳 순(오름차순)으로 정렬한다.
//
//		List를 사용하지 말고, forEach로 바로 출력한다.
		
		
		ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(arBook));
		
		books.stream().filter(book -> book.getPages() >= 400).map(book -> book.getTitle()).sorted()
		.forEach(title -> System.out.println(title));
		
		
		
		
		
		
	}

}
