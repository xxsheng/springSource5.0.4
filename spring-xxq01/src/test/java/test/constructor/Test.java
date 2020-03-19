package test.constructor;

public class Test extends AbstractTest1{
	private int a;
	private int b;
	private int c;

	private Test() {

	}

	public Test(int a) {
		this.a = a;
	}

	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		test1();
	}

	public static void main(String[] args) {
//		Constructor<?>[] declaredConstructors = Test.class.getDeclaredConstructors();
//		for (Constructor<?> declaredConstructor : declaredConstructors) {
//			System.out.println(declaredConstructor);
//		}
//
//		for (Constructor<?> constructor : Test.class.getConstructors()) {
//			System.out.println(constructor);
//		}
		Test test = new Test();
		test.test1();
	}
}
