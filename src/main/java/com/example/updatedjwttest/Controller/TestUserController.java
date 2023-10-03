package com.example.updatedjwttest.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
@RequiredArgsConstructor
public class TestUserController {
    @GetMapping
    public String printHello(){
        return "Hello, Welcome to my Springboot tutorial";
    }
}
