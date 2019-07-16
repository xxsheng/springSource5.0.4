package test;

public class Father {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Father() {
		System.out.println("no param constructor");
	}

	public Father(int id) {
		this.id = id;
		System.out.println("param constructor");
	}

	public void testMethod() {
		test1();
		test2();
		test3();
	}

	protected void test1() {

	}

	protected void test2() {
		System.out.println("----method2---");
	}

	protected void test3() {

	}

	public static void main(String[] args) {
		Father father = new Son();
		father.testMethod();
	}
}

