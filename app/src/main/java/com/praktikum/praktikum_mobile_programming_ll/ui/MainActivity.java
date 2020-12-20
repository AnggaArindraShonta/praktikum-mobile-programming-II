package com.praktikum.praktikum_mobile_programming_ll.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.praktikum.praktikum_mobile_programming_ll.R;
import com.praktikum.praktikum_mobile_programming_ll.service.TimerServiceActivity;

public class MainActivity extends AppCompatActivity {
    Button btntest,btntoFragmentActivity,btntosharedprefandroomdb,btntimerservice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btntest = findViewById(R.id.btntest);
        btntoFragmentActivity = findViewById(R.id.btntoFragmentActivity);
        btntosharedprefandroomdb = findViewById(R.id.btntosharedprefandroomdb);
        btntimerservice  = findViewById(R.id.btntotimerservice);

    }

    @Override
    protected void onResume() {
        super.onResume();

        btntest.setOnClickListener(view -> {


            Intent intent = new Intent(getApplicationContext(), ReciverActivity.class);
            intent.putExtra("welcome", "halo dari Activity");
            startActivity(intent);

        });
        btntoFragmentActivity.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, WithFragmentActivity.class);
            startActivity(intent);

        });
        btntosharedprefandroomdb.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);

        });
        btntimerservice.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, TimerServiceActivity.class);
            startActivity(i);
        });
    }}

