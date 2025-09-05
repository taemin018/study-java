package list.task.fruit;

import java.util.ArrayList;

public class Pege {
    public static void main(String[] args) {
        Market market = new Market();

        // 과일 추가
        market.insert(new Fruit("사과", 1000));
        market.insert(new Fruit("바나나", 1500));
        market.insert(new Fruit("딸기", 2000));

        // 전체 과일 출력
        System.out.println("== 전체 과일 ==");
        ArrayList<Fruit> allFruits = market.findAll();
        for (Fruit fruit : allFruits) {
            System.out.println(fruit);
        }

        // 가격 평균보다 낮은지 확인
        System.out.println("\n== 평균보다 낮은가? ==");
        System.out.println("가격 1200: " + market.checkPrice(1200)); // true
        System.out.println("가격 2500: " + market.checkPrice(2500)); // false

        // 이름으로 가격 조회
        System.out.println("\n== 과일 가격 조회 ==");
        System.out.println("딸기 가격: " + market.findPriceByName("딸기")); // 2000
        System.out.println("망고 가격: " + market.findPriceByName("망고")); // -1

        // 과일 삭제
        market.remove("바나나");
        System.out.println("\n== 바나나 삭제 후 ==");
        for (Fruit fruit : market.findAll()) {
            System.out.println(fruit);
        }
    }
}
