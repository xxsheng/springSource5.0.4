package test.seven.chapter3;

public class Test1 {
	public void test() {
		System.out.println("test1-----");
		Test2 test2 = new Test2();
		test2.test2();
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.test();
	}
}

class Test2 {
	public void test2() {
		System.out.println("test2----");
		Test3 test3 = new Test3();
		try {

//		test3.test3();
			throw new RuntimeException();
		} finally {
			Test4 test4 = new Test4();
			test4.test4();
		}
	}
}

class Test3 {
	public void test3() {
		System.out.println("----test3----");
		throw new RuntimeException();
	}
}

class Test4{
	public void test4() {
		System.out.println("test4-----");
	}
}
