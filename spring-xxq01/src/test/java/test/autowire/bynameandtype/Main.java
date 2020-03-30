package test.autowire.bynameandtype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.IntrospectionException;

public class Main {
	public static void main(String[] args) throws IntrospectionException {
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("testAutowire.xml");
//		System.out.println(classPathXmlApplicationContext);
//		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProssor());
		ac.refresh();
		System.out.println(ac);
		Object test3 = ac.getBean("test3");
//		BeanInfo beanInfo = Introspector.getBeanInfo(Test3.class);
//		for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
//			if (propertyDescriptor.getWriteMethod() != null) {
//
//				for (Type genericParameterType : propertyDescriptor.getWriteMethod().getGenericParameterTypes()) {
//					if (genericParameterType instanceof  ParameterizedType ){
//						System.out.println(((ParameterizedType) genericParameterType).getActualTypeArguments()[0]);
//					}
//					System.out.println(genericParameterType);
//				}


//				for (Class<?> parameterType : propertyDescriptor.getWriteMethod().getParameterTypes()) {
//					if (List.class.isAssignableFrom(parameterType) ) {
//						System.out.println(parameterType.getTypeName());
//

//					}
//					System.out.println(parameterType);
//				}
//			}
//		}
//		System.out.println(beanInfo);

	}

}
