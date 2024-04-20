package com.learn.springboot.LearnSpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	CourseJdbcRepository courseJdbc;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			
		courseJdbc.insert(new Course(1,"Learn Azure","in28Minutes"));
		courseJdbc.insert(new Course(2,"Learn GCP","in28Minutes"));
		courseJdbc.insert(new Course(3,"Learn aws","in28Minutes"));
		
		courseJdbc.delete(1);
		
		System.out.println(courseJdbc.select(2));
		
	}

}
