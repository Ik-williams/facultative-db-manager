package com.ginee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Assessment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="student_first_name")
	private String studentFirstName;
	
	@Column(name="student_last_name")
	private String studentLastName;
	
	@Column(name="lecturer_first_name")
	private String lecturerFirstName;
	
	@Column(name="lecturer_last_name")
	private String lecturerLastName;
	
	@Column(name="score")
	private int score;
	
	@Column(name="course_name")
	private String courseName;
	
	
	public Assessment() {
		
	}


	public Assessment(String studentFirstName, String studentLastName, String lecturerFirstName,
			String lecturerLastName, int score, String courseName) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.lecturerFirstName = lecturerFirstName;
		this.lecturerLastName = lecturerLastName;
		this.score = score;
		this.courseName = courseName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStudentFirstName() {
		return studentFirstName;
	}


	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}


	public String getStudentLastName() {
		return studentLastName;
	}


	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}


	public String getLecturerFirstName() {
		return lecturerFirstName;
	}


	public void setLecturerFirstName(String lecturerFirstName) {
		this.lecturerFirstName = lecturerFirstName;
	}


	public String getLecturerLastName() {
		return lecturerLastName;
	}


	public void setLecturerLastName(String lecturerLastName) {
		this.lecturerLastName = lecturerLastName;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	

}
