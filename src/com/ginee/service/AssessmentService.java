package com.ginee.service;

import java.util.List;

import com.ginee.entity.Assessment;

public interface AssessmentService {

	List<Assessment> getAssessments();

	void saveAssessment(Assessment myAssessment);

	Assessment getAssessment(int assessment_id);

	void deleteAssessment(int assessment_id);
}
