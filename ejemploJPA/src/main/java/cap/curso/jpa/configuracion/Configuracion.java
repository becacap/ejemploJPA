package cap.curso.jpa.configuracion;

import java.util.Properties;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@ComponentScan({"cap.curso.jpa"})
@EnableJpaRepositories("cap.curso.jpa.repositorios")
@PropertySource("classpath:application.properties")
public class Configuracion
{
	@Autowired
	private Environment environment;

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(getEnvironment().getProperty("driver"));
		dataSource.setUrl(getEnvironment().getProperty("url"));
		dataSource.setUsername(getEnvironment().getProperty("username"));
		dataSource.setPassword(getEnvironment().getProperty("password"));
		return dataSource;
	}
	
	 @Bean
	    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

	        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
	        localContainerEntityManagerFactoryBean.setDataSource(getDataSource());
	        localContainerEntityManagerFactoryBean.setPackagesToScan("cap.curso.jpa.entidades");
	        
	        HibernateJpaVendorAdapter hibernateJpa = new HibernateJpaVendorAdapter();
	        hibernateJpa.setDatabasePlatform(getEnvironment().getProperty("dialect"));
	        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(hibernateJpa);
	        
	        Properties jpaProperties = new Properties();
	        jpaProperties.put("show_sql", getEnvironment().getProperty("show_sql"));
			jpaProperties.put("format_sql", getEnvironment().getProperty("format_sql"));
			jpaProperties.put("hibernate.id.new_generator_manager", getEnvironment().getProperty("hibernate.id.new_generator_manager"));
	        localContainerEntityManagerFactoryBean.setJpaProperties(jpaProperties);
	        
	        return localContainerEntityManagerFactoryBean;
	    }
	    
	    @Bean
	    public JpaTransactionManager transactionManager() {
	        JpaTransactionManager txnMgr = new JpaTransactionManager();
	        txnMgr.setEntityManagerFactory(entityManagerFactory().getObject());
	        return txnMgr;
	    }
	    
	public Environment getEnvironment()
	{
		return environment;
	}

	public void setEnvironment(Environment environment)
	{
		this.environment = environment;
	}
}
