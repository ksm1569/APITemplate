package com.app.api.token.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;


@Getter @Builder
public class AccessTokenResponseDto {

    @Schema(description = "grantType", example = "Bearer", required = true)
    private String grantType;

    @Schema(description = "accessToken", example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBQ0NFUsssYXQiOjE2OTI3OTAzNDYsImV4cCI6MTY5Mjc5MTI0NiwibWVtYmVySWQiOjEsInJvbGUiOiJBRE1JTiJ9.HPSdL2Ujh-roirWObOAG-A-3k-FuD5c86qmMQJJkg9kltNWHTzAlpRKkNN_N217tRFgWPIUAuE7orbrRq-f3Jg", required = true)
    private String accessToken;

    @Schema(description = "access token 만료시간", example = "2023-08-23 20:47:26", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date accessTokenExpireTime;
}
