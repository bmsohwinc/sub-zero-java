public class StringValueOf {
	
	public static void main(String[] args) {
		String x1 = "hello sourabha";
		char[] cx1 = x1.toCharArray();
		cx1[0] = 'c';
		String x2 = String.valueOf(cx1);
		String x3 = x2.substring(0, 5);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}

}
