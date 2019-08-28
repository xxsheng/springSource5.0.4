package test.spring;

import domain.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.Resource;
import test.Son;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() throws IOException {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("test/lookup/lookupTest1.xml"));

//		MyTestBean mb = (MyTestBean) bf.getBean(MyTestBean.class);
		MyTestBean mb = (MyTestBean) bf1.getBean("myTestBean2");
		System.out.println(mb.getTestStr());
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

	@Test
	public void test1() {
		Son son = new Son(1);
	}
}
