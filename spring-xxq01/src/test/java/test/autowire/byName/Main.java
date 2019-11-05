package test.autowire.byName;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import sun.reflect.generics.repository.MethodRepository;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IntrospectionException {
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("testAutowire.xml");
//		System.out.println(classPathXmlApplicationContext);
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		System.out.println(ac);
		BeanInfo beanInfo = Introspector.getBeanInfo(Test3.class);
		for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
			if (propertyDescriptor.getWriteMethod() != null) {

				for (Type genericParameterType : propertyDescriptor.getWriteMethod().getGenericParameterTypes()) {
					if (genericParameterType instanceof  ParameterizedType ){
						System.out.println(((ParameterizedType) genericParameterType).getActualTypeArguments()[0]);
					}
					System.out.println(genericParameterType);
				}


//				for (Class<?> parameterType : propertyDescriptor.getWriteMethod().getParameterTypes()) {
//					if (List.class.isAssignableFrom(parameterType) ) {
//						System.out.println(parameterType.getTypeName());
//
//					}
//					System.out.println(parameterType);
//				}
			}
		}
		System.out.println(beanInfo);
	}
}
