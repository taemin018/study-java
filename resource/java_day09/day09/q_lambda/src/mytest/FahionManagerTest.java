package mytest;

public class FahionManagerTest {
	public static void main(String[] args) {
		
		FashionManager manager = new FashionManager();
		
		manager.addItem(new FashionItem(101, "청바지", "하의", 49000));
        manager.addItem(new FashionItem(102, "후드티", "상의", 39000));
        manager.addItem(new FashionItem(101, "운동화", "신발", 69000));
		
		
		System.out.println("\n [전체 아이템 목록]");
		manager.showAllItems();
		
		System.out.println("\n[ID 102 아이템 조회]");
		FashionItem item = manager.getItemById(102);
		if(item != null) {
			System.out.println(item);
		}
		
		System.out.println("\n[ID 103 아이템 수정]");
		manager.updateItem(103, "러닝화","신발", 75000);
		
		System.out.println("n[ID로 102 아이템 삭제]");
		manager.deleteItem(102);
		
		System.out.println("\n[최종 아이템 목록]");
		manager.showAllItems();
	}

}
