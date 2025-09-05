package inputTest;

import java.util.Scanner;

public class InputTask03 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//		nextInt() 사용하기
		Scanner scanner = new Scanner(System.in);
		
		int number1 = 0, number2 = 0, number3 = 0;
		int result = 0;
		
		String message = "3개의 정수를 입력해주세요.\n";
		String example = "예)3 6 7";
		String format = "%d + %d + %d = %d\n";
		
		System.out.println(message + example);
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		number3 = scanner.nextInt();
		
//		System.out.println(number1);
//		System.out.println(number2);
//		System.out.println(number3);
		
		result = number1 + number2 + number3;
		
//		System.out.println(result);
		System.out.printf(format, number1, number2, number3, result);
		
	}
}


















