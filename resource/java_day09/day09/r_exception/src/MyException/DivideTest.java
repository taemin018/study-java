package MyException;

import java.util.Scanner;

public class DivideTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		while(true) {
			
			try {
				System.out.println("첫 번째 정수를 입력하세요: ");
				num1 = scanner.nextInt();
				
				System.out.println("두 번째 정수를 입력하세요: ");
				num2 = scanner.nextInt();
				
				int result = num1 / num2;
				System.out.println("나누기 결과: " + result);
				break;
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
	
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
