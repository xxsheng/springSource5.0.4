package test.six.three;

import domain.MyTestBean3;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext bf = new ClassPathXmlApplicationContext("test/lookup/lookupTest1.xml");
//		GetBeanTest getBeanTest = (GetBeanTest)bf.getBean("getBeanTest");
//		getBeanTest.showMe();

//		TestChangeMethod testChangeMethod = (TestChangeMethod)bf.getBean("testChangeMethod");
//		testChangeMethod.changeMe();

		ApplicationContext bf = new MyClassPathXmlApplicationContext("beanFactoryTest.xml");
		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
//		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
		MyTestBean3 myTestBean = (MyTestBean3) bf.getBean("myTestBean");
		System.out.println(myTestBean);

//		User testBean = (User)bf.getBean("testBean");
//		System.out.println(testBean);
	}

}

