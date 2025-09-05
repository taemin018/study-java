package crudTest;

import java.util.ArrayList;

public class StudentManager {
		private ArrayList<Student> students = new ArrayList<Student>();
	
//	학생 추가
//	같은 id를 가진 학생이 이미 존재하면 추가 불가능하도록 처리하세요.
		
		public void addStudent(Student student) {
			for (Student s : students) {
				if(s.getId() == student.getId()) {
					System.out.println("이미 존재하는 학번입니다.");
					return;
				}
			}
			student.add(student);
			System.out.println("학생이 추가되었습니다.");
			
		}
	
	
		
		
		
//	전체 학생 조회
//	저장된 모든 학생 정보를 출력하세요.
		
		public void showAllStudent() {
			if(students.isEmpty()) {
				System.out.println("등록된 학생이 없습니다.");
				return;
			}
			for (Student s : students) {
				System.out.println(s);
				
			}
		}
		
		
//	학생 검색 (학번으로)
//	학번을 입력받아 해당 학생 정보를 출력하세요.
		
		public Student findStudent(int id) {
			for (Student s : students) {
				if(s.getId() == id) {
					return s;
				}
				
			}
			return null;
		}
		
		
//	학생 정보 수정
//	학번을 입력받고, 이름과 점수를 새로 입력받아 수정하세요.
		
		public boolean updateStudent(int id, String newName, String newScore) {
			Student student = findStudent(id);
			if(student != null) {
				student.setName(newName);
				student.setScore(id);
				System.out.println("학생 정보가 수정되었습니다");
				return true;
			}
			System.out.println("해당 학번의 학생이 없습니다.");
			return false;
		}
		
		
		
		
		
//	학생 삭제
//	학번을 입력받아 해당 학생 정보를 삭제하세요.
		
		
		public boolean deleteStudent(int id) {
			Student student = findStudent(id);
			if(student != null) {
				students.remove(student);
				System.out.println("학생이 삭제 되었습니다.");
				return true;
			}
			System.out.println("해당 학번의 학생이 없습니다.");
			return false;
		}
		
	
	
	

		
		
		
}
