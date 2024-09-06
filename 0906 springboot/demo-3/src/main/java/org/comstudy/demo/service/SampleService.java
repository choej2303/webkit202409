package org.comstudy.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public SampleService  () {
        System.out.println(">>> SampleService  constructor");
    }

    public void doSomething() {
        System.out.println(">>> Hello world");
    }

}
