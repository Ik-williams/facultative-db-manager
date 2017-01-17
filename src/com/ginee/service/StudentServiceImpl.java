package com.ginee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ginee.dao.StudentDAO;
import com.ginee.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		
		return studentDAO.getStudents();
	}


	@Override
	@Transactional
	public void saveStudent(Student myStudent) {
		
		studentDAO.saveStudent(myStudent);
		
	}


	@Override
	@Transactional
	public Student getStudent(int student_id) {
		
		return studentDAO.getStudent(student_id);
	}


	@Override
	@Transactional
	public void deleteStudent(int student_id) {
		
		studentDAO.deleteStudent(student_id);
	}

}
