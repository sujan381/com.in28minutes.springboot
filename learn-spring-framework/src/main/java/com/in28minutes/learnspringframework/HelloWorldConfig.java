package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age,Address address) {};

record Address(int doorNo, String city){};

@Configuration
public class HelloWorldConfig {
	
	@Bean
	public String name()
	{
		return "Sujan";
	}

	@Bean
	public int age()
	{
		return 23;
	}
	
	@Bean
	public int empId()
	{
		return 2113252;
	}
	@Bean
	public String company()
	{
		return "Cognizant";
	}
	@Bean
	public Person person()
	{
		return new Person(name(), age(),address());
	}
	
	@Bean
	public Address address()
	{
		return new Address(951,"Proddatur");
	}
	@Bean
	public Address address1()
	{
		return new Address(951,"Proddatur");
	}
	@Bean
	public Person paramaters(String name, int age, Address address)
	{
		return new Person(name,age,address);
		
	}
}
