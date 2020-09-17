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
@ComponentScan({ "cap.curso.jpa" })
@EnableJpaRepositories("cap.curso.jpa.repositorios")
@PropertySource("classpath:application.properties")
public class Configuracion
{
	@Autowired
	private Environment environment;
	
	
	
	

	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(getEnvironment().getProperty("driver"));
		dataSource.setUrl(getEnvironment().getProperty("url"));
		dataSource.setUsername(getEnvironment().getProperty("usuario"));
		dataSource.setPassword(getEnvironment().getProperty("clave"));

		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory()
	{
		//Construimos el objeto
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		//Le decimos que dataSource debe utilizar
		localContainerEntityManagerFactoryBean.setDataSource(getDataSource());
		//Donde esta el paquete donde vamos a guardar las entidades
		localContainerEntityManagerFactoryBean.setPackagesToScan("cap.curso.jpa.entidades");


		//Se encarga de manejar caracteristicas concretas de la base de datos
		HibernateJpaVendorAdapter hibernateJpa = new HibernateJpaVendorAdapter();
		//En este caso maneja el dialecto de la base de datos
		hibernateJpa.setDatabasePlatform(getEnvironment().getProperty("dialect"));
		//Le decimos cual es su vendorAdapter
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(hibernateJpa);

		//Ciertas carecteristicas de la aplicación
		
		Properties jpaProperties = new Properties();
		//Le damos dos el show y el format. Hay que crearlas en aplication porque las lee de ahí
		//Show_sql a True le digo que escriba en la consola del servidor la sentencia que el a hecho
		//format_sql que la información que nos ha dado con el show_sql nos la de formateada (bonita)
		//Hay que ponerlos a false cuando vayamos a producción.jpaProperties.put("show_sql", getEnvironment().getProperty("show_sql"));
		jpaProperties.put("format_sql", getEnvironment().getProperty("format_sql"));
		jpaProperties.put("hibernate.id.new_generator_mappings", getEnvironment().getProperty("hibernate.id.new_generator_mappings"));

		localContainerEntityManagerFactoryBean.setJpaProperties(jpaProperties);

		return localContainerEntityManagerFactoryBean;
	}

	@Bean
	public JpaTransactionManager transactionManager()
	{
		
		JpaTransactionManager txnMgr = new JpaTransactionManager();
		//Cual es el entityManagerFactory que queremos utilizar para vigilar la transaccióntxnMgr.setEntityManagerFactory(entityManagerFactory().getObject());
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
