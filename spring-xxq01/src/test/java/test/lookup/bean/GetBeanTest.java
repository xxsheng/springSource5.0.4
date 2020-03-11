package test.lookup.bean;

public abstract class GetBeanTest {

	private User user;

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	//	public void showMe() {
//		this.getBean().showMe();
//	}

	public abstract User getBean();
}
