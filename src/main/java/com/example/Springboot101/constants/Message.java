package com.example.Springboot101.constants;

public enum Message {
    INVALID_MEMBER_ID("Invalid Member Id");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
