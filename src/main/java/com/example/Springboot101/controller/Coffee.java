package com.example.Springboot101.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 웹[브라우저] 어플리케이션 프로그램 만들때 MVC(Controller) 패턴 개꿀 최적화구나
// URL 의사소통을 함
// www.koreaIt.com/mara
// Controller


// Spring-boot: 서버와 클라이언트(Jsp,타임리프)를 모두 만들었음(전통적인 아키텍쳐)
// 장점:리액트 안배워도됨  단점: 코드가 비대해짐

// React + Spring-boot: 클라이언트 / 서버 (Restful Api 아키텍쳐)
// 장점:코드가 서로 분배됨 단점: 다배워야함

@Controller // 웨이터
public class Coffee {

    @GetMapping("/test") // get 방식으로 /test url 오면 아래 함수 실행
    @ResponseBody // Json으로 돌려주는 어노테이션
    public String test() {
        return "지각하면 커피임 ㅅㄱ";
    }

    //americano 아메리카노 개꿀맛
    @GetMapping("/americano")
    @ResponseBody
    public String americano() {
        return "안녕하세요 피싱사이트입니다.";
    }


    // /cake/10
    // /cake/20?topping=초코&iced=true
    @GetMapping("/cake")
    public String cake(Model model, @RequestParam(name = "name") String name) {
        model.addAttribute("name", name);
        return "cake.html";
    }

}
