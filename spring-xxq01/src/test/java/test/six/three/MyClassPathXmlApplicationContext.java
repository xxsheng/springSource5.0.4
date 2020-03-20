package test.six.three;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String ... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
//		super.initPropertySources();
		// 添加验证要求
		getEnvironment().setRequiredProperties("java.home");
	}
}
