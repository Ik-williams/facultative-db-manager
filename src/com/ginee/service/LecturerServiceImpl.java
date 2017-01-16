package com.ginee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ginee.dao.LecturerDAO;
import com.ginee.entity.Lecturer;

@Service
public class LecturerServiceImpl implements LecturerService {


	@Autowired
	private LecturerDAO lecturerDAO;
	
	
	@Override
	@Transactional
	public List<Lecturer> getLecturers() {
		
		return lecturerDAO.getLecturers();
	}


	@Override
	@Transactional
	public void saveLecturer(Lecturer myLecturer) {
		
		lecturerDAO.saveLecturer(myLecturer);
		
	}


	@Override
	@Transactional
	public Lecturer getLecturer(int lecturer_id) {
		
		return lecturerDAO.getLecturer(lecturer_id);
	}


	@Override
	@Transactional
	public void deleteLecturer(int lecturer_id) {
		
		lecturerDAO.deleteLecturer(lecturer_id);
	}

}
