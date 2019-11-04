package test.autowire.byName;

import org.springframework.stereotype.Component;

@Component
public class Test3 {

	Test1 test1;
	Test2 test2;

	public void setTest1(Test1 test1) {
		this.test1 = test1;
	}

	public void setTest2(Test2 test2) {
		this.test2 = test2;
	}
}
