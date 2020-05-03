package com.springbootHibernate.Spring.boot.Hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.springbootHibernate")
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class SpringBootHibernateApplication {

	public static void main(String[] args) {
		System.out.println("readyss");
		SpringApplication.run(SpringBootHibernateApplication.class, args);
	}

}
