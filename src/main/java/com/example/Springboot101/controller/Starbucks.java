package com.example.Springboot101.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Starbucks {

    @GetMapping("/menu")
    public String menu() {
        return "메뉴 내놓으셈";
    }

}
