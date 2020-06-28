package test.springsource.ten;

import com.google.common.collect.Lists;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.springsource.eight.entity.User;
import test.springsource.eight.service.UserService;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
//		UserDao bean = applicationContext.getBean(UserDao.class);
//		bean.userSave(new User("1", 2, "b"));
//		System.out.println(bean.getUser(1));
		UserService bean = applicationContext.getBean(UserService.class);
		bean.save(Lists.newArrayList(new User("20200627", 1, "abc")));
	}
}

