package com.example.hooch.ewalletapp;

import android.app.Activity;
import android.view.View;

/**
 * Created by hooch on 4/2/2018.
 */
public class Utils {
    public static final String regEx = "^[_A-Za-z0-9-]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";
    public static final String Login_Fragment = "Login_Fragment";
    public static final String SignUp_Fragment = "SignUp_Fragment";
    public static final String ForgotPassword_Fragment = "ForgotPassword_Fragment";

    public static void customToast(Activity activity, View view, String msg) {
        new CustomToast().Show_Toast(activity, view, msg);
    }


}
