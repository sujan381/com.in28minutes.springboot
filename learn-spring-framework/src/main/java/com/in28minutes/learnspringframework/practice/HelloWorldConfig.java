package com.in28minutes.learnspringframework.practice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Student(String name, int age){};

record Address(Student student, String city, String college, int rollNo) {};

@Configuration
public class HelloWorldConfig {

	@Bean
	public String name()
	{
		return "sujan";
	}
	@Bean
	public int age()
	{
		return 23;
	}
	@Bean
	@Qualifier("myName")
	public Student student()
	{
		return new Student(name(),age());
	}
	@Bean
	public String city()
	{
		return "Proddatur";
	}
	
	@Bean
	public String college()
	{
		return "Lovely Professional university";
	}
	
	@Bean
	public int rollNo()
	{
		return 11808434;
	}
	
	@Bean 
	public Address address()
	{
		return new Address(student(), city(), college(), rollNo());  //using methods
		
	}
	
	@Bean(name="address2")
	public Address address1UsingParameters(@Qualifier("myName")Student student,String city, String college, int rollNo)
	{
		return new Address(student,city,college,rollNo);
		
	}
	
	@Bean
	@Primary
	public Student student1()
	{
		return new Student("pri",23);
	}
	
}
