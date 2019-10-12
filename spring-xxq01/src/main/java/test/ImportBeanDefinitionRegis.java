package test;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.Proxy;

public class ImportBeanDefinitionRegis implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{TestHandler.class}, new Handler());

		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(o.getClass());
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanDefinitionBuilder.getBeanDefinition();
		registry.registerBeanDefinition("xx", genericBeanDefinition);
	}
}
