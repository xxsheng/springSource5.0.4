package test.springsource.eight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.springsource.eight.entity.User;
import test.springsource.eight.service.UserService;

import java.util.List;

public class EightMain {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(EightAppConfig.class);
//		Test1 test1 = (Test1) ac.getBean("test1");
//		System.out.println(test1);

		ApplicationContext ac = new ClassPathXmlApplicationContext("beanFactoryTest.xml");

		UserService userService = (UserService) ac.getBean("userService");
		User user = new User();
		user.setAge(10);
		user.setName("123");
		user.setSex("男");
		userService.save(user);

		List<User> users = userService.getUsers();
		for (User user1 : users) {
			System.out.println(user1);
		}
	}
}
