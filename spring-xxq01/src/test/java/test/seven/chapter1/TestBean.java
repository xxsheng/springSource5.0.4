package test.seven.chapter1;

import org.springframework.stereotype.Component;

@Component
public class TestBean implements TestInterface{

	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test() {
		System.out.println(testStr);
		System.out.println("test");
	}

	@Override
	public void test1() {
		System.out.println("-----");
	}
}
