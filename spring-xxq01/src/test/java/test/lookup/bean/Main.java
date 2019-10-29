package test.lookup.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("test/lookup/lookupTest1.xml");
		GetBeanTest getBeanTest1 = (GetBeanTest)bf.getBean("getBeanTest");
		GetBeanTest getBeanTest2 = (GetBeanTest)bf.getBean("getBeanTest");

		System.out.println(getBeanTest1.getUser()==getBeanTest2.getUser());

//		getBeanTest.showMe();

//		TestChangeMethod testChangeMethod = (TestChangeMethod)bf.getBean("testChangeMethod");
//		testChangeMethod.changeMe();

//		ApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
//		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
//		MyTestBean3 myTestBean = (MyTestBean3) bf.getBean("myTestBean");
//		System.out.println(myTestBean);

//		User testBean = (User)bf.getBean("testBean");
//		System.out.println(testBean);
	}

}

