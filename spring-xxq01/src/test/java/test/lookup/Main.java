package test.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.lookup.bean.GetBeanTest;

public class Main {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("test/lookup/lookupTest1.xml");
		GetBeanTest getBeanTest = (GetBeanTest)bf.getBean("getBeanTest");
		getBeanTest.showMe();
	}
}
