package steamTestMy;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("아스날");
		list.add("맨유");
		list.add("리버풀");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String team = iterator.next();
			System.out.println(team);
		}
		
		
//		문제 2. Iterator로 조건에 맞는 요소 삭제하기
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			numbers.add(i);
			
		}
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			int num = it.next();
			if(num > 5) {
				it.remove();
			}
		}
		
		System.out.println(numbers);
		
		
		
		
		
		
		
		
	}

}
