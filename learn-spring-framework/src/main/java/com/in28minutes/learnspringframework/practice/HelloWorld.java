package com.in28minutes.learnspringframework.practice;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("student"));
		
		System.out.println(context.getBean("address"));
		
		System.out.println(context.getBean("address2"));
		
		System.out.println(context.getBeanDefinitionCount());
		
		System.out.println(context.getBeanDefinition("student"));
		
		System.out.println(context.getBean(Student.class));
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(x -> System.out.println(x));
	}

}
