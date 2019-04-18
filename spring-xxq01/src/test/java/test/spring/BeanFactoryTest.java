package test.spring;

import domain.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() throws IOException {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

		MyTestBean mb = (MyTestBean) bf.getBean("myTestBean");
		assertEquals("testStr",mb.getTestStr());

		Resource isr = new ClassPathResource("beanFactoryTest.xml");
		InputStreamSource isr1 = new ClassPathResource("beanFactoryTest.xml");

		System.out.println(isr.getClass());
		System.out.println(isr1);
		isr.getInputStream();


//		InputStream inputStream = isr1.getInputStream();
//		InputStream inputStream1 = isr.getInputStream();
		BeanFactoryTest.test();
	}

	static public void test(){
		System.out.println("---------------------");
	}
}
