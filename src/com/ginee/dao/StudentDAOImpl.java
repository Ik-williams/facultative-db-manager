package com.ginee.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ginee.entity.Student;


@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Student> getStudents() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Student> query = session.createQuery("from Student",Student.class);
		
		List<Student> students = query.getResultList();
		
		return students;
	}


	@Override
	public void saveStudent(Student myStudent) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.save(myStudent);
		
	}


	@Override
	public Student getStudent(int student_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Student student =  session.get(Student.class, student_id);
		
		return student;
	}


	@Override
	public void deleteStudent(int student_id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Student where id=:studentId ");
		
		
		query.setParameter("studentId", student_id);
		
		query.executeUpdate();
		
	}

}
