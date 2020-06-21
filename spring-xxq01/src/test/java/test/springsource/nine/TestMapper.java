package test.springsource.nine;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import test.springsource.nine.entity.User;
import test.springsource.nine.mapper.UserMapper;

public class TestMapper {
	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = TestMain.getSqlSessionFactory();
	}

	@Test
	public void add() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper mapper = sqlSession.getMapper(UserMapper.class);
			User user = new User("tom", new Integer(5));
			mapper.insertUser(user);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void getUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper mapper = sqlSession.getMapper(UserMapper.class);
			User user = mapper.getUser(1);
			System.out.println(user);
		} finally {
			sqlSession.close();
		}
	}
}

