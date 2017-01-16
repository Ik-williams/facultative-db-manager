package com.ginee.service;

import java.util.List;

import com.ginee.entity.Student;

public interface StudentService {

	List<Student> getStudents();

	void saveStudent(Student myStudent);

	Student getStudent(int student_id);

	void deleteStudent(int student_id);
}
