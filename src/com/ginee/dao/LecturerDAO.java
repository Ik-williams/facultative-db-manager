package com.ginee.dao;

import java.util.List;

import com.ginee.entity.Lecturer;


public interface LecturerDAO {

	List<Lecturer> getLecturers();

	void saveLecturer(Lecturer myLecturer);

	Lecturer getLecturer(int lecturer_id);

	void deleteLecturer(int lecturer_id);

	 

}
