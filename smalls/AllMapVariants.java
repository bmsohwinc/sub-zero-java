import java.util.*;

public class AllMapVariants {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> treeMapRev = new TreeMap<>(Collections.reverseOrder());

        addItemsTo(hashMap);
        addItemsTo(linkedHashMap);
        addItemsTo(treeMap);
        addItemsTo(treeMapRev);

        System.out.println("HM: " + hashMap);
        System.out.println("LM: " + linkedHashMap);
        System.out.println("TM: " + treeMap);
        System.out.println("TMRv: " + treeMapRev);

    }

    /**
     *
     * HashMap -- stores in random order
     * LinkedHashMap -- stores in the same insertion order
     * TreeMap -- stores in sorted order
     *
     * @param map
     */
    private static void addItemsTo(Map<String, Integer> map) {
        map.put("Alice", 342);
        map.put("Quinn", 900);
        map.put("Howard", 64);
        map.put("Alex", 22_342);
        map.put("Jane", 8);
        map.put("Bob", 55);
        map.put("John", 22);
        map.put("Zucker", 45);
        map.put("Yuvi", 377);
        map.put("Zucker", 450);
    }

}
