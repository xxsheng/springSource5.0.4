package test.autowire.bynameandtype;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public abstract class AbstractClassTest implements InitializingBean {
	@Override
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("-----");

	}
}
