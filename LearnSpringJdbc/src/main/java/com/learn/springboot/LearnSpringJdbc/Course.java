package com.learn.springboot.LearnSpringJdbc;

import org.springframework.stereotype.Component;

@Component
public class Course {
	
	private int Id;
	private String name;
	private String author;
	
	public Course()
	{
		
	}
	
	public Course(int id, String name, String author) {
		super();
		Id = id;
		this.name = name;
		this.author = author;
	}


	public void setId(int id) {
		Id = id;
	}

	public void setCourseName(String courseName) {
		this.name = courseName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return Id;
	}


	public String getCourseName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	@Override
	public String toString() {
		return "Course [Id=" + Id + ", courseName=" + name + ", author=" + author + "]";
	}
	
	
}
