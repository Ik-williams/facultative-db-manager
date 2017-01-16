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

import com.ginee.entity.Student;
import com.ginee.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/showStudents")
	public String showStudents(Model model) {
		
		List< Student> students = studentService.getStudents();
		
		model.addAttribute("students", students);
		
		return "students-page";
	}
	
	@GetMapping("/showFormForAdd")
	public String showPage(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student")Student myStudent) {
		
		studentService.saveStudent(myStudent);
		
		return "redirect:/student/showStudents";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int student_id,
									Model model) {
		//get the customer from the service
		Student thestudent = studentService.getStudent(student_id);
		
		//set customer as a model attribute to pre-populate the form
		model.addAttribute("student",thestudent);
		//send over to the form
		
		return "student-form";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int student_id) {
		
		studentService.deleteStudent(student_id);
		
		
		return "redirect:/student/showStudents";
	}
	
}
