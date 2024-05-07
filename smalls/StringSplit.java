public class StringSplit {

	public static void main(String[] args) {

		String x1 = "hello worlds    and galaxies  and        the planets  ";
		String[] x1splits = x1.split("\\s+");
		System.out.println("There are total " + x1splits.length + " splits:");
		for (String x: x1splits) {
			System.out.println(x);
		}

	}

}
