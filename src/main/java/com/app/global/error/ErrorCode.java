package com.app.global.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    TEST(HttpStatus.INTERNAL_SERVER_ERROR, "001", "business exception test"),


    // 인증영역
    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "A-001", "토큰 만료"),
    NOT_VALID_TOKEN(HttpStatus.UNAUTHORIZED, "A-002", "유효한 토큰이 아닙니다")

    ;

    ErrorCode(HttpStatus httpStatus, String errorCode, String message){
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }

    private HttpStatus httpStatus;
    private String errorCode;
    private String message;
}
