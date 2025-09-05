package streamTest;

public class Order {
	private static int idCounter = 1;
	
	private int orderId;
	private String itemName;
	private int quantity;
	private String memberName;
	
	public Order(int orderId, String itemName, int quantity, String memberName) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.memberName = memberName;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		Order.idCounter = idCounter;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", quantity=" + quantity + ", memberName="
				+ memberName + "]";
	}
	
	

}
