package mytest;

public class FashionItem {
	
//	아이템 고유 번호, 아이템 이름, 카테고리, 가격 
	
	private int id;
	private String name;
	private String category;
	private int price;
	
	public FashionItem(int id, String name, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FashionItem [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	

}
