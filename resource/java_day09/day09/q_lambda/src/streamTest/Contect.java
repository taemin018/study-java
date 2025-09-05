package streamTest;

public class Contect {
	
	private String name;
	private String phone;
	
	public Contect(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contect [name=" + name + ", phone=" + phone + "]";
	}
	
	

}
