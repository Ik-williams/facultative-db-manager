package com.ginee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ginee.entity.Score;


@Repository
public class ScoreDAOImpl implements ScoreDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Score> getScores() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Score> query = session.createQuery("from Score",Score.class);
		
		List<Score> scores = query.getResultList();
		
		return scores;
	}


	@Override
	public void saveScore(Score myScore) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(myScore);
		
	}


	@Override
	public Score getScore(int score_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Score score =  session.get(Score.class, score_id);
		
		return score;
	}


	@Override
	public void deleteScore(int score_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery("delete from Score where id=:scoreId ");
		
		
		query.setParameter("scoreId", score_id);
		
		query.executeUpdate();
		
	}

}
