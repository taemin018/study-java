package crudTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class City {
	public static void main(String[] args) {
		
		String[] arCity = {"Seoul", "Busan", "Incheon", "Daegu", "Gwangju", "Daejeon", "Ulsan"};
		
		ArrayList<String> cities = new ArrayList<String>(Arrays.asList(arCity));
		
		
//		도시 이름 중 글자 수가 5글자 이상인 것만 필터링
		cities.stream().filter(city -> city.length() >= 5)
		.forEach(System.out::println);
//
//		필터링된 도시 이름을 모두 대문자로 변환
		cities.stream().map(city -> city.toUpperCase())
		.forEach(System.out::println);
		
//
//		알파벳 역순(내림차순)으로 정렬
		cities.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
//
//		결과를 한 줄에 쉼표(,)로 구분해서 출력
		
		
		
		
	}

}
