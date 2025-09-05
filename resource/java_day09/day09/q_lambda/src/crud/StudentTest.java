package crud;

public class StudentTest {
	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		
		manager.addStudent(new Student(1,"손흥민",85));
		manager.addStudent(new Student(2,"이강인",90));
		manager.addStudent(new Student(1,"이미 등록",100));
		
		
		System.out.println("\n전체 학생 목록: ");
		manager.showAllStudents();
		
		System.out.println("\nID가 1인 학생의 점수 수정: ");
		manager.updateScore(1,95);
		
		
		System.out.println("\nID가 2인 학생 삭제: ");
		manager.deleteStudent(2);
		
		
		System.out.println("\n최종 학생 목록: ");
		manager.showAllStudents();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
