package test.springsource.eight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import test.springsource.eight.dao.UserDao;
import test.springsource.eight.entity.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

//	public void setDataSource(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}

	@Autowired
	UserDao userDao;

	@Override
	@Transactional
	public void save(List<User> user) {
//		jdbcTemplate.update("insert into user(`name`, age, sex)values (?,?,?)", new Object[]{
//				user.getName(),user.getAge(), user.getSex()}, new int[] {Types.VARCHAR, Types.INTEGER, Types.VARCHAR}
//		);
//		throw new RuntimeException("error");
		for (User user1 : user) {
			userDao.userSave(user1);
		throw new RuntimeException("error");

		}
	}

	@Override
	public List<User> getUsers() {
//		List<User> list = jdbcTemplate.query("select * from user", new UserRowMapper());
//		return list;
		return null;
	}
}
