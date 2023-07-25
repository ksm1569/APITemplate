package com.app.api.feigntest.client;

import com.app.api.health.dto.HealthCheckResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// 인터페이스에 호출코드를 작성해서 다른 서버의 api를 호출함
@FeignClient(url = "http://localhost:8080", name = "helloClient")
public interface HelloClient {

    @GetMapping(value = "/api/health", consumes = "apllication/json")
    HealthCheckResponseDto healthCheck();

}
