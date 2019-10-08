package test.factorybean;

import domain.User;

public class FactoryBeanTest  {
	public Object getObject() throws Exception {
		return new User();
	}

	public Class<?> getObjectType() {
		return User.class;
	}
}
