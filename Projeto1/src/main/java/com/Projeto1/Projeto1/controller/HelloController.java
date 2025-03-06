
package com.Projeto1.Projeto1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api") 
public class HelloController {

    @GetMapping("/test")
    public String helloWorld() {
        return "Hello, World!";
    }
}
