package org.example;

import lombok.Getter;

@Getter
public class RefreshTokenRequest {
    private String refreshToken;


    RefreshTokenRequest(){

    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
