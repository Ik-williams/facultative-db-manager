package com.ginee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
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
	

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
	
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


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}

	
	
}
