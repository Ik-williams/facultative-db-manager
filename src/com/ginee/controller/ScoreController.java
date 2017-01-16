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

import com.ginee.entity.Score;
import com.ginee.service.ScoreService;

@Controller
@RequestMapping("/score")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping("showScores")
	public String showScores(Model model) {
		
		List<Score> scores = scoreService.getScores();
		
		model.addAttribute("scores",scores);
		
		return "scores-page";
	}
	
	@GetMapping("/showFormForAdd")
	public String showPage(Model model) {
		
		Score score = new Score();
		
		model.addAttribute("score", score);
		
		return "score-form";
	}
	
	@PostMapping("/saveScore")
	public String saveScore(@ModelAttribute("score")Score myScore) {
		
		scoreService.saveScore(myScore);
		
		return "redirect:/score/showScores";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("scoreId") int score_id,
									Model model) {
		//get the customer from the service
		Score thescore = scoreService.getScore(score_id);
		
		//set customer as a model attribute to pre-populate the form
		model.addAttribute("score",thescore);
		//send over to the form
		
		return "score-form";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int score_id) {
		
		scoreService.deleteScore(score_id);
		
		
		return "redirect:/score/showScores";
	}
	
}
