package com.springbootHibernate.Configuration;

import java.util.Properties;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
public class AppConfig {

@Autowired
 private DataSource datasource;

//createing session factory objeect

@Bean
public LocalSessionFactoryBean sessionfactorybean() {
	System.out.println("inside bean session "+datasource);
	LocalSessionFactoryBean sessionfactory=new LocalSessionFactoryBean();
	sessionfactory.setDataSource(datasource);
	sessionfactory.setPackagesToScan("com.springbootHibernate.Beans");
	
	Properties hibernateproperties=new Properties();
	hibernateproperties.setProperty("hibernate.show_sql", "true");
	hibernateproperties.setProperty("hibernate.hbm2ddl.auto", "update");
	hibernateproperties.setProperty("hibernate.format_sql", "true");
	hibernateproperties.setProperty("hibernate.connection.pool_size", "10");
	
   sessionfactory.setHibernateProperties(hibernateproperties);	
     
    return sessionfactory;
	
}
	

@Bean
public HibernateTransactionManager transactionManager() {
	System.out.println("Inside hibernate Transaction manager");
    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
    transactionManager.setSessionFactory(sessionfactorybean().getObject());
    return transactionManager;
}

}
