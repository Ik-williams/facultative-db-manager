package com.ginee.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="no_lectures")
	private int no_lectures;
	
	@Column(name="no_students")
	private int no_students;
	

	@ManyToMany(fetch = FetchType.LAZY)
	 @JoinTable(name = "student_course", 
	             joinColumns = { @JoinColumn(name = "course_id") }, 
	             inverseJoinColumns = { @JoinColumn(name = "student_id") })
	private Set<Student> students = new HashSet<Student>();

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "courses")
	public Set<Score> scores = new HashSet<Score>();
	
	
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "courses")
	public Set<Lecturer> lecturers = new HashSet<Lecturer>();
	
	public Course() {
		
	}

	public Course(String name, int no_lectures, int no_students) {
		super();
		this.name = name;
		this.no_lectures = no_lectures;
		this.no_students = no_students;
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


	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Score> getScores() {
		return scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

	public Set<Lecturer> getLecturers() {
		return lecturers;
	}

	public void setLecturers(Set<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", no_lectures=" + no_lectures + ", no_students=" + no_students
				+ "]";
	}

	


	
}
