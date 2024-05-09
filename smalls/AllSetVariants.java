import java.util.*;

enum Particle {
    PROTON,
    NEUTRON,
    ELECTRON;
}


public class AllSetVariants {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Particle> enumSet = EnumSet.allOf(Particle.class);

        addItemsTo(hashSet);
        addItemsTo(linkedHashSet);
        addItemsTo(treeSet);

        System.out.println("HS: " + hashSet);
        System.out.println("LS: " + linkedHashSet);
        System.out.println("TS: " + treeSet);
        System.out.println("ES: " + enumSet);
    }

    private static void addItemsTo(Set<Integer> set) {
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(7);
        set.add(4);
        set.add(3);
        set.add(6);
        set.add(5);
    }

}
