package com.ginee.dao;

import java.util.List;

import com.ginee.entity.Course;


public interface CourseDAO {

	List<Course> getCourses();

	void saveCourse(Course myCourse);

	Course getCourse(int course_id);

	void deleteCourse(int course_id);

}
