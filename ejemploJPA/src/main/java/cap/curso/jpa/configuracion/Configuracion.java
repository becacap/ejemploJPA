package cap.curso.jpa.configuracion;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@ComponentScan({"cap.curso.jpa"})
public class Configuracion
{
	@Autowired
	private Environment environment;

	@Bean
	public DataSource  getDataSource() {
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
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
	        jpaProperties.put("hibernate.show_sql", getEnvironment().getProperty("hibernate.show_sql"));
			jpaProperties.put("hibernate.format_sql", getEnvironment().getProperty("hibernate.format_sql"));
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
