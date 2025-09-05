package streamTest;

import java.util.ArrayList;

public class ProductManager {
	private ArrayList<Product> products = new ArrayList<>();
	
//	1. 상품 등록 (Create)
//	상품명, 가격, 재고 수량을 입력받아 등록
	public Product addProduct(Product product) {
		for (Product p : products) {
			if(p.getName().equals(product.getName()));
				System.out.println("이미 등록된 상품입니다.");
				return;
		}
		products.add(product);
		System.out.println("상품이 등록되었습니다.");
	}	

//	2. 전체 상품 목록 조회 (Read)
//	모든 상품을 출력
	public void printAll() {
		if(products.isEmpty()) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		}
		for (Product product : products) {
			System.out.println(product);
			
		}
	}
//	3. 상품 정보 수정 (Update)
//	상품 ID로 해당 상품의 이름, 가격, 재고를 수정
	public void updateProduct(String name, int newPrice, int newStock) {
		for (Product product : products) {
			if(product.getName().equals(name)) {
				if(newPrice < 0 || newStock < 0) {
					System.out.println("가격과 재고는 0 이상이여야 합니다.");
					return;
				}
				product.setPrice(newPrice);
				product.setStock(newStock);
				System.out.println("상품정보가 수정되었습니다.");
				return;
			}
		}
		System.out.println("해당 상품을 찾을 수 없습니다.");
		
	}
	
//	4. 상품 삭제 (Delete)
//	상품 ID로 해당 상품 삭제
	public void deleteProduct(String name) {
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getName().equals(name)) {
				products.remove(i);
				System.out.println("상품이 삭제 되었습니다.");
				return;
			}
		}
		System.out.println("해당 상품을 찾을 수 없습니다.");
	}
	
//	5. 가장 비싼 상품 출력 
	public void printTopProduct() {
		if(products.isEmpty()) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		}
		product top = products.get(0);
		for (Product product : products) {
			if(product.getPrice() > top.getPrice()) {
				top = product;
			}
		}
		System.out.println("가장 비싼 상품: ");
		System.out.println(top);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
