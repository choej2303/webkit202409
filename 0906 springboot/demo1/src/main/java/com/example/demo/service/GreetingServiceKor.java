package com.example.demo.service;

public class GreetingServiceKor implements GreetingService {
    public GreetingServiceKor() {
        System.out.println("기본 생성자");
    }

    @Override
    public void SayHello() {
        System.out.println(">>>> 안녕하세요!");
    }
}
