package com.in28minutes.learnspringboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	
	      @Autowired
          private JdbcTemplate springJdbcTemplate;
          
          private String Insert_Query="""
          		insert into course (id,name,author)
          		values(1,'Learn AWS','in28minutes')
          		""";
          
          public void insert()
          {
        	  springJdbcTemplate.update(Insert_Query);
          }
}
