package com.example.demo.controller;

import com.example.demo.service.GreetingService;

public class HomeController {

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private GreetingService greetingService;

    public HomeController(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("HomeController 생성자 호출");
        
        execute();
    }


    private void execute() {
        greetingService.SayHello();
    }
}
