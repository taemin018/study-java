package stringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중
//		소문자는 모두 대문자로, 대문자는 모두 소문자로 변경한다.
//		소문자 범위: 97 ~ 122
//		대문자 범위: 65 ~ 90
//		String message = "문자열: ";
//		String data = null, result = "";
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print(message);
//		data = scanner.nextLine();
//		
//		for (int i = 0; i < data.length(); i++) {
//			char c = data.charAt(i);
//			
//			if(c >= 97 && c <= 122) {
////				소문자일 때
//				result += (char)(c - 32);
//				
//			}else if(c >= 65 && c <= 90) {
////				대문자일 때
//				result += (char)(c + 32);
//				
//			}else {
////				알파벳이 아닐 때
//				result += c;
//			}
//		}
//		
//		System.out.println(result);
		
//		사용자에게 입력받은 문자열 중
//		소문자의 총 개수를 출력한다.
//		String message = "문자열: ";
//		String data = null;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print(message);
//		data = scanner.nextLine();
//		int count = 0;
//		
//		for (int i = 0; i < data.length(); i++) {
//			
//			char c = data.charAt(i);
//			
//			if(c >= 97 && c <= 122) {
////				소문자일 때
////				count += 1;
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
//		아래의 주소에서 "/samsung"만 분리하여 출력한다.
//		www.naver.com/baseball/samsung
//		String url = "www.naver.com/baseball/samsung";
//		int fromIndex = url.lastIndexOf("/");
//		System.out.println(url.substring(fromIndex));
		
//		아래의 주소들을 배열에 담고, 마지막 경로가 samsung인 것만 출력한다.
//		www.naver.com/baseball/samsung
//		www.naver.com/baseball/lg
//		www.naver.com/baseball/lotte
//		www.naver.com/baseball/kt
//		www.naver.com/phone/samsung
//		String[] arData = {
//				"www.naver.com/baseball/samsung", 
//				"www.naver.com/baseball/lg", 
//				"www.naver.com/baseball/lotte", 
//				"www.naver.com/baseball/kt", 
//				"www.naver.com/phone/samsung"
//		};
//		String target = "samsung";
//		
//		for (int i = 0; i < arData.length; i++) {
//			String[] arAddress = arData[i].split("/");
//			if(arAddress[arAddress.length - 1].equals(target)) {
//				System.out.println(arData[i]);
//			}
//		}
	}
}






















