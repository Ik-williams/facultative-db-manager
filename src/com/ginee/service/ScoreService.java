package com.ginee.service;

import java.util.List;

import com.ginee.entity.Score;


public interface ScoreService {

	List<Score> getScores();
	
	void saveScore(Score myScore);

	Score getScore(int score_id);

	void deleteScore(int score_id);
}
