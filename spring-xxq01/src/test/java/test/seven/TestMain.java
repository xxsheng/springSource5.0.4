package test.seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.seven.chapter1.TestBean;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		TestBean testBean = (TestBean) bf.getBean("testBean");
		testBean.test();
	}
}
