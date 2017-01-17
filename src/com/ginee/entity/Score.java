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
@Table(name="score")
public class Score {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="score")
	private int score;
	
	@Column(name="max_score")
	private int maxScore;
	
	@Column(name="min_score")
	private int minScore;
	

	@ManyToMany(fetch = FetchType.LAZY)
	 @JoinTable(name = "student_score", 
	             joinColumns = { @JoinColumn(name = "score_id") }, 
	             inverseJoinColumns = { @JoinColumn(name = "student_id") })
	private Set<Student> students = new HashSet<Student>();
	
	@ManyToMany(fetch = FetchType.LAZY)
	 @JoinTable(name = "score_course", 
	             joinColumns = { @JoinColumn(name = "score_id") }, 
	             inverseJoinColumns = { @JoinColumn(name = "course_id") })
	 private Set<Course> courses = new HashSet<Course>();
    
	public Score() {
		
	}

	public Score(int score, int maxScore, int minScore) {
		super();
		this.score = score;
		this.maxScore = maxScore;
		this.minScore = minScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}

	public int getMinScore() {
		return minScore;
	}

	public void setMinScore(int minScore) {
		this.minScore = minScore;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", score=" + score + ", maxScore=" + maxScore + ", minScore=" + minScore
				+ "]";
	}
	
}
