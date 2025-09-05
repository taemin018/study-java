package steamTestMy;

import java.util.ArrayList;
import java.util.Arrays;

public class MemberTest {
	public static void main(String[] args) {
		
	
	
	
	Member[] arMembers = {
			new Member("Alice",1200),
			new Member("Bob",500),
			new Member("Charlis",700),
			new Member("Diana",1500)
			
	};
	
	
	
	ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(arMembers));
	
//	포인트가 1000 이상인 회원만 필터링한다.
//	해당 회원의 이름을 "[이름]: VIP" 형식으로 문자열로 변경한다. (map() 사용)
//	결과를 한 줄씩 출력한다.
	
	members.stream().filter(member -> member.getPoint() >= 1000)
	.map(member -> member.getName() + ": VIP").forEach(System.out::println);
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
