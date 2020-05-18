package test.seven;

import org.springframework.aop.framework.Advised;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.seven.chapter1.AspectJTest;

import java.io.IOException;

public class TestMain {
	public static void main(String[] args) throws IOException {
//		ApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "A:\\11_other\\cglibClass");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AspectJTest.class);
		Advised testBean = (Advised) ac.getBean("testBean");
//		testBean.test();
		testBean.addAdvisor(null);
//		TestLogAspect testLogAspect = (TestLogAspect) bf.getBean("testLogAspect");
//		testLogAspect.test();
//		Enumeration<URL> systemResources = ClassLoader.getSystemClassLoader().getSystemResources("META-INF/spring.handlers");
//		systemResources.nextElement();
//		systemResources.nextElement();
//		System.out.println("---");
	}
}
