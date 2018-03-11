package com.example.hooch.ewalletapp.domain;

/**
 * Created by calvinlow on 26/02/2018.
 */

public class LoginResponse {

    private User user;
    private String token;

    public LoginResponse(User user, String token) {
        this.user = user;
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
