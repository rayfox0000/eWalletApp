package com.example.hooch.ewalletapp.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by calvinlow on 26/02/2018.
 */

public class LoginDetails {

    private String email;
    private String password;
    @SerializedName("grant_type")
    private String grant_type = "password";
    private String scope = "frontend";

    public LoginDetails(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginDetails(String email, String password, String grant_type, String scope) {
        this.email = email;
        this.password = password;
        this.grant_type = grant_type;
        this.scope = scope;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public String getScope() {
        return scope;
    }
}
