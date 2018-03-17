package com.example.hooch.ewalletapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by calvinlow on 18/03/2018.
 */

public class SharedPrefManager {

    public static final String JWT = "USER_JWT";
    public static final String CURRENT_USER = "CURRENT_USER";

    private static String sharedPrefFile = "com";
    private static SharedPreferences sharedPreferences;

    public static void initSharedPref(Activity activity) {
        sharedPreferences = activity.getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE);
    }

    public static void save(String name, String data) {
        SharedPreferences.Editor preferencesEditor = sharedPreferences.edit();
        preferencesEditor.putString(name, data);
        preferencesEditor.apply();
    }

    public static String retrieve(String name) {
        return sharedPreferences.getString(name, null);
    }

}
