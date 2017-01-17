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
	
	@Column(name="student_name")
	private String studentFullName;
	
	@Column(name="lecturer_name")
	private String lecturerFullName;
	
	@Column(name="score")
	private int score;
	
	@Column(name="course_name")
	private String courseName;
	
	
	public Assessment() {
		
	}


	public Assessment(String studentFullName, String lecturerFullName, int score, String courseName) {
		super();
		this.studentFullName = studentFullName;
		this.lecturerFullName = lecturerFullName;
		this.score = score;
		this.courseName = courseName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStudentFullName() {
		return studentFullName;
	}


	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}


	public String getLecturerFullName() {
		return lecturerFullName;
	}


	public void setLecturerFullName(String lecturerFullName) {
		this.lecturerFullName = lecturerFullName;
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
