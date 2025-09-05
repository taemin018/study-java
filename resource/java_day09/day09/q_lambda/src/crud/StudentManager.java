package crud;

import java.util.ArrayList;

public class StudentManager {
	
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public void addStudent(Student student) {
		if(findStudentById(student.getStudentId()) != null) {
			System.out.println("이미 존재하는 ID입니다.");
			return;
		}
		
		students.add(student);
		System.out.println("학생 추가 완료");
	}
	
	
	public void showAllStudents() {
		if(students.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}
		for (Student student : students) {
			System.out.println(student);
			
		}
	}
	
	
	public Student findStudentById(int studentId) {
		for (Student s : students) {
			if(s.getStudentId() == studentId) {
				return s;
			}
		}
		return  null;
	}
	
	public boolean updateScore(int studentId , int newScore) {
		Student s = findStudentById(studentId);
		if (s != null) {
			s.setScore(newScore);
			System.out.println("정수 수정 완료");
			return true;
		}
		System.out.println("해당 ID를 가진 학생이 없습니다.");
		return false;
	}
	
	public boolean deleteStudent(int studentId) {
		Student s = findStudentById(studentId);
		if (s != null) {
			students.remove(s);
			System.out.println("학생 삭제 완료");
			return true;
			
		}
		System.out.println("해당 ID를 가진 학생이 없습니다.");
		return false;
	}
	
	
	

}
