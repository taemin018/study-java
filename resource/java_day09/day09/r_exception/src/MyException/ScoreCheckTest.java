package MyException;

import java.util.Scanner;

public class ScoreCheckTest {
	public static void checkScore(int score) throws InvalidScoreException {
		
		if(score < 0 || score > 100) {
			throw new InvalidScoreException("점수가 유효하지 않다.")
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		try {
			checkScore(score);
			System.out.println("입력한 점수: " + score);
		} catch (InvalidScoreException e) {
			System.out.println("점수가 유효하지 않습니다.");
		}
		
		
	}

}
