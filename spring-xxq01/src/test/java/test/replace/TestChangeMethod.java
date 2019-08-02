package test.replace;

public class TestChangeMethod {

	public TestChangeMethod(String name1, String name2) {
		this.name1 = name1;
		this.name2 = name2;
	}

	private String name1;

	private String name2;

	public TestChangeMethod() {
	}


	public void changeMe() {
		System.out.println("change me");
	}

}
