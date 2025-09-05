package mytest;

public class Student {
//	학번, 학생이름, 점수 
	
	private String studentId;
	private String name;
	private int score;
	
	public Student(String studentId, String name, int score) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.score = score;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", score=" + score + "]";
	}
	
	
	
	
	

}
