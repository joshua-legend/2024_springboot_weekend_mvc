package com.example.Springboot101.util;

public enum ResponseMessage {
    SUCCESS("성공 했슈"),
    CREATE("만들어 졌슈"),
    BAD_REQUEST("잘못보냈슈"),
    UNAUTHORIZED("누구슈"),
    NOT_FOUND("그런거 없슈"),
    SERVER_ERROR("지금 망했슈");

    private String code;

    ResponseMessage(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
