package com.niroshan.lockscreen.lockerstable;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.niroshan.lockscreen.R;

public class Help extends ActionBarActivity {

    Button btn, btn2, btn3;
    android.support.v7.app.ActionBar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        initActionBar();

        btn = (Button) findViewById(R.id.button1);
        btn3 = (Button) findViewById(R.id.button3);


        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                finish();

            }
        });


        btn3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
                finish();

            }
        });


    }

    private void initActionBar() {
        actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(0xff00BCD4));
        actionbar.setDisplayShowTitleEnabled(false);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.DKGRAY));
        actionbar.setDisplayShowTitleEnabled(true);
        actionbar.setTitle(Html.fromHtml("<font color='#ffffff'> <b> Locker guide </b> </font>"));
    }


}

