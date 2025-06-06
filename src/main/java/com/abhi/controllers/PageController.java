package com.abhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

public class PageController {


	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home page accessed");
		model.addAttribute("name", "Abhishek");
		model.addAttribute("id", 101);
		model.addAttribute("designation", "Software Engineer");
		model.addAttribute("github", "https://github.com/AbhishekSharma-99");
		return "home";
	}

}
