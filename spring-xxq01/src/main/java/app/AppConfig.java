package app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;

@Configuration
@ComponentScan(value = "Interf",excludeFilters = {@ComponentScan.Filter(value = Interf.impl.InterfaceImpl.class,type = ASSIGNABLE_TYPE)})
public class AppConfig {

//	@Bean
//	public User user(){
//		return new User();
//	}
}
