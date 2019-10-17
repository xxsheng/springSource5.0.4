package test.circularReferences.TestCircular;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircular {

	@Test
	public void test1() throws Throwable{
		try {
//			XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("cycleBeanFactoryTest.xml"));
			ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("cycleBeanFactoryTest.xml");
			System.out.println(classPathXmlApplicationContext.getBean("testA"));
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
