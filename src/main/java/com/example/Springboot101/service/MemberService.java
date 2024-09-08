package com.example.Springboot101.service;

import com.example.Springboot101.constants.Message;
import com.example.Springboot101.model.Member;
import com.example.Springboot101.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member getMember(Integer id) {
        Optional<Member> member = memberRepository.findById(id);
        if (member.isPresent()) {
            return member.get();
        } else {
            return new Member("없음", "없음", "없음");
        }
    }
    // Server: 따가리

    public String getNameById(Integer id) {
        return this.memberRepository.findById(id)
                .map((v) -> v.getName())
                .orElse(Message.INVALID_MEMBER_ID.getMessage());
    }


    public List<Member> getAllMember() {
        return this.memberRepository.findAll();
    }


}
