package test.circularReferences.TestCircular;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircular {

	@Test
	public void test1() throws Throwable{
		try {
			int  [] [] a;
//			XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("cycleBeanFactoryTest.xml"));
			ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("cycleBeanFactoryTest.xml");
//			System.out.println(classPathXmlApplicationContext.isSingleton("testA"));
//			TestD testd = (TestD) classPathXmlApplicationContext.getBean("testD");
//			TestE teste = (TestE) classPathXmlApplicationContext.getBean("testE");
//			System.out.println(testd.getTestE() .equals(teste));
			System.out.println(classPathXmlApplicationContext.getBean("testD"));
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
