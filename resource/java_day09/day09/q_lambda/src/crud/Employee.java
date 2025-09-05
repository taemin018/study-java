package crud;

public class Employee {
	
	private String name;
	private int Salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Salary=" + Salary + "]";
	}
	
	
}	
		
		
		
		
		
		
		
		
		
	


