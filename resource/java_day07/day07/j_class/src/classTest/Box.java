package classTest;

public class ClassTask11 {
//	화면
//	온라인 게임 아이템 구매
	
//	게임샵
//	아이템이름
//	가격
//	재고
	
//	플레이어
//	닉네임
//	게임머니
//	할인율
	
	public static void main(String[] args) {
		Player 전사 = new Player("zi존전사zzz", 10000, 50);
		GameShop shop = new GameShop("지팡이", 1000, 5);
		
		shop.sell(전사);
		
		System.out.println(전사.money);
		System.out.println(shop.stock);
	}
}

package classTest;

public class Player {
	String nickname;
	int money;
	int discount;

	public Player(String nickname, int money, int discount) {
		this.nickname = nickname;
		this.money = money;
		this.discount = discount;
	}
}
package classTest;

public class GameShop {
	String name;
	int price;
	int stock;

	public GameShop(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	void sell(Player player) {
		player.money -= this.price * (1 - player.discount / 100.0);
		stock--;
	}
}
















