package com.ginee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ginee.dao.CourseDAO;
import com.ginee.entity.Course;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDAO courseDAO;
	
	
	@Override
	@Transactional
	public List<Course> getCourses() {
		
		return courseDAO.getCourses();
	}


	@Override
	@Transactional
	public void saveCourse(Course myCourse) {
		
		courseDAO.saveCourse(myCourse);
		
	}


	@Override
	@Transactional
	public Course getCourse(int course_id) {
		
		return courseDAO.getCourse(course_id);
	}


	@Override
	@Transactional
	public void deleteCourse(int course_id) {
		
		courseDAO.deleteCourse(course_id);
	}

}
