package com.example.android.tflitecamerademo4;

import android.app.Application;
import android.content.Context;
/**
 * Created by wyf
 */
public class BaseApplication extends Application {

    public static Context mContext;

    @Override public void onCreate() {
        super.onCreate();
        mContext = this;
    }
}