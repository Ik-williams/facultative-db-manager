package com.ginee.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "students")
	private Set<Score> scores = new HashSet<Score>();
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "students")
	private Set<Course> courses = new HashSet<Course>();
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "students")
	public Set<Lecturer> lecturers = new HashSet<Lecturer>();
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, int age, Gender gender, String email ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public enum Gender{
		Male,Female
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
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + "]";
	}




	
	
	
}
