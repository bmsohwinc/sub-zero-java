import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastOrSafe {
    public static void main(String[] args) {
        demoFailSafeIterator();
        demoFailFastIterator();
    }

    // Iterates on a copy of the Collection, so finishes iteration successfully
    private static void demoFailSafeIterator() {
        Map<String, String> map = initializeMap(true);

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
            map.remove(key);
        }
        System.out.println("---");
    }

    // Iterates on original Collection, so throws ConcurrentModificationException
    private static void demoFailFastIterator() {
        Map<String, String> map = initializeMap(false);

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
            map.remove(key);
        }
        System.out.println("---");
    }

    private static Map<String, String> initializeMap(boolean isConcurrent) {
        Map<String, String> map = new HashMap<>();
        if (isConcurrent) {
            map = new ConcurrentHashMap<>();
        }

        map.put("a", "b");
        map.put("b", "c");

        return map;
    }
}
