package test.springsource.eight.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import test.springsource.eight.entity.User;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
public interface UserService<String, Long> {
	void save(List<User> user);

	List<User> getUsers();
}
