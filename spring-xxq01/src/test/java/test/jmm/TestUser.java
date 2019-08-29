package test.jmm;

public class TestUser {
	private int a;
	private int b;

	private String d = new String("4");
	private final int c = 0;

	public TestUser(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

