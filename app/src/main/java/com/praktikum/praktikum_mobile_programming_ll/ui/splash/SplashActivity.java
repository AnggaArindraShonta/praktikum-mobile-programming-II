package com.praktikum.praktikum_mobile_programming_ll.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.praktikum.praktikum_mobile_programming_ll.R;
import com.praktikum.praktikum_mobile_programming_ll.ui.HomeActivity;
import com.praktikum.praktikum_mobile_programming_ll.ui.profile.ProfileActivity;
import com.praktikum.praktikum_mobile_programming_ll.ui.sharedPref.SharedPrefManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Handler handler = new Handler();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final SharedPrefManager sharedPrefManager = new SharedPrefManager(this);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (sharedPrefManager.getIsLogin()){
                    Intent i = new Intent(SplashActivity.this, ProfileActivity.class);
                    finishAffinity();
                    startActivity(i);
                }else{
                    Intent i = new Intent(SplashActivity.this, HomeActivity.class);
                    finishAffinity();
                    startActivity(i);
                }
            }
        }, 3000);

    }
}
