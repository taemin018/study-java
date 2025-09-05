package steamTestMy;

public class Student {
	
	private String name;
	private int score;
	private boolean passed;
	
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
        this.passed = score >= 60;
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


	public boolean isPassed() {
		return passed;
	}


	public void setPassed(boolean passed) {
		this.passed = passed;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", passed=" + passed + "]";
	}
	
	
	
	
	
	

}
