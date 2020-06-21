package test.springsource.nine;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.springsource.nine.entity.User;
import test.springsource.nine.mapper.UserMapper;

import java.io.IOException;
import java.io.Reader;

public class TestMain {
	private final static SqlSessionFactory SQL_SESSION_FACTORY;

	static {
		String resource = "mybatis/mybatis-config.xml";
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return SQL_SESSION_FACTORY;
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		UserMapper bean = applicationContext.getBean(UserMapper.class);
		bean.insertUser(new User("1", 2));
		System.out.println(bean.getUser(1));
	}
}

