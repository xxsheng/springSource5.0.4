package com.xxq.resource;

import com.xxq.domain.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class UserController extends AbstractController implements LastModified {
	private Long lastModified=0L;
	@Override
	protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		List<User> userList = new ArrayList<>();
		User user1 = new User();
		user1.setAge(27);
		user1.setUsername("张三");

		User user2 = new User();
		user2.setAge(37);
		user2.setUsername("李四");

		userList.add(user1);
		userList.add(user2);
		request.getServletContext().getAttribute("myData");
		System.out.println(1/0);
		return new ModelAndView("userList", "users", userList);
	}

	@Override
	public long getLastModified(HttpServletRequest request) {
		if (lastModified == 0L) {
			lastModified = System.currentTimeMillis();
		}
		return lastModified;
	}

//	public static void main(String[] args) {
//		UserController userController = new UserController();
//		System.out.println(userController.lastModified);
//	}
}
