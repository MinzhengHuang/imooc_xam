package com.xam;

import android.app.Application;

import com.xam.utils.CustomCrashHandler;

public class XamApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		CustomCrashHandler mCustomCrashHandler = CustomCrashHandler.getInstance();
		mCustomCrashHandler.setCustomCrashHanler(getApplicationContext());
	}

}
