package com.app.global.jwt.constant;

public enum TokenType {

    ACCESS, REFESH;

    public static boolean isAccessToken(String tokenType) {
        return TokenType.ACCESS.name().equals(tokenType);
    }
}
