package streamTest;

import java.util.ArrayList;

public class OrderManager {
	
	private ArrayList<Member> members = new ArrayList<Member>();
	private ArrayList<Order> orders = new ArrayList<Order>();
	
//	1. 회원 등록 (Create Member)
//	이름과 나이로 회원 등록
//	같은 이름의 회원은 중복 불가
	
	public void addMember(Member member) {
		for (Member m : members) {
			if(m.getName().equals(member.getName())) {
				System.out.println("이미 등록된 회원입니다.");
				return;
			}
		}
		members.add(member);
		System.out.println(member.getName() + "회원 등록");
	}
	
//	2. 주문 추가 (Create Order)
//	주문 상품명, 수량, 회원 이름으로 주문 등록
//	회원이 존재하지 않으면 주문 불가
	
	public void addOrder(String memberName, Stirng itemName, int quantity) {
		if(!memberExits(memberName)) {
			System.out.println("해당 회원이 존재하지 않습니다.");
			return;
		}
		orders.add(new Order(itemName, quantity, memberName));
		System.out.println("주문 완료");
	}
	
//	3. 회원별 주문 목록 출력 (Read)
//	특정 회원이 주문한 목록만 출력

	public void printOrdersByMember(String memberName) {
		System.out.println(" -- 주문 목록 -- ");
		boolean found = false;
		for (Order o : orders) {
			if(o.getMemberName().equals(memberName)) {
				System.out.println(o);
				found = true;
			}
		}
		if(!found) {
			System.out.println("주문이 없습니다.");
		}
	}
	
//	4. 주문 수정 (Update)
//	주문 ID로 수량 수정
	
	public void uqdateOrder(int orderId, int newQuantity) {
		for (Order order : orders) {
			if(order.getOrderId() == orderId) {
				order.setQuantity(newQuantity);
				System.out.println("주문 수정 완료");
				return;
			}
		}
		System.out.println("해당 주문 ID를 찾을 수 없습니다.");
	}

	
	
	
	
//	5. 주문 삭제 (Delete)
//	주문 ID로 삭제
	
	public void deleteOrder(int orderId) {
		for (int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderId() == orderId) {
				orders.remove(i);
				System.out.println("주문 삭제 완료");
				return;
			}
		}
		System.out.println("해당 주문 ID를 찾을 수 없습니다.");
	}

}
