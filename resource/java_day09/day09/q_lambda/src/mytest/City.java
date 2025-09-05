package mytest;

import java.util.ArrayList;
import java.util.Arrays;

public class City {
	public static void main(String[] args) {
		
//		문제: 5글자 이인 도시 이름의 개수를 출력하라
		String[] arCity = {"Seoul", "Busan", "Incheon", "Daegu", "Gwangju", "Daejeon", "Ulsan"};

		long count = 
		Arrays.stream(arCity).filter(city -> city.length() <= 5).count();
		System.out.println(count);
		
		
		
		
		
		
		
		
	}

}
