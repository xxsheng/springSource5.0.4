package test.springsource.nine.mapper;

import test.springsource.nine.entity.User;

public interface UserMapper {
	public void insertUser(User user);

	public User getUser(Integer id);
}
