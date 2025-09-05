package mytest;

import java.util.ArrayList;

public class FoodManager {
	
	private ArrayList<FoodOrder> foodOrders = new ArrayList<FoodOrder>();
	
	
    // 1. 메뉴 등록 (Create)
	
	public void addMenu(FoodOrder order) {
		for (FoodOrder foodOrder : foodOrders) {
			if(foodOrder.getOrderId() == order.getOrderId()) {	
			
				System.out.println("이미 존재하는 주문번호입니다.");
				return;
		}
	}
		foodOrders.add(order);
		System.out.println("메뉴가 추가되었습니다.");
}
	
	
	
	
    // 2. 전체 메뉴 조회 (Read)
	public void printAll() {
		if(foodOrders.isEmpty()) {
			System.out.println("등록된 메뉴가 없습니다.");
			return;
		}
		for (FoodOrder foodOrder : foodOrders) {
			System.out.println(foodOrder);
		}
		
	}
	
	
    // 3. 메뉴 재고 수정 (Update)
    // orderId를 기준으로 menuName, stock 수정
	
	public void update(int orderId, String newMenuName, int newStock) {
		for (FoodOrder foodOrder : foodOrders) {
			if(foodOrder.getOrderId() == orderId) {
				foodOrder.setMenuName(newMenuName);
				foodOrder.setStock(newStock);
				System.out.println("메뉴가 수정되었습니다.");
				return;
			}
		}
		System.out.println("해당 주문 번호를 찾을 수 없습니다.");
		
	}
	
	
	
    // 4. 메뉴 삭제 (Delete)
	
	public void deleteOrder(int orderId) {
		for (int i = 0; i < foodOrders.size(); i++) {
			if(foodOrders.get(i).getOrderId() == orderId) {
				foodOrders.remove(i);
				System.out.println("메뉴가 삭제되었습니다.");
				return;
			}
		}
		System.out.println("해당 주문번호를 찾을 수 없습니다.");
	}
	
	
	
	
	
	
	

}
