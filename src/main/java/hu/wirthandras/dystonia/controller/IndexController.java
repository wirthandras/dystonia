package hu.wirthandras.dystonia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("index")
	public String index2() {
		return "index";
	}
	
	@RequestMapping("newpatient")
	public String newpatient() {
		return "newpatient";
	}
	
	@RequestMapping("personaldata")
	public String personaldata() {
		return "personaldata";
	}
	
	@RequestMapping("control")
	public String control() {
		return "control";
	}
	
	@RequestMapping("test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("patientlist")
	public String patientlist() {
		return "patientlist";
	}
	
	@RequestMapping("classification")
	public String classification() {
		return "classification";
	}
	
	@RequestMapping("etiology")
	public String etiology() {
		return "etiology";
	}
	
	@RequestMapping("bloodsample")
	public String bloodsample() {
		return "bloodsample";
	}
	
	@RequestMapping("familytree")
	public String familytree() {
		return "familytree";
	}
	
	@RequestMapping("test2")
	public String test2() {
		return "test2";
	}
	
}
