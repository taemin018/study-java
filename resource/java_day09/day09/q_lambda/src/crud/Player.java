package crud;

public class Player {
//	선수 이름,포지션, 나이, 득점 
	
	private String name;
	private String position;
	private	int age;
	private int score;
	
	public Player(String name, String position, int age, int score) {
		super();
		this.name = name;
		this.position = position;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", position=" + position + ", age=" + age + ", score=" + score + "]";
	}
	
	
	
	

}
