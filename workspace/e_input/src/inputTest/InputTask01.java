package inputTest;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
//		반려동물 이름을 입력받고 출력하기
		String petNameMessage = "반려동물 이름을 입력해주세요.";
		String petName = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(petNameMessage);
		petName = sc.next();
		
		System.out.println(petName);
	}
}
