package com.sujan.springboot.practice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> courses()
	{
		return Arrays.asList(new Course(1,"Java","Gfg"),
				new Course(2,"DSA","ApnaCollege"),
				new Course(3,"SpringBoot","in28minutes.com"));
	}
}
