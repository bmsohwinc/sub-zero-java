import java.util.*;

final class SimpleIterator {
    public static void iterateList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println("List has size: " + list.size());
    }

    public static void iterateMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // Map doesn't implement Collection/Iterable, hence no iterator
        // You can still iterate over its keySet, Values, or Entries explicitly

    }
}


public class IteratorAndIterable {

    public static void main(String[] args) {
        SimpleIterator.iterateList();
    }

}
