package com.example.hooch.ewalletapp;

/**
 * Created by calvinlow on 18/03/2018.
 */

public interface PermissionCallback {

    void onPermissionGranted();

    void onPermissionDenied();
}
