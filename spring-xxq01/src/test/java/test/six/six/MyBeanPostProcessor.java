package test.six.six;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

public class MyBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
	@Override
	public int getOrder() {
		return 10;
	}
}
