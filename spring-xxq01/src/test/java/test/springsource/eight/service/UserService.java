package test.springsource.eight.service;

import test.springsource.eight.entity.User;

import java.util.List;

public interface UserService {
	void save(User user);

	List<User> getUsers();
}