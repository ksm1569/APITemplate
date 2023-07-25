package com.app.global.config;

import com.app.global.error.FeignClientExceptionErrorDecoder;
import feign.Logger;
import feign.Retryer;
import feign.codec.ErrorDecoder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@EnableFeignClients(basePackages = "com.app") // todo 패키지수정하면 수정필요
@Import(FeignClientsConfiguration.class)
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL; // todo 로그가 너무 많이 남으면 BASIC으로 수정
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new FeignClientExceptionErrorDecoder();
    }

    @Bean
    public Retryer retryer() {
        return new Retryer.Default(1000, 2000, 3);
    }
}
