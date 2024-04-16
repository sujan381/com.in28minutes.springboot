package com.in28minutes.learnspringframework.depInjprac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YourBusinessClass {
	
	@Autowired
	Dependency1 dependency1;
	
	@Autowired
	Dependency2 dependency2;
	
	public String toString()
	{
		return "Using " + dependency1+" and "+dependency2;
		
	}
}
