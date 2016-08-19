package com.niroshan.lockscreen.lockerstable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.support.v4.content.LocalBroadcastManager;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
public class Notification extends NotificationListenerService {

	Context context;

	@Override
	public void onCreate() {

		super.onCreate();
		context = getApplicationContext();

	}

	@TargetApi(Build.VERSION_CODES.KITKAT)
	@Override
	public void onNotificationPosted(StatusBarNotification sbn) {

		Bundle extras = sbn.getNotification().extras;

		String title = extras.getString("android.title");
		String text = extras.getCharSequence("android.text").toString();

		String pack = sbn.getPackageName();
		CharSequence ticker = sbn.getNotification().tickerText;
		boolean ongoing = sbn.isOngoing();
		boolean clearable = sbn.isClearable();

		
		Intent msgrcv = new Intent("Msg");
		msgrcv.putExtra("title", title);
		msgrcv.putExtra("text", text);
		msgrcv.putExtra("p", pack);
		msgrcv.putExtra("c", clearable);
		msgrcv.putExtra("o", ongoing);
		msgrcv.putExtra("t", String.valueOf(ticker));

		
		LocalBroadcastManager.getInstance(context).sendBroadcast(msgrcv);

	}

	@TargetApi(Build.VERSION_CODES.KITKAT)
	@Override
	public void onNotificationRemoved(StatusBarNotification sbn) {

		Bundle extras = sbn.getNotification().extras;

		String title = extras.getString("android.title");
		String text = extras.getCharSequence("android.text").toString();

		Intent msgrcv = new Intent("Msg");
		msgrcv.putExtra("title2", title);
		msgrcv.putExtra("text2", text);

		LocalBroadcastManager.getInstance(context).sendBroadcast(msgrcv);

	}
}
