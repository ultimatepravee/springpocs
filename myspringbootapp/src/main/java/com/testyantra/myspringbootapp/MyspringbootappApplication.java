package com.testyantra.myspringbootapp;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyspringbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootappApplication.class, args);

		/*
		 * ApplicationContext ctx =
		 * SpringApplication.run(MyspringbootappApplication.class, args);
		 * 
		 * String[] beanNames = ctx.getBeanDefinitionNames();
		 * 
		 * Arrays.sort(beanNames);
		 * 
		 * for (String beanName : beanNames) { System.out.println(beanName); }
		 */	}

}
