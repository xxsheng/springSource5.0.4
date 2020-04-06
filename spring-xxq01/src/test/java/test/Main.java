package test;

import domain.MyTestBean3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.six.six.chapter4.TestEvent;

import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext bf = new ClassPathXmlApplicationContext("test/lookup/lookupTest1.xml");
//		GetBeanTest getBeanTest = (GetBeanTest)bf.getBean("getBeanTest");
//		getBeanTest.showMe();

//		TestChangeMethod testChangeMethod = (TestChangeMethod)bf.getBean("testChangeMethod");
//		testChangeMethod.changeMe();

		ApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		TestEvent testEvent = new TestEvent("hello", "msg");
		bf.publishEvent(testEvent);
//		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
		MyTestBean3 myTestBean = (MyTestBean3) bf.getBean("myTestBean");
		System.out.println(myTestBean.getName());

//		User testBean = (User)bf.getBean("testBean");
//		System.out.println(testBean);

		Object [] params = {"John", new GregorianCalendar().getTime()};
		String str1 = bf.getMessage("test", params, Locale.US);
		String str2 = bf.getMessage("test", params, Locale.CHINA);
		System.out.println(str1);
		System.out.println(str2);
	}

}


