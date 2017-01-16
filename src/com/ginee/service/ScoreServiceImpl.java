package com.ginee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ginee.dao.ScoreDAO;
import com.ginee.entity.Score;

@Service
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	private ScoreDAO scoreDAO;
	
	@Override
	@Transactional
	public List<Score> getScores() {
		
		return scoreDAO.getScores();
	}

	@Override
	@Transactional
	public void saveScore(Score myScore) {
		
		scoreDAO.saveScore(myScore);
		
	}


	@Override
	@Transactional
	public Score getScore(int score_id) {
		
		return scoreDAO.getScore(score_id);
	}


	@Override
	@Transactional
	public void deleteScore(int score_id) {
		
		scoreDAO.deleteScore(score_id);
	}
}
