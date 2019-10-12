package test;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

	public TestBean() {

	}

	public TestBean(Test1 test1, Test2 test2){
		System.out.println("1111");
	}
}
