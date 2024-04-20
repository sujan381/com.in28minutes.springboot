package com.learn.springboot.LearnSpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	private Course course;
	
	
	private static String Insert_Query = "insert into course(id,name,author) values(?,?,?)";
	
	private String delete_Query = "DELETE FROM course WHERE id=?";
	
	private String select_Query = "Select * FROM course WHERE id=?";
	
	public void insert(Course course)
	{
		springJdbcTemplate.update(Insert_Query,course.getId(),course.getCourseName(),course.getAuthor());
	}
	
	public void delete(long id)
	{
		springJdbcTemplate.update(delete_Query,id);
	}
	
	public Course select(long id)
	{
		return springJdbcTemplate.queryForObject(select_Query, new BeanPropertyRowMapper<>(Course.class),id);
	}
}
