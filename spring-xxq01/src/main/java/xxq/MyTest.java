package xxq;

import app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();

//		User bean = ac.getBean(User.class);
//		System.out.println(bean);
//		System.out.println(MyTest.class.getClassLoader().getClass().getClassLoader());
//		Interface1 bean = ac.getBean(Interface1.class);
//		bean.sayHello();

		System.out.println(ac.getBean("testBean"));
		System.out.println(ac.getBean("xx"));
	}


}
