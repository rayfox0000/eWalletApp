package com.example.hooch.ewalletapp;

/**
 * Created by hooch on 3/2/2018.
 */

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // register the util to remove splash screen after loading
        registerActivityLifecycleCallbacks(new SplashScreenManager());
    }
}