package test.spring;

import domain.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

		MyTestBean mb = (MyTestBean) bf.getBean("myTestBean");
		assertEquals("testStr",mb.getTestStr());
	}
}
