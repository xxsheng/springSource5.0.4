package test.autowire.bynameandtype;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "test.autowire.bynameandtype")
@Import(MyImportBeanDefinitionRegistery.class)
@PropertySource("classpath:bean.properties")
public class AppConfig {
}
