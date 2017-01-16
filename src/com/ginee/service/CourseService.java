package com.ginee.service;

import java.util.List;

import com.ginee.entity.Course;

public interface CourseService {


	List<Course> getCourses();

	void saveCourse(Course myCourse);

	Course getCourse(int course_id);

	void deleteCourse(int course_id);
}
