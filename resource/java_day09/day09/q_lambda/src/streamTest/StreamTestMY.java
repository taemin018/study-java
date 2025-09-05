package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class StreamTestMY {
	public static void main(String[] args) {
		
//		1 ~ 10까지 ArrayList에 담고 출력
		
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach((number)->{datas.add(number);});
//		
		
//		10 ~ 1까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach((data) -> {datas.add(10-data);});
//		datas.forEach(System.out::println);
		
		
		
//		배열을 ArrayList로 변경하는 방법
//		Integer[] arData = {10,20,30,40,50};
//		ArrayList<Integer>datas = new ArrayList<Integer>(Arrays.asList(arData));
//		
		
		
//		ArrayList를 배열로 변경하는 방법
//		Object[] arData = null;
//		ArrayList<Integer>datas = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
//		arData = datas.toArray();
//		System.out.println(Arrays.toString(arData));
		
//		10 ~ 100까지 출력
		
//		ArrayList<Integer>datas = new ArrayList<Integer>();
//		IntStream.range(10, 100).forEach((data) -> {System.out.println(data);});
//		
//		
		
		
//		10 ~ 1까지 ArrayList에 담은 후 짝수만 출력한다.
		
//		ArrayList<Integer>datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).map((data) -> 10 - data).forEach((data) -> {datas.add(data);});
//		datas.stream().filter((data) -> data %2 ==0).forEach((data) -> {System.out.println(data);});
//		
		
		
//		map(): 변경
//		1 ~ 10까지 ArrayList에 담고 각 값에 2를 곱하여 출력한다.
//		ArrayList<Integer>datas = new ArrayList<Integer>();
//		IntStream.range(1, 10).forEach((data) -> {datas.add(data);});
//		datas.stream().map((data) -> data * 2).forEach((data) -> {System.out.println(data);});
		
		
//		1 ~ 100까지 중 홀수만 ArrayList에 담고 출력

		ArrayList<Integer> datas = new ArrayList<Integer>();
		IntStream.range(1, 100).filter((data) -> data % 2 == 1).forEach((data) -> {datas.add(data);});
		System.out.println(datas);
		

		
		
		
//		위의 문자열들을 ArrayList에 담고 이름에 'n'이 포함된 과일 이름만 출력한다.
//		Apple, Banana, Orange
		ArrayList<String>datas = new ArrayList<String>(Arrays.asList("apple", "banana", "Orange"));
		datas.stream().filter((data) -> data.contains("n")).forEach((data) -> {System.out.println(data);});
		
		
		
		
		
//		Product 클래스를 선언한다.

		Product[] arProduct = {
				new Product("핸드폰", 900_000, 14),
				new Product("게임기", 250_000, 754),
				new Product("칫솔", 3_000, 1523)
		};
		
		
		
//		1. 가격을 모두 출력한다. 단, 30% 할인된 가격으로 출력한다.
		ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(arProduct));
//		products.forEach((product) -> {System.out.println(product.getPrice() * 0.7);});
		
		products.stream().map((product)->(int)(product.getPrice() * 0.7)).forEach((price)->{System.out.println(price);});
		
		
		
		
//		2. 모든 재고를 10으로 변경해서 출력한다(원본은 수정하지 않는다).
		
		products.stream().map(product -> new Product(product.getName(), product.getPrice(), 10))
		.forEach(product -> System.out.println(product.getName() + " : " + product.getStock()));
		
		
		
		
		
//		3. 해당 상품의 가격과 재고를 곱해 총 가격을 출력한다.
		products.stream().map(product -> product.getPrice() * product.getStock())
		.forEach(System.out::println);
		
		
//		문제: 문자열 리스트를 모두 대문자로 변환해서 출력하기
		ArrayList<String>fruits = new ArrayList<String>(Arrays.asList("apple", "banana", "kiwi", "grape", "melon")) ;
		fruits.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
