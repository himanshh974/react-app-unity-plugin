package com.app5;

import android.content.Intent;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class MyBasicModule extends ReactContextBaseJavaModule {
    ReactApplicationContext context= getReactApplicationContext();
    public MyBasicModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return "MyModule";
    }

    @ReactMethod
    public void NavigateToNative(String message){
        Log.d("Msg", message);
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            i.setClassName("com.EE.UnityJavaPluginMethod1", "com.EE.UnityJavaPluginMethod1.UnityPlayerActivity");
            i.putExtra(Intent.EXTRA_TEXT,message);
            i.setType("text/plain");
            context.startActivity(i);
    }
}
