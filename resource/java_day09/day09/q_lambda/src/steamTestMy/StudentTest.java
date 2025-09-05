package steamTestMy;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
	public static void main(String[] args) {
		
		Student[] arStudents = {
				new Student("홍길동",55),
				new Student("손흥민",78),
				new Student("이강인",80),
				new Student("김민재",96),
				new Student("이재성",47)
				
				
				
		};
		
		
		ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(arStudents));
		students.stream().filter(student ->student.isPassed()).map(student -> new Student(student.getName(), student.getScore() + 10))
		.forEach(student ->System.out.println(student.getName() + " : " + student.getScore()));
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
