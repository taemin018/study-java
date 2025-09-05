package MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiIntInput {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[5];
		int count = 0;
		
		System.out.println("정수 5개를 입력하세요: ");
		
		while(count < 5) {
			try {
				System.out.println((count + 1) + "번째 정수: ");
				number[count] = scanner.nextInt();
				count++;
				
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				scanner.nextLine();
			}
		}
		
		System.out.println("입력한 정수들: ");
		for (int i = 0; i < number.length; i++) {
			System.out.println((number[i] + " "));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
