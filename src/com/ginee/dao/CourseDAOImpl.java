package com.ginee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ginee.entity.Course;


@Repository
public class CourseDAOImpl implements CourseDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Course> getCourses() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Course> query = session.createQuery("from Course",Course.class);
		
		List<Course> courses = query.getResultList();
		
		return courses;
	}


	@Override
	public void saveCourse(Course myCourse) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(myCourse);
		
	}


	@Override
	public Course getCourse(int course_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Course course =  session.get(Course.class, course_id);
		
		return course;
	}


	@Override
	public void deleteCourse(int course_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery("delete from Course where id=:courseId ");
		
		
		query.setParameter("courseId", course_id);
		
		query.executeUpdate();
		
	}

}
