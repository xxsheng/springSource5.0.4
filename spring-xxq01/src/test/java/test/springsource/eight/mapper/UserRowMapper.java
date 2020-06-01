package test.springsource.eight.mapper;

import org.springframework.jdbc.core.RowMapper;
import test.springsource.eight.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper {
	@Override
	public Object mapRow(ResultSet set, int index) throws SQLException {
		User person = new User(set.getInt("id"),
				set.getString("name"),
				set.getInt("age"),
				set.getString("sex"));
		return person;
	}
}
