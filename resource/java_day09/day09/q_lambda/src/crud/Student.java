package crud;

public class Student {
	
	private int studentId;
	private String name;
	private int score;
	
	
	public Student(int studentId, String name, int score) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.score = score;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
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
