package test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Component
public class MyFactory implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition testBean = (GenericBeanDefinition) beanFactory.getBeanDefinition("testBean");
		testBean.setAutowireMode(3);
//		Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{TestHandler.class}, new Handler());
	}
}
@Component
class Handler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return null;
	}
}
interface TestHandler {

}