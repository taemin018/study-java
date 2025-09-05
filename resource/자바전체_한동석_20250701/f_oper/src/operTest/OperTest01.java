package operTest;

public class OperTest01 {
	public static void main(String[] args) {
		
		boolean isTrue = 10 == 11;
		boolean result = isTrue && 10 <= 20;
		boolean condition = false;
		
		System.out.println(10 == 11);
		System.out.println(10 > 3);
		System.out.println(isTrue);
		System.out.println(result);
		
//		isTrue && 10 <= 20의 결과를 true가 나오도록 변경하기
//		단, 숫자는 변경하지 않는다.
		condition = isTrue || 10 <= 20;
		
		System.out.println(!result);
		System.out.println(condition);
		
		condition = !isTrue && 10 <= 20;
		System.out.println(condition);
	}
}



















