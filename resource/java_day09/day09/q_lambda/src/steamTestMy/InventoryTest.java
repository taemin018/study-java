package steamTestMy;

import java.util.HashMap;
import java.util.Map;

public class InventoryTest {
    public static void main(String[] args) {

    	HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("티셔츠", 50);
        inventory.put("청바지", 30);
        inventory.put("운동화", 20);
        inventory.put("모자", 0);

        System.out.println("초기 재고 상태:");
        printInventory(inventory);

        inventory.put("운동화", 15);

        System.out.println("\n수정 후 재고 상태:");
        printInventory(inventory);
    }

    public static void printInventory(HashMap<String, Integer> inventory) {
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String product = entry.getKey();
            int stock = entry.getValue();

            if (stock == 0) {
                System.out.println(product + " : 품절");
            } else {
                System.out.println(product + " : " + stock + "개");
            }
        }
    }
}
