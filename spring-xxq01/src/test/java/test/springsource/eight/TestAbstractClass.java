package test.springsource.eight;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class TestAbstractClass {

	@Autowired
	Bean1 bean1;

	abstract void say();
}
