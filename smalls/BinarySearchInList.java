import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class BinarySearchInList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(4);
		list.add(6);

		System.out.println(Collections.binarySearch(list, 1));
		 System.out.println(Collections.binarySearch(list, 2));
		  System.out.println(Collections.binarySearch(list, 3));
		   System.out.println(Collections.binarySearch(list, 5));
		    System.out.println(Collections.binarySearch(list, 8));
	}


}
