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

import com.ginee.entity.Course;
import com.ginee.service.CourseService;



@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/showCourses")
	public String showCourses(Model model) {
		
		List< Course> courses = courseService.getCourses();
		model.addAttribute("courses", courses);
		
		
		return "courses-page";
	}
	
	@GetMapping("/showFormForAdd")
	public String showPage(Model model) {
		
		Course course = new Course();
		
		model.addAttribute("course", course);
		
		return "course-form";
	}
	
	@PostMapping("/saveCourse")
	public String saveCourse(@ModelAttribute("course")Course myCourse) {
		
		courseService.saveCourse(myCourse);
		
		return "redirect:/course/showCourses";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("courseId") int course_id,
									Model model) {
		//get the customer from the service
		Course theCourse = courseService.getCourse(course_id);
		
		//set customer as a model attribute to pre-populate the form
		model.addAttribute("course",theCourse);
		//send over to the form
		
		return "course-form";
	}
	
	@GetMapping("/delete")
	public String deleteCoure(@RequestParam("courseId") int course_id) {
		
		courseService.deleteCourse(course_id);
		
		
		return "redirect:/course/showCourses";
	}
}
