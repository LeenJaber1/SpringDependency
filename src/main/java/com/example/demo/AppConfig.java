package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication


public class AppConfig{

	public static void main(String[] args) {

		SpringApplication.run(AppConfig.class, args);
		//for(String s : apc.getBeanDefinitionNames()){
		//	System.out.println(s);
		//}
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ConstructorBasedInjection  constructorBasedInjection = applicationContext.getBean(ConstructorBasedInjection.class);
		constructorBasedInjection.processMsg("SMS message sending ");



	}

}
