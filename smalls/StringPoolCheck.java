public class StringPoolCheck {
	public static void main(String[] args) {
		String s1 = "Hello Sourabha";
		String s2 = "Hello Sourabha";
		String s3 = new String("Hello Sourabha");
		String s4 = new String(s1);
		String s5 = new String(s3);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s4 == s5);
	}

}
