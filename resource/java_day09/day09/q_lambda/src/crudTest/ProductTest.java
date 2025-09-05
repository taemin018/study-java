package crudTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductTest {
	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("노트북", 1500000));
		products.add(new Product("마우스", 5000));
		products.add(new Product("키보드", 12000));
		products.add(new Product("모니터", 300000));
		products.add(new Product("USB", 8000));

		
//		1. 가격이 10,000원 이상인 상품만 필터링하여 출력하세요.
		products.stream().filter(product -> product.getPrice() >= 10000)
		.forEach(System.out::println);
		
//		2. 모든 상품 이름을 대문자로 변환하여 출력하세요.
		products.stream().map(product -> product.getName().toUpperCase())
		.forEach(System.out::println);
		
//		4. 상품 가격만 추출해서 리스트로 저장하세요.
		List<Integer> priceList=
		products.stream().map(product -> product.getPrice()).collect(Collectors.toList());
		System.out.println(priceList);
		
		
//		5. 상품을 이름 기준으로 오름차순 정렬하여 출력하세요.
		products.stream().sorted(Comparator.comparing(Product::getName))
		.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
