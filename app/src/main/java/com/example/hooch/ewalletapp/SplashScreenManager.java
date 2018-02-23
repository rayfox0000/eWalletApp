package com.example.hooch.ewalletapp;

/**
 * Created by hooch on 3/2/2018.
 */

import android.app.Activity;
import android.app.Application;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

class SplashScreenManager implements Application.ActivityLifecycleCallbacks {

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        try {
            ActivityInfo activityInfo = activity.getPackageManager()
                    .getActivityInfo(activity.getComponentName(), PackageManager.GET_META_DATA);

            Bundle metaData = activityInfo.metaData;

            int theme;
            if (metaData != null) {
                theme = metaData.getInt("theme", R.style.AppTheme);
            } else {
                theme = R.style.AppTheme;
            }

            activity.setTheme(theme);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onActivityStarted(Activity activity) {
    }

    @Override
    public void onActivityResumed(Activity activity) {
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }
}
