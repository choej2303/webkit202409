package com.example.demo.service;

public class GreetingServiceEng implements GreetingService {
    public GreetingServiceEng() {
        System.out.println("default constructor");
    }

    @Override
    public void SayHello() {
        System.out.println(">>> Hello world!");
    }
}
