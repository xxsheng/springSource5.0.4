package xxq;

import app.AppConfig;
import domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();

		User bean = ac.getBean(User.class);
		System.out.println(bean);
	}


}
