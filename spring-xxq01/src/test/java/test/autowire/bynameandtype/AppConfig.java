package test.autowire.bynameandtype;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "test.autowire.bynameandtype")
@Import(MyImportBeanDefinitionRegistery.class)
public class AppConfig {
}
