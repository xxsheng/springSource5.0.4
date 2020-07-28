package test.springsource.eight.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import test.springsource.eight.dao.UserDao;
import test.springsource.eight.entity.User;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

//@Component
public class UserServiceImpl implements UserService<String, Long> {

//	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

//	@Autowired
	UserDao userDao;

	@Override
	@Transactional
	public void save(List<User> users) {
		try {
			for (User user : users) {

				jdbcTemplate.update("insert into user(`name`, age, sex)values (?,?,?)", new Object[]{
						user.getName(), user.getAge(), user.getSex()}, new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR}
				);
			}
		} catch (Exception e) {
			System.out.println("exception");
		}
		System.out.println("-------------------------");
//		throw new RuntimeException("error");
//		for (User user1 : user) {
//			userDao.userSave(user1);
//		throw new RuntimeException("error");

//		}
		System.out.println("异常不会在此跑出来");
	}


	@Override
	public List<User> getUsers() {
//		List<User> list = jdbcTemplate.query("select * from user", new UserRowMapper());
//		return list;
		return null;
	}
}
