package test.autowire.bynameandtype;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistery implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		GenericBeanDefinition test3 = (GenericBeanDefinition)registry.getBeanDefinition("test3");
		test3.setAutowireMode(2);

//		System.out.println(test3.getAutowireMode());

	}
}
