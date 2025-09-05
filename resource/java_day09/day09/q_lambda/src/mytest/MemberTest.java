package mytest;

import java.util.ArrayList;

public class MemberTest {
	public static void main(String[] args) {
		
//		포인트가 100 이상인 회원들의 이름을 오름차순으로 출력하세요.
		
		ArrayList<Member> members = new ArrayList<>();
		members.add(new Member("Alice", 120));
		members.add(new Member("Bob", 90));
		members.add(new Member("Charlie", 150));
		members.add(new Member("David", 80));
		members.add(new Member("Eve", 110));

		
		members.stream().filter(member -> member.getPoint() > 100).map(member -> member.getName())
		.sorted().forEach(System.out::println);
		
		
		
	}

}
