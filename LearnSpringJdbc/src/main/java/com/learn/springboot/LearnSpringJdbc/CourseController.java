package com.learn.springboot.LearnSpringJdbc;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	private Course course;
	
	@RequestMapping("/courses")
	public List<Course> printCoures()
	{
		return Arrays.asList(new Course(1,"Learn AWS","in28Minutes"),
				new Course(1,"Learn AWS","in28Minutes"),
				new Course(1,"Learn AWS","in28Minutes"));
	}
}
