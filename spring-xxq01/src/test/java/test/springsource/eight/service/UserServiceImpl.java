package test.springsource.eight.service;

import org.springframework.jdbc.core.JdbcTemplate;
import test.springsource.eight.entity.User;

import javax.sql.DataSource;
import java.util.List;

public class UserServiceImpl implements UserService {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(User user) {

	}

	@Override
	public List<User> getUsers() {
		return null;
	}
}
