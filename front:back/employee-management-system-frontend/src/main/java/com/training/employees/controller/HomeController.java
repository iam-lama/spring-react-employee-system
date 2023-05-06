package com.training.employees.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("message", "Welcome to the Spring MVC Application");
		return "index";
	}

	@GetMapping("/about")
	public String aboutUs() {
		return "about";
	}

}
