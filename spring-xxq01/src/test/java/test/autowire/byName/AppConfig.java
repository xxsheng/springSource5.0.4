package test.autowire.byName;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "test.autowire.byName")
@Import(MyImportBeanDefinitionRegistery.class)
public class AppConfig {
}
