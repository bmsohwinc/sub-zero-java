import java.util.Vector;

public class VectorJava {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");

        v.forEach(System.out::println);
    }
}