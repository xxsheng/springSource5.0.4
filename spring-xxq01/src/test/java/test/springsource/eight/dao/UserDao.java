package test.springsource.eight.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import test.springsource.eight.entity.User;

import javax.sql.DataSource;
import java.sql.Types;

//@Component
public class UserDao {

//	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Transactional
	public void userSave(User user) {

		jdbcTemplate.update("insert into user(`name`, age, sex)values (?,?,?)", new Object[]{
				user.getName(),user.getAge(), user.getSex()}, new int[] {Types.VARCHAR, Types.INTEGER, Types.VARCHAR}
		);
		throw new RuntimeException("---");
	}
}
