import java.util.HashMap;
import java.util.Map;

public class HashMapExemple {
    public static void main(String[] args) {
        Map<Item.ItemClee, Item> hashMap = new HashMap<>();


        Item item = new Item("Jean", "Paul", "2222");
        hashMap.put(item.itemClee, item);


        item = new Item("Jean", "Marc", "2222");
        hashMap.put(item.itemClee, item);


        Item.ItemClee clee = new Item.ItemClee("Jean", "Paul");
        System.out.println(hashMap.get(clee));
    }
}
