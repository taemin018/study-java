package inputTest;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
//		두 정수를 입력받은 뒤 곱셈 결과를 출력한다.
//		단, nextInt()가 아닌 next()로 사용한다.
		Scanner scanner = new Scanner(System.in);
		
		String message = "두 개의 정수를 입력하세요.";
		String example = "예)4 5";
		String format = "%d * %d = %d";
		
		int number1 = 0, number2 = 0;
		int result = 0;
		
		System.out.println(message);
		System.out.println(example);
		
		number1 = Integer.parseInt(scanner.next());
		number2 = Integer.parseInt(scanner.next());
		
		result = number1 * number2;
		
		System.out.printf(format, number1, number2, result);
	}
}













