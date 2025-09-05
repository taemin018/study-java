package crud;

import java.util.ArrayList;
import java.util.Arrays;

public class productTest {
	public static void main(String[] args) {
		
		Product[] arProduct = {
				new Product("노트북", 1500000),
				new Product("무선 마우스", 25000),
				new Product("키보드", 18000),
				new Product("모니터", 300000),
				new Product("USB", 12000)
				
		};
		
		ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(arProduct));
		products.stream().filter(product -> product.getPrice() >= 20000)
		.forEach(product -> {int raisePrice = (int)(product.getPrice() * 1.15);
		System.out.println(product.getName() + "의 인상된 가격: " + raisePrice + "원");
		});
		
		
		
		
		
		
		
		
	}

}
