package com.ginee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ginee.entity.Lecturer;


@Repository
public class LecturerDAOImpl implements LecturerDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Lecturer> getLecturers() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Lecturer> query = session.createQuery("from Lecturer",Lecturer.class);
		
		List<Lecturer> lecturers = query.getResultList();
		
		return lecturers;
	}


	@Override
	public void saveLecturer(Lecturer myLecturer) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(myLecturer);
		
	}


	@Override
	public Lecturer getLecturer(int lecturer_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Lecturer lecturer =  session.get(Lecturer.class, lecturer_id);
		
		return lecturer;
	}


	@Override
	public void deleteLecturer(int lecturer_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery("delete from lecturer where id=:lecturerId ");
		
		
		query.setParameter("lecturerId", lecturer_id);
		
		query.executeUpdate();
		
	}

}
