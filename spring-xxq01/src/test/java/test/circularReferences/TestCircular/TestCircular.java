package test.circularReferences.TestCircular;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestCircular {

	@Test(expected = BeanCurrentlyInCreationException.class)
	public void test1() throws Throwable{
		try {
//			XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("cycleBeanFactoryTest.xml"));
			new ClassPathXmlApplicationContext("cycleBeanFactoryTest.xml");
//			System.out.println(xmlBeanFactory.getBean("testA"));
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
