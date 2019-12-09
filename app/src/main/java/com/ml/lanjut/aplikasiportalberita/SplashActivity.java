package com.ml.lanjut.aplikasiportalberita;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_TIME = 2500;

    // SplashScreen Splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent intent = new Intent();
                intent.setClass(SplashActivity.this,
                        MainActivity.class);

                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();

            }
        }, SPLASH_DISPLAY_TIME);
    }
}