package com.ginee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="#of_lectures")
	private int no_lectures;
	
	@Column(name="#of_students")
	private int no_students;
	
	@Column(name="#of_lecturers")
	private int no_lecturers;
	
	
	public Course() {
		
	}


	public Course(String name, int no_lectures, int no_students, int no_lecturers) {
		super();
		this.name = name;
		this.no_lectures = no_lectures;
		this.no_students = no_students;
		this.no_lecturers = no_lecturers;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNo_lectures() {
		return no_lectures;
	}


	public void setNo_lectures(int no_lectures) {
		this.no_lectures = no_lectures;
	}


	public int getNo_students() {
		return no_students;
	}


	public void setNo_students(int no_students) {
		this.no_students = no_students;
	}


	public int getNo_lecturers() {
		return no_lecturers;
	}


	public void setNo_lecturers(int no_lecturers) {
		this.no_lecturers = no_lecturers;
	}
	
}
