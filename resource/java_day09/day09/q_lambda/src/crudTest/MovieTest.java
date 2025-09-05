package crudTest;

import java.util.ArrayList;
import java.util.Arrays;

import steamTestMy.Movie;

public class MovieTest {
	public static void main(String[] args) {
		
		Movie[] arMovie = {
	            new Movie("기생충", 8.6, 2019),
	            new Movie("인터스텔라", 8.5, 2014),
	            new Movie("어벤져스", 8.0, 2012),
	            new Movie("해리포터", 9.0, 2001),
	            new Movie("아이언맨", 7.9, 2008)
		};
		
		
//		평점이 8.0 이상이고, 제작년도가 2010년 이전인 영화만 필터링한다.
		//
//			필터된 영화의 제목만 추출한다.
		//
//			추출한 제목들을 알파벳 순으로 정렬한다.
		//
//			정렬된 제목 리스트를 출력한다.
		
		ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(arMovie));
		movies.stream().filter(movie -> movie.getRating() >= 8.0 && movie.getYear() <= 2010)
		.map(movie -> movie.getTitle()).sorted()
		.forEach(System.out::println);
		
		
		
		
		
		
	}
	
	
	
	
	

}
