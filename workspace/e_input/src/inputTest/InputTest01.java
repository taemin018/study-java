package inputTest;

import java.util.Scanner;

public class InputTest01 {
	public static void main(String[] args) {
//		이름을 입력받고 출력하기
		String nameMessage = "이름: ";
		String name = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(nameMessage);
		name = scanner.next();
		
		System.out.println(name);
		
	}
}















