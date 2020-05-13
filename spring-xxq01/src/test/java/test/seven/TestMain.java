package test.seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.seven.chapter1.AspectJTest;
import test.seven.chapter1.TestInterface;

import java.io.IOException;

public class TestMain {
	public static void main(String[] args) throws IOException {
		ApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AspectJTest.class);
		TestInterface testBean = (TestInterface) ac.getBean("testBean");
		testBean.test();
//		TestLogAspect testLogAspect = (TestLogAspect) bf.getBean("testLogAspect");
//		testLogAspect.test();
//		Enumeration<URL> systemResources = ClassLoader.getSystemClassLoader().getSystemResources("META-INF/spring.handlers");
//		systemResources.nextElement();
//		systemResources.nextElement();
//		System.out.println("---");
	}
}
