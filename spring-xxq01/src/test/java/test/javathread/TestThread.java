package test.javathread;

public class TestThread {

	public static void main(String[] args) {

		TestThread demo = new TestThread();

		new Thread(() -> demo.test1()).start();

	}

	public void test1() {
		System.out.println("---------");
	}
}
