package com.pathologyerp.app.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
//@EnableJpaRepositories(entityManagerFactoryRef = "applicationDataEntityManagerFactory", transactionManagerRef = "applicationDataTransactionManager")
public class AppDataConfig {/*
	@Bean
    JdbcTemplate getJdbcTemplate(){
       return new JdbcTemplate(applicationDataDataSource());
    }
	
	@Bean
    PlatformTransactionManager applicationDataTransactionManager() {
        return new JpaTransactionManager(applicationDataEntityManagerFactory().getObject());
    }
	
  @Bean
  	LocalContainerEntityManagerFactoryBean applicationDataEntityManagerFactory() {
	    HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
	    jpaVendorAdapter.setGenerateDdl(false);
	    jpaVendorAdapter.setShowSql(false);
	    jpaVendorAdapter.getJpaPropertyMap().put("hibernate.jdbc.batch_size", 20);
	    jpaVendorAdapter.getJpaPropertyMap().put("spring.jpa.hibernate.jdbc.batch_size", 20);
	    jpaVendorAdapter.getJpaPropertyMap().put("spring.jpa.properties.hibernate.jdbc.batch_size", 20);
	    jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.SQLServerDialect");
	    LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
	
	    factoryBean.setDataSource(applicationDataDataSource());
	    factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
	    factoryBean.setPackagesToScan("westpac.mbdo.hltp.persistence.application.repositories");
	    factoryBean.setPersistenceUnitName("ApplicationPersistenceUnit");
	
	    Properties p = new Properties();
	    p.setProperty("hibernate.default_schema", "dbo");
	    factoryBean.setJpaProperties(p);
	
	    return factoryBean;
	}
  
  @Bean
  public DataSource applicationDataDataSource() {
     JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
     DataSource dataSource = dataSourceLookup.getDataSource("jdbc/rr_sql_hltp");
     DataSource dataSource = new SimpleDriverDataSource(new com.microsoft.sqlserver.jdbc.SQLServerDriver(),
    		    "jdbc:sqlserver://ASHISH:1433;databaseName=PathologyERP", "PathologyUser", "mypathology@123");
     
     Connection connection;
	try {
		connection = dataSource.getConnection();
		 System.out.println("con ::: "+connection.getMetaData());
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     return dataSource;	
  }

*/}
