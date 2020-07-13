package test.springsource.eight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.springsource.eight.entity.User;
import test.springsource.eight.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class EightMain {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(EightAppConfig.class);
//		Test1 test1 = (Test1) ac.getBean("test1");
//		System.out.println(test1);

		ApplicationContext ac = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
//		ApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		UserService userService = (UserService) ac.getBean(UserService.class);
		User user = new User();
		user.setAge(108);
		user.setName("123");
		user.setSex("男");

		User user1 = new User();
		user1.setAge(109);
		user1.setName("123");
		user1.setSex("男");
		List<User> users = new ArrayList<>();
		users.add(user);
		users.add(user1);
		userService.save(users);

//		List<User> users = userService.getUsers();
//		for (User user1 : users) {
//			System.out.println(user1);
//		}
	}
}
