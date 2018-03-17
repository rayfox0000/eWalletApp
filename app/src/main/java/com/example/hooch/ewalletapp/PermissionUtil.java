package com.example.hooch.ewalletapp;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

/**
 * Created by calvinlow on 17/03/2018.
 */

public class PermissionUtil {

    public static final String cameraPermission = Manifest.permission.CAMERA;

    public static void onRequestPermissionsResult(int[] grantResults,
                                                  PermissionCallback permissionCallback) {
        if (grantResults.length > 0) {
            for (int grantResult : grantResults) {
                if (grantResult == PackageManager.PERMISSION_GRANTED) {
                    permissionCallback.onPermissionGranted();
                } else {
                    permissionCallback.onPermissionDenied();
                }
            }
        }
    }

    public static void requestPermission(final Activity activity, final String[] permissions,
                                         final int REQUEST_CODE) {
        // No explanation needed, we can request the permission.
        ActivityCompat.requestPermissions(activity, permissions, REQUEST_CODE);
    }

    public static void requestPermission(final Activity activity, final String permission,
                                         final int REQUEST_CODE) {
        // No explanation needed, we can request the permission.
        ActivityCompat.requestPermissions(activity, new String[] { permission }, REQUEST_CODE);
    }

    public static boolean checkPermissonGranted(Context context, String permission) {
        return (ActivityCompat.checkSelfPermission(context, permission)
                == PackageManager.PERMISSION_GRANTED);
    }
}
