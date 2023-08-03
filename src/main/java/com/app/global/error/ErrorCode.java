package com.app.global.error;

import lombok.Getter;
import org.aspectj.weaver.patterns.HasMemberTypePatternForPerThisMatching;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    TEST(HttpStatus.INTERNAL_SERVER_ERROR, "001", "business exception test"),


    // 인증영역
    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "A-001", "토큰 만료"),
    NOT_VALID_TOKEN(HttpStatus.UNAUTHORIZED, "A-002", "유효한 토큰이 아닙니다"),
    NOT_EXISTS_AUTHORIZATION(HttpStatus.UNAUTHORIZED, "A-003", "Authorization Header Null"),
    NOT_VALID_BEARER_GRANT_TYPE(HttpStatus.UNAUTHORIZED, "A-004", "인증 타입이 Bearer 타입이 아닙니다."),
    REFRESH_TOKEN_NOT_FOUND(HttpStatus.UNAUTHORIZED, "A-005", "해당 REFRESH TOKEN은 존재하지 않습니다."),
    REFRESH_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "A-006", "해당 REFRESH TOKEN은 만료되었습니다."),
    // 회원
    INVALID_MEMBER_TYPE(HttpStatus.BAD_REQUEST, "M-001", "잘못된 회원 타입 입니다."),
    ALREADY_REGISTERED_MEMBER(HttpStatus.BAD_REQUEST, "M-002", "이미 가입 된 회원 입니다."),
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
