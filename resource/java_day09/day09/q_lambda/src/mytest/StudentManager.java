package mytest;

import java.util.ArrayList;

public class StudentManager {
	private ArrayList<Student> students = new ArrayList<Student>();
	
    // 1. 학생 등록 (Create)
	//	점수는 0~100 사이 정수로 제한 (100 이상 또는 음수는 허용하지 않음)
	public void addStudent(Student student) {
		for (Student s : students) {
			if(s.getStudentId().equals(student.getStudentId())) {
				System.out.println("이미 등록된 학번입니다.");
				return;
			}
		}
		if (student.getScore() < 0 || student.getScore() > 100) {
			System.out.println("점수는 0~100점 사이여야 합니다.");
			return;
		}
		
		students.add(student);
		System.out.println("학생 등록이 완료되었습니다.");
	}
	
	
	
	
	
    // 2. 전체 학생 목록 출력 (Read)
	
	public void printAll() {
		if(students.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	
	
	
	
	
    // 3. 학번으로 성적 수정 (Update)
	
	public void update(String studentId, int newScore) {
		for (Student student : students) {
			if(student.getStudentId().equals(studentId)) {
				student.setScore(newScore);
				System.out.println("성적이 수정되었습니다.");
				return;
			}
		}
		System.out.println("해당 학번을 찾을 수 없습니다.");
	}
	
	
	
	
	
	
    // 4. 학번으로 학생 삭제 (Delete)
	
	public void delete(String studentId) {
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getStudentId().equals(studentId)) {
				students.remove(i);
				System.out.println("학생이 삭제 되었습니다.");
				return;
			}
		}
		System.out.println("해당 학번을 찾을 수 없습니다.");
		
	}
	
	
	
	
	

}
