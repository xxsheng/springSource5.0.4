package app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import test.ImportBeanDefinitionRegis;

@Configuration
//@ComponentScan(value = "Interf",excludeFilters = {@ComponentScan.Filter(value = Interf.impl.InterfaceImpl.class,type = ASSIGNABLE_TYPE)})
@ComponentScan("test")
@Import(ImportBeanDefinitionRegis.class)
public class AppConfig {

//	@Bean
//	public User user(){
//		return new User();
//	}
}
