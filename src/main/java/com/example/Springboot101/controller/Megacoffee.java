package com.example.Springboot101.controller;

import com.example.Springboot101.model.Member;
import com.example.Springboot101.repository.MemberRepository;
import com.example.Springboot101.service.MemberService;
import com.example.Springboot101.util.ApiResponse;
import com.example.Springboot101.util.Code;
import com.example.Springboot101.util.ResponseMessage;
import com.example.Springboot101.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Megacoffee {

    private MemberService memberService;

    public Megacoffee(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member/{id}")
    public Member getMember(@PathVariable Integer id) {
        return this.memberService.getMember(id);
    }

    @GetMapping("/all-member")
    public List<Member> getAllMember(){
        return this.memberService.getAllMember();
    }

    @GetMapping("/api-test")
    public ApiResponse<String> getApiTest(){
        return new ApiResponse<>(Status.OK, Code.SUCCESS, ResponseMessage.SUCCESS, "전주라이스버거");
    }


}
