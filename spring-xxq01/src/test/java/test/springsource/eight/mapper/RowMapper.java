package test.springsource.eight.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper {

	Object mapRow(ResultSet set, int index) throws SQLException;
}
