package com.example.hooch.ewalletapp;

import com.example.hooch.ewalletapp.domain.User;

/**
 * Created by calvinlow on 18/03/2018.
 */

public class CurrentUser {
    public static User userDetails = new User();
    public static String token = "";

    public static void setCurrentUser(User user) {
        userDetails = user;
    }

    public static void setToken(String newToken) {
        token = newToken;
    }
}
