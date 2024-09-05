package org.comstudy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/info")
    public String getInfo() {
        return "info";
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        System.out.println("get home 호출");
        model.addAttribute("message", "helloThymeleaf");
        return "home";
    }
}
