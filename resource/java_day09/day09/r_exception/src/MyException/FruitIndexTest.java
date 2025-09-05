package MyException;

import java.util.Scanner;

public class FruitIndexTest {
	public static void main(String[] args) {
		
		String[] fruits = {"사과", "바나나","포도","오렌지"};
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			System.out.println("과일 인덱스를 입력하세요: ");
			int index = scanner.nextInt();
			System.out.println(fruits[index]);
			
		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("잘못된 인덱스입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
