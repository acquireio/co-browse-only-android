package com.example.acquire_android.cobrowseonly;

import android.app.Application;

import com.acquireio.AcquireApp;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AcquireApp.init(this, [ADD YOUR ACCOUNT ID HERE]);
    }
}
