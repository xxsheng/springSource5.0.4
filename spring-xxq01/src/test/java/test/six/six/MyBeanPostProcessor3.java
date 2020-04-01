package test.six.six;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.PriorityOrdered;

public class MyBeanPostProcessor3 implements MergedBeanDefinitionPostProcessor, PriorityOrdered {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {

	}

	@Override
	public int getOrder() {
		return 9;
	}
}
