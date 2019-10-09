package test.factorybean;

import domain.User;
import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanTest implements FactoryBean {
	public Object getObject() throws Exception {
		return new User();
	}

	public Class<?> getObjectType() {
		return User.class;
	}
}
