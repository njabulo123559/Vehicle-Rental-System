package org.example;

import lombok.Getter;

@Getter
public class LoginRequest {
    private String username;
    private String password;

    LoginRequest(){

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
