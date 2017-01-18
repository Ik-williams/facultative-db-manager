package com.ginee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ginee.entity.Assessment;



@Repository
public class AssessmentDAOImpl implements AssessmentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Assessment> getAssessments() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Assessment> query = session.createQuery("from Assessment",Assessment.class);
		
		List<Assessment> assessments = query.getResultList();
		
		return assessments;
	}


	@Override
	public void saveAssessment(Assessment myAssessment) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(myAssessment);
		
	}


	@Override
	public Assessment getAssessment(int assessment_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Assessment assessment =  session.get(Assessment.class, assessment_id);
		
		return assessment;
	}


	@Override
	public void deleteAssessment(int assessment_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery("delete from Assessment where id=:assessmentId ");
		
		
		query.setParameter("assessmentId", assessment_id);
		
		query.executeUpdate();
		
	}
}
