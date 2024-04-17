package com.sujan.springboot.practice;

public class Course {
	
	private int courseId;
	private String courseName;
	private String author;
	
	
	public Course(int courseId, String courseName, String author) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.author = author;
	}


	public int getCourseId() {
		return courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public String getAuthor() {
		return author;
	}


	@Override
	public String toString() {
		return "CourseController [courseId=" + courseId + ", courseName=" + courseName + ", author=" + author + "]";
	}
	
	
}
