package castingTest;

public class CastingTest01 {
	public static void main(String[] args) {
//		자동 형변환
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
	
//		강제 형변환
		System.out.println(5 / (double)2);
		System.out.println((int)2.9 + 5);
		
		System.out.println("=============================");
		
//		8.43 + 2.59 = 10
		double number1 = 8.43, number2 = 2.59;
//		double result = number1 + number2;
		int result = (int)number1 + (int)number2;
		
		System.out.println(result);
	}
}


















