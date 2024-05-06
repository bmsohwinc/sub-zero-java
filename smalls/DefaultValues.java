class Demo {
	// This is fine. Java initializes these to 0
	int v1;

	public void hello() {
		int v2;
		// Un-initialized local variables are okay, as long as 
		// you don't use them.
		// System.out.println(v2); // Fails to compile!
	}
}

public class DefaultValues {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println("demo.v1 = " + demo.v1);
		demo.hello();
	}
}
