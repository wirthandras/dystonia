package hu.wirthandras.dystonia.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hu.wirthandras.dystonia.question.Answer;
import hu.wirthandras.dystonia.service.QuestionService;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
	private int index;

	@RequestMapping("{subCategory}/question")
	public String question(@PathVariable("subCategory") String subCategory, Model model) throws IOException {
		model.addAttribute("question", service.getQuestion());
		return "question";
	}
	
	@RequestMapping("{subCategory}/question/{id}")
	public String questionPar(@PathVariable("subCategory") String subCategory, @PathVariable("id") String id, Model model) throws IOException {
		index = Integer.parseInt(id);
		model.addAttribute("question", service.getQuestion(index));
		model.addAttribute("answer", new Answer());
		return "question";
	}
	
	@RequestMapping(value = "/rand", method = RequestMethod.POST)
	public String randomClicked(@ModelAttribute Answer answer) {
		index++;
		return "redirect:classifications/question/" + index;
	}
	
}
