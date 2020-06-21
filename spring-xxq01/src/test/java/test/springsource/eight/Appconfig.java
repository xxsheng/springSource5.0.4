package test.springsource.eight;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(value = "test.springsource.eight")
@EnableTransactionManagement
//@PropertySource("beanFactoryTest.xml")
public class Appconfig {

	@Bean
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl("jdbc:mysql://192.168.137.200:3306/springJdbc?serverTimezone=UTC");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("root");

		return basicDataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource
														   ) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(
				dataSource);
//		if (this.transactionManagerCustomizers != null) {
//			this.transactionManagerCustomizers.customize(transactionManager);
//		}
		return transactionManager;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
}
