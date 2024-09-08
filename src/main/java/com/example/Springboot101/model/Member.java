package com.example.Springboot101.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // class <-> table
@Table(name = "member")
public class Member {

    @Id
    private Integer id;
    private String name;
    private String grade;
    private String nickname;

    public Member() {
    }
    public Member(String name, String grade, String nickname) {
        this.name = name;
        this.grade = grade;
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
