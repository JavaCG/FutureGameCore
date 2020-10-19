package com.futuregame.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class FutureSDK
{

    public interface LoginListener extends com.futuregame.sdk.FutureSDK.LoginListener {}

    public static void init(Activity activity)
    {
        com.futuregame.sdk.FutureSDK.init(activity);
    }

    public static Bundle getMetaData()
    {
        return com.futuregame.sdk.FutureSDK.getMetaData();
    }

    public static void showFloatingView()
    {
        com.futuregame.sdk.FutureSDK.showFloatingView();
    }

    public static void doLogin(Activity activity, FutureSDK.LoginListener loginListener)
    {
        com.futuregame.sdk.FutureSDK.doLogin(activity, loginListener);
    }

    public static void logout()
    {
        com.futuregame.sdk.FutureSDK.logout();
    }

    public static void onNewIntent(Activity activity, Intent intent)
    {
        com.futuregame.sdk.FutureSDK.onNewIntent(activity, intent);
    }

    public static void onStart(Activity activity)
    {
        com.futuregame.sdk.FutureSDK.onStart(activity);
    }

    public static void onResume(Activity activity)
    {
        com.futuregame.sdk.FutureSDK.onResume(activity);
    }

    public static void onPause(Activity activity)
    {
        com.futuregame.sdk.FutureSDK.onPause(activity);
    }

    public static void onStop(Activity activity)
    {
        com.futuregame.sdk.FutureSDK.onStop(activity);
    }

    public static void onRestart(Activity activity)
    {
        com.futuregame.sdk.FutureSDK.onRestart(activity);
    }

    public static void onDestroy(Activity activity)
    {
        com.futuregame.sdk.FutureSDK.onDestroy(activity);
    }

    public static void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data)
    {
        com.futuregame.sdk.FutureSDK.onActivityResult(activity, requestCode, resultCode, data);
    }

}
