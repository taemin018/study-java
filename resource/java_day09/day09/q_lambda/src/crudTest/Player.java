package crudTest;

public class Player {
    private String name;       
    private String position;   
    private int age;           
    private int goals;
    
	public Player(String name, String position, int age, int goals) {
		super();
		this.name = name;
		this.position = position;
		this.age = age;
		this.goals = goals;
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

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", position=" + position + ", age=" + age + ", goals=" + goals + "]";
	}     
    
	
	
	
    
    
    
}

