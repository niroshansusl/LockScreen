package com.niroshan.lockscreen.lockerstable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Receiver extends BroadcastReceiver {

    public static boolean wasScreenOn = true;
    SharedPreferences spf;
    String locker, on, skip;

    @Override

    public void onReceive(Context context, Intent intent) {


        spf = PreferenceManager.getDefaultSharedPreferences(context);
        locker = spf.getString("Locker", "");

        on = spf.getString("on", "");

        skip = spf.getString("skip", "0");

    }


}