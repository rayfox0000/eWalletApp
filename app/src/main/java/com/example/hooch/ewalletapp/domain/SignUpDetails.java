package com.example.hooch.ewalletapp.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hooch on 12/3/2018.
 */

public class SignUpDetails {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String username;

    public SignUpDetails(String email, String password, String firstName, String lastName, String username) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }
}
