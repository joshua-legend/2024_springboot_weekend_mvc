package com.example.Springboot101.util;

public enum Code {
    SUCCESS(200),
    CREATE(201),
    BAD_REQUEST(400),
    UNAUTHORIZED(401), //인증 실패
    NOT_FOUND(404),
    SERVER_ERROR(500);

    private int code;

    Code(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
