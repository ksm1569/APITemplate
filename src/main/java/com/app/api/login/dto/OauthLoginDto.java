package com.app.api.login.dto;

import com.app.global.jwt.dto.JwtTokenDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.Date;

public class OauthLoginDto {

    @Getter @Setter
    public static class Request {
        @Schema(description = "소셜 로그인 회원 타입", example = "KAKAO", required = true)
        private String memberType;
    }

    @Getter @Setter
    @Builder @NoArgsConstructor @AllArgsConstructor
    public static class Response {

        @Schema(description = "grantType", example = "Bearer", required = true)
        private String grantType;

        @Schema(description = "accessToken", example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBQ0NFUsssYXQiOjE2OTI3OTAzNDYsImV4cCI6MTY5Mjc5MTI0NiwibWVtYmVySWQiOjEsInJvbGUiOiJBRE1JTiJ9.HPSdL2Ujh-roirWObOAG-A-3k-FuD5c86qmMQJJkg9kltNWHTzAlpRKkNN_N217tRFgWPIUAuE7orbrRq-f3Jg", required = true)
        private String accessToken;

        @Schema(description = "access token 만료시간", example = "2023-08-23 20:47:26", required = true)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
        private Date accessTokenExpireTime;

        @Schema(description = "refreshToken", example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJSabcXQiOjE2OTI3OTAzNDYsImV4cCI6MTY5Mzk5OTk0NiwibWVtYmVySWQiOjF9.9g8pwYDC6j9vexVkYGbqywuJCffQJjUYYWt9lBGf68fbq3BI6WgdTzpPlAWmHmvd6WOqjnrjjCXXPupQweoprA", required = true)
        private String refreshToken;

        @Schema(description = "refresh token 만료시간", example = "2023-08-23 20:47:26", required = true)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
        private Date refreshTokenExpireTime;

        public static Response of(JwtTokenDto jwtTokenDto) {
            return Response.builder()
                    .grantType(jwtTokenDto.getGrantType())
                    .accessToken(jwtTokenDto.getAcessToken())
                    .accessTokenExpireTime(jwtTokenDto.getAccessTokenExpireTime())
                    .refreshToken(jwtTokenDto.getRefreshToken())
                    .refreshTokenExpireTime(jwtTokenDto.getRefreshTokenExpireTime())
                    .build();
        }
    }
}
