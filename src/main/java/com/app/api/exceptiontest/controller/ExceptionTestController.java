package com.app.api.exceptiontest.controller;

import com.app.api.exceptiontest.dto.BindExceptionTestDto;
import com.app.api.exceptiontest.dto.TestEnum;
import com.app.global.error.ErrorCode;
import com.app.global.error.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/exception")
public class ExceptionTestController {

    // 파라미터 벨리데이션 바인딩 에러 테스트
    @GetMapping("/bind-exception-test")
    public String bindExceptionTest(@Valid BindExceptionTestDto bindExceptionTestDto){
        return "OK";
    }

    // 파라미터 타입이 매치가 안될 경우 에러 테스트 / post로 바꾸어서 handleHttpRequestMethodNotSupportedException 테스트도 해봄
    @GetMapping("/type-exception-test")
    public String typeMismatchException(TestEnum testEnum){
        return "OK";
    }

    // 비지니스 로직 에러 테스트
    @GetMapping("/business-exception-test")
    public String businessExceptionTest(String isError){
        if("true".equals(isError)){
            throw new BusinessException(ErrorCode.TEST);
        }
        return "OK";
    }

    // 나머지 예외 에러 테스트
    @GetMapping("/exception-test")
    public String exceptionTest(String isError){
        if("true".equals(isError)){
            throw new IllegalArgumentException("예외 테스트");
        }
        return "OK";
    }

}
