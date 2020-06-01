package test.seven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.seven.chapter1.AspectJTest;
import test.seven.chapter1.TestInterface;

import java.io.IOException;

public class TestMain {
	public static void main(String[] args) throws IOException {
//		ApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "A:\\11_other\\cglibClass");
		AnnotationConfigApplicationContext bf = new AnnotationConfigApplicationContext(AspectJTest.class);
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

	public int i=0;

	public TestThread() {
	}

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
		TestThread testThread = new TestThread();
		TestMyClass testMyClass = new TestMyClass(testThread);
//		TestMyClass testMyClass1 = new TestMyClass();
		Thread thread1 = new Thread(new TestThread(testMyClass));
		Thread thread2 = new Thread(new TestThread(testMyClass));
		testThread.i = 2;
		thread1.start();
		thread2.start();

	}
}

class TestMyClass {
	private TestThread testThread;
	public TestMyClass(TestThread testThread) {
		this.testThread = testThread;
	}

	public void say() throws InterruptedException {
		synchronized (this) {
			System.out.println("111111");
			System.out.println(testThread.i);
			Thread.sleep(100000);
		}
	}
}

class A {
	public A(String c) {
		System.out.println("cc");
	}
}

class B extends A{
	public B(String a) {
		super(a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println(new B("a"));
	}
}