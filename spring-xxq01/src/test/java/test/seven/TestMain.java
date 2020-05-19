package test.seven;

import org.springframework.aop.framework.Advised;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.seven.chapter1.AspectJTest;
import test.seven.chapter1.TestBean;
import test.seven.chapter1.TestInterface;

import java.io.IOException;

public class TestMain {
	public static void main(String[] args) throws IOException {
		ApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "A:\\11_other\\cglibClass");
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AspectJTest.class);
		TestInterface testBean = (TestInterface) bf.getBean("testBean");
		testBean.test();
//		testBean.addAdvisor(null);
//		TestLogAspect testLogAspect = (TestLogAspect) bf.getBean("testLogAspect");
//		testLogAspect.test();
//		Enumeration<URL> systemResources = ClassLoader.getSystemClassLoader().getSystemResources("META-INF/spring.handlers");
//		systemResources.nextElement();
//		systemResources.nextElement();
//		System.out.println("---");
	}
}

class TestThread implements Runnable {

	private TestMyClass testClass;

	public TestThread (TestMyClass testClass) {
		this.testClass = testClass;
	}

	@Override
	public void run() {
		try {
			testClass.say();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestMyClass testMyClass = new TestMyClass();
		TestMyClass testMyClass1 = new TestMyClass();
		Thread thread1 = new Thread(new TestThread(testMyClass));
		Thread thread2 = new Thread(new TestThread(testMyClass1));
		thread1.start();
		thread2.start();

	}
}

class TestMyClass {
	public void say() throws InterruptedException {
		synchronized (this) {
			System.out.println("111111");

			Thread.sleep(100000);
		}
	}
}