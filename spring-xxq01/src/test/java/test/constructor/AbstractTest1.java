package test.constructor;

public abstract class AbstractTest1 extends AbstractTest2{
	public void test1() {
		System.out.println(AbstractTest1.class.getName());
		super.test1();
	}
}
