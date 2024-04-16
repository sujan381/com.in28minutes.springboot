package com.in28minutes.learnspringframework.depInjprac;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class DependendencyInjectionLauncher {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(DependendencyInjectionLauncher.class);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(YourBusinessClass.class));
	}

}
