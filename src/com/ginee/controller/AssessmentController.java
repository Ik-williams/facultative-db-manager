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

import com.ginee.entity.Assessment;
import com.ginee.service.AssessmentService;


@Controller
@RequestMapping("/assessment")
public class AssessmentController {

	@Autowired
	private AssessmentService assessmentService;
	
	@GetMapping("/showAssessments")
	public String showAssessments(Model model) {
		
		List<Assessment> assessments = assessmentService.getAssessments();
		
		model.addAttribute("assessments", assessments);
		
		return "assessments-page";
	}
	
	@GetMapping("/showFormForAdd")
	public String showPage(Model model) {
		
		Assessment assessment = new Assessment();
		
		model.addAttribute("assessment", assessment);
		
		return "assessment-form";
	}
	
	@PostMapping("/saveAssessment")
	public String saveCourse(@ModelAttribute("assessment")Assessment myAssessment) {
		
		assessmentService.saveAssessment(myAssessment);
		
		return "redirect:/assessment/showAssessments";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("assessmentId") int assessment_id,
									Model model) {
		//get the customer from the service
		Assessment theAssessment = assessmentService.getAssessment(assessment_id);
		
		//set customer as a model attribute to pre-populate the form
		model.addAttribute("assessment",theAssessment);
		//send over to the form
		
		return "assessment-form";
	}
	
	@GetMapping("/delete")
	public String deleteAssessment(@RequestParam("assessmentId") int assessment_id) {
		
		assessmentService.deleteAssessment(assessment_id);
		
		
		return "redirect:/assessment/showAssessments";
	}
}
