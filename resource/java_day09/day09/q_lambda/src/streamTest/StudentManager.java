package streamTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManager {
	private ArrayList<Student> students = new ArrayList<Student>();
	private Scanner sc = new Scanner(System.in);
	private int nextId = 1;
	
	public void addStudent() {
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("나이 입력: ");
		int age = Integer.parseInt(sc.nextLine());
		Student student = new Student(nextId++, name, age);
		students.add(student);
		System.out.println("학생이 등록되었습니다.");
	}
	
	private void readStudents() {
		if(students.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	private void updateStudent() {
		System.out.println("수정할 학생ID 입력: ");
		int id = Integer.parseInt(sc.nextLine());
		Student target = findStudentById(id);
		if(target == null) {
			System.out.println("해당 ID의 학생이 없습니다.");
			return;
		}
		
		System.out.println("새 이름: ");
		String name = sc.nextLine();
		System.out.println("새 나이: ");
		int age = Integer.parseInt(sc.nextLine());
		
		target.setName(name);
		target.setAge(age);
		System.out.println("수정완료");
		
	}
	private void deleteStudent() {
		System.out.println("삭제할 학생 ID 입력: ");
		int id = Integer.parseInt(sc.nextLine());
		Student target = findStudentById(id);
		if(target == null) {
			System.out.println("해당 ID의 학생이 없습니다.");
			return;
			
		}
		students.remove(target);
		System.out.println("삭제 완료");
	}
	
	private Student findStudentBtId(int id) {
		for (Student student : students) {
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}
	
}


















