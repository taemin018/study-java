package MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumInputTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("첫번째 정수를 입력하세요: ");
			int num1 = scanner.nextInt();
			
			System.out.println("두번째 정수를 입력하세요: ");
			int num2 = scanner.nextInt();
			
			int sum = num1 + 2;
			System.out.println("두수의 합: " + sum);
		
		}catch (InputMismatchException e) {
			System.out.println("정수만 입력할 수 있습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
