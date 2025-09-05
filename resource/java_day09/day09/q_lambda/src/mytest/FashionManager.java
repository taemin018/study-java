package mytest;

import java.util.ArrayList;

public class FashionManager {
	private ArrayList<FashionItem> items = new ArrayList<FashionItem>();
	
//	1. 아이템 추가 (Create)
//	같은 ID의 아이템이 이미 존재하면 추가하지 않고 "이미 존재하는 ID입니다." 출력
	
	public void addItem(FashionItem item) {
		for (FashionItem fi : items) {
			if(fi.getId() == item.getId()) {
				System.out.println("이미 존재하는 ID입니다.");
				return;
			}
		}
		items.add(item);
		System.out.println("아이템이 추가되었습니다.");
	}
	
	
	
//	2. 전체 아이템 조회 (Read All)
//	전체 아이템 목록을 출력
	
	public void showAllItems() {
		if(items.isEmpty()) {
			System.out.println("등록된 아이템이 없습니다.");
			return;
		}
		for (FashionItem fashionItem : items) {
			System.out.println(fashionItem);
		}
	}
	
	
	
//  3. ID로 아이템 조회 (Read One)
//	 해당 ID가 없으면 "존재하지 않는 ID입니다." 출력
	
	public FashionItem getItemById(int id) {
		for (FashionItem fashionItem : items) {
			if(fashionItem.getId() == id) {
				return fashionItem;
			}
		}
		System.out.println("존재하지 않는 ID입니다.");
		return null;
	}
	
	
	
//	4. 아이템 정보 수정 (Update)
//	해당 ID의 아이템이 없으면 "수정할 아이템이 없습니다." 출력
	
	public void updateItem(int id ,String newName, String newCategory, int newPrice) {
		FashionItem item = getItemById(id);
		if(item != null) {
			item.setName(newName);
			item.setCategory(newCategory);
			item.setPrice(newPrice);
			System.out.println("아이템 정보가 수정되었습니다.");
			return;
		}
		System.out.println("해당 이름의 아이템을 찾을 수 없습니다.");
	}
	
	
//	5. 아이템 삭제 (Delete)
//	해당 ID의 아이템이 없으면 "삭제할 아이템이 없습니다." 출력
	
	public void deleteItem(int id) {
		for (int i = 0; i < items.size(); i++) {
			if(items.get(i).getId() == id) {
				items.remove(i);
				System.out.println("아이템이 삭제 되었습니다.");
				return;
			
		}
	}
		System.out.println("해당 이름의 아이템을 찾을 수 없습니다.");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
