package steamTestMy;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberTest {
	public static void main(String[] args) {
		
//		정수 배열이 주어진다.
//
//		짝수만 필터링한다.
//
//		짝수에 대해 제곱(자기 자신 곱하기)을 계산한다.
//
//		계산한 제곱값을 출력한다
		
		
		Integer[] arNumber = {1, 2, 3, 4, 5, 6};
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(arNumber));

		numbers.stream().filter(number -> number % 2 == 0).map(number -> number * number).forEach(System.out::println);
		
		
	}

}
