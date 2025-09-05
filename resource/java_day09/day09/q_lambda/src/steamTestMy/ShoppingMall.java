package steamTestMy;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingMall {
	
	private ArrayList<Product> productList = new ArrayList<>();
	private ArrayList<Product> cart = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public void run() {
		while(true) {
			System.out.println("\n1. 상품 등록 | 2. 상품 목록 | 3. 장바구니 담기 | 4. 장바구니 보기 | 5. 결제 | 0. 종료");
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();
			
            switch (menu) {
            case 1: addProduct(); break;
            case 2: listProducts(); break;
            case 3: addToCart(); break;
            case 4: viewCart(); break;
            case 5: checkout(); break;
            case 0:
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                System.out.println("잘못된 입력입니다.");
			
            }
		}
		
	}
//	1. 상품 등록 (addProduct)
//	상품의 id, name, price를 입력받아 등록합니다.
//
//	상품 ID는 중복될 수 없습니다.
//
//	중복될 경우 "이미 존재하는 ID입니다." 출력
	
	public void addProduct() {
		
		System.out.println("상품ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("상품 이름: ");
		String name = sc.nextLine();
		
		System.out.println("상품 가격: ");
		int price = sc.nextInt();
		
		for (Product p : productList) {
			if(p.getId() == id) {
				System.out.println("이미 존재하는 아이디 입니다.");
				return;
			}
			
		}
		
		productList.add(new Product(id, name, price));
		System.out.println("상품 등록이 완료되었습니다.");
		
	}
	
//	2. 상품 목록 보기 (listProducts)
//	등록된 모든 상품의 정보를 출력합니다.

//	상품이 하나도 없다면 "등록된 상품이 없습니다." 출력
	
	public void listProducts() {
		if(productList.isEmpty()) {
			System.out.println("등록된 상품이 없습니다.");
			return;
			
		}
		System.out.println(" -- 상품 목록 -- ");
		for (Product product : productList) {
			System.out.println(product);
			
		}
		
	}
	
//	3. 장바구니 담기 (addToCart)
//	상품 ID를 입력받아 장바구니에 담습니다.
//
//	해당 ID의 상품이 존재하지 않으면 "해당 ID의 상품을 찾을 수 없습니다." 출력
	public void addToCart() {
		System.out.println("장바구니에 담을 상품 ID: ");
		int id = sc.nextInt();
		
		for (Product product : productList) {
			if(product.getId() == id) {
				cart.add(product);
				System.out.println("장바구니에 상품이 등록되었습니다.");
				return;
			}
		}
		System.out.println("해당 ID의 상품을 찾을 수 없습니다.");
	}
	
//	4. 장바구니 보기 (viewCart)
//	현재 장바구니에 담긴 상품들을 출력합니다.
//
//	상품이 하나도 없다면 "장바구니가 비어 있습니다." 출력
	public void viewCart() {
		if(cart.isEmpty()) {
			System.out.println("장바구니가 비어있습니다.");
			return;
		}
		System.out.println(" -- 장바구니 상품 목록 -- ");
		for (Product product : cart) {
			System.out.println(product);
		}
	}

	
	
	
	
	
	
	
	
	
	

}
