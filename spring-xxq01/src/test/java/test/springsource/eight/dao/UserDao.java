package test.springsource.eight.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import test.springsource.eight.entity.User;

import java.sql.Types;

@Component
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void userSave(User user) {

		jdbcTemplate.update("insert into user(`name`, age, sex)values (?,?,?)", new Object[]{
				user.getName(),user.getAge(), user.getSex()}, new int[] {Types.VARCHAR, Types.INTEGER, Types.VARCHAR}
		);
	}
}
