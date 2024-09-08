package com.example.Springboot101.controller;

import com.example.Springboot101.model.Member;
import org.springframework.web.bind.annotation.*;

// 클라이언트(리액트) <-> 서버(스프링부트): HTTP 프로토콜(Header / body)
// Get(얻기): 옵션사항은 queryString으로 붙임 ex) ?genre=action&age=15
// Post(요청): 옵션사항 Body 꽁꽁 숨기고 보냄

@RestController
@RequestMapping("/hamburger") // /hamburger
public class Hamburger {
    @GetMapping("/cheese")
    public String cheese() {
        return "치즈버거";
    }
    @GetMapping("/potato/{id}")
    public String potato(@PathVariable Integer id){
        //potatorepository.findbyid(id)
        return "정의석";
    }
    @PostMapping("/coke")
    public String coke(@RequestBody Member member){
        return "콜라";
    }

    // sidemenu - pathvariable
    @GetMapping("/sidemenu/{id}")
    public void sideMenu(@PathVariable Integer id){
    }

    // hamburger - requestparam 빵종류, 패티종류
    @GetMapping("")
    public void hamburger(@RequestParam String bread, @RequestParam String patty){
    }





}
