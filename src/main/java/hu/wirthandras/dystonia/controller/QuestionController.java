package hu.wirthandras.dystonia.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.wirthandras.dystonia.service.QuestionService;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService service;

	@RequestMapping("{subCategory}/question")
	public String question(@PathVariable("subCategory") String subCategory, Model model) throws IOException {
		model.addAttribute("question", service.getQuestion());
		return "question";
	}
}
