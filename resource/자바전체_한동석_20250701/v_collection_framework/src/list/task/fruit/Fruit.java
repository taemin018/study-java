package list.task.fruit;

import java.util.Objects;

public class Fruit {
	private String name;
	private int price;
	
	public Fruit() {;}
	
	public Fruit(Fruit fruit) {
		this(fruit.getName(), fruit.getPrice());
	}
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name);
	}
}
