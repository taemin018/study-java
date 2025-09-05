package MyException;

import java.util.Scanner;

public class DepositTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("입금할 금액을 입력하세요: ");
			int amount = scanner.nextInt();
			
			deposit(amount);
			System.out.println("입금완료: " + amount + "원");
			
		} catch(InvalidAmountException e) {
			System.out.println("예외 발생 : " + e.getMessage());
			
		} catch(Exception e) {
			System.out.println("기타 예외 : " + e.getMessage());
		}finally {
			scanner.close();
		}
		
		
	}
	
	public static void deposit(int amount) throws InvalidAmountException{
		if (amount <= 0) {
			throw new InvalidAmountException("입금액은 1원 이상이어야 된다.");
		}
	}
}

	
