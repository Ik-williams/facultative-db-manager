package com.ginee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ginee.entity.Lecturer;
import com.ginee.service.LecturerService;


@Controller
@RequestMapping("/lecturer")
public class LecturerController {

	@Autowired
	private LecturerService lecturerService;
	
	
	@GetMapping("/showLecturers")
	public String showStudents(Model model) {
		
		List< Lecturer> lecturers = lecturerService.getLecturers();
		
		model.addAttribute("lecturers", lecturers);
		
		return "lecturers-page";
	}
	
	@GetMapping("/showFormForAdd")
	public String showPage(Model model) {
		
		Lecturer lecturer = new Lecturer();
		
		model.addAttribute("lecturer", lecturer);
		
		return "lecturer-form";
	}
	
	@PostMapping("/saveLecturer")
	public String saveLecturer(@ModelAttribute("lecturer")Lecturer myLecturer) {
		
		lecturerService.saveLecturer(myLecturer);
		
		return "redirect:/lecturer/showLecturers";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("lecturerId") int lecturer_id,
									Model model) {
		//get the customer from the service
		Lecturer theLecturer = lecturerService.getLecturer(lecturer_id);
		
		//set customer as a model attribute to pre-populate the form
		model.addAttribute("lecturer",theLecturer);
		//send over to the form
		
		return "lecturer-form";
	}
	
	@GetMapping("/delete")
	public String deleteLecturer(@RequestParam("lecturerId") int lecturer_id) {
		
		lecturerService.deleteLecturer(lecturer_id);
		
		
		return "redirect:/lecturer/showLecturers";
	}
	
}
