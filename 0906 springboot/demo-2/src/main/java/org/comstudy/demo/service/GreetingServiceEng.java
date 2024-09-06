package org.comstudy.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceEng implements GreetingService {
    @Override
    public void sayHello() {
        System.out.println(">>>> hello!");
    }
}
