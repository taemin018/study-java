package mytest;

public class FoodOrder {
	
//	주문아이디, 메뉴이름, 재고 
	private int orderId;
	private String menuName;
	private int stock;
	
	public FoodOrder(int orderId, String menuName, int stock) {
		super();
		this.orderId = orderId;
		this.menuName = menuName;
		this.stock = stock;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "FoodOrder [orderId=" + orderId + ", menuName=" + menuName + ", stock=" + stock + "]";
	}

	
}
