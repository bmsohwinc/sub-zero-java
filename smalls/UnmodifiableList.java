import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");

        System.out.println(list);

        List<String> immutableList = Collections.unmodifiableList(list);

        immutableList.add("C");
        immutableList.add("D");

        System.out.println(immutableList);
    }

}
