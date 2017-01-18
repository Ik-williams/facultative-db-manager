package com.ginee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ginee.dao.AssessmentDAO;
import com.ginee.entity.Assessment;

@Service
public class AssessmentServiceImpl implements AssessmentService {

	@Autowired
	private AssessmentDAO assessmentDAO;
	
	
	@Override
	@Transactional
	public List<Assessment> getAssessments() {
		
		return assessmentDAO.getAssessments();
	}


	@Override
	@Transactional
	public void saveAssessment(Assessment myAssessment) {
		
		assessmentDAO.saveAssessment(myAssessment);
		
	}


	@Override
	@Transactional
	public Assessment getAssessment(int assessment_id) {
		
		return assessmentDAO.getAssessment(assessment_id);
	}


	@Override
	@Transactional
	public void deleteAssessment(int assessment_id) {
		
		assessmentDAO.deleteAssessment(assessment_id);
	}


}
