package be.ehb.github_test_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Api_controller {

    @GetMapping("/hello")
    public String sathello(){
        return "hello world";
    }
}
