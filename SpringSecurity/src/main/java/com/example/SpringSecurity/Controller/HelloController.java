package com.example.SpringSecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String hello(HttpServletRequest request){
        return "Hello " + request.getSession().getId();
    }
    @GetMapping("/home")
    public String Home(HttpServletRequest request){
        return "Home " + request.getSession().getId();
    }
    @GetMapping("/about")
    public String about(){
        return "Spring security";
    }
}
