package com.abhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j

public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        log.info("Home page accessed");
        model.addAttribute("name", "Abhishek");
        model.addAttribute("id", 101);
        model.addAttribute("designation", "Software Engineer");
        model.addAttribute("github", "https://github.com/AbhishekSharma-99");
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        log.info("About page accessed");
        return "about";
    }

    @GetMapping("/services")
    public String services() {
        log.info("Service page accessed");
        return "services";
    }

}
