package MyException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadTest {
		
	public static void readFile(String fileName) throws FileNotFoundException {
		
		FileReadTest reader = new FileReader(fileName);
		System.out.println(fileName + "파일을 성공적으로 열었습니다.");
		
	}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("읽을 파일명을 입력하세요: ");
			String fileName = scanner.nextLine();
			
			try {
				readFile(fileName);
			} catch (FileNotFoundException e){
				System.out.println("파일이 존재 하지 않습니다.");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	

}
