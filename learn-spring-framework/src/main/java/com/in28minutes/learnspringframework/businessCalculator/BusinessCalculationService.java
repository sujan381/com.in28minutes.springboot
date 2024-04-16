package com.in28minutes.learnspringframework.businessCalculator;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.businessCalculator")
public class BusinessCalculationService {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(BusinessCalculationRunner.class).findMax());
	}

}
