package com.ginee.service;

import java.util.List;

import com.ginee.entity.Lecturer;



public interface LecturerService {

	List<Lecturer> getLecturers();

	void saveLecturer(Lecturer myLecturer);

	Lecturer getLecturer(int lecturer_id);

	void deleteLecturer(int lecturer_id);
	
}
