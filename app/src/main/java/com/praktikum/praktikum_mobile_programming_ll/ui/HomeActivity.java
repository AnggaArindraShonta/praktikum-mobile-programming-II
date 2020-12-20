package com.praktikum.praktikum_mobile_programming_ll.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.praktikum.praktikum_mobile_programming_ll.R;
import com.praktikum.praktikum_mobile_programming_ll.ui.roomData.RoomDataActivity;
import com.praktikum.praktikum_mobile_programming_ll.ui.sharedPref.SharedPrefActivity;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnToShared =  findViewById(R.id.btnToSharedPref);
        Button btnToRoom =  findViewById(R.id.btnToRoomData);
        Button btnLogin =  findViewById(R.id.btnLogin);

        btnToShared.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, SharedPrefActivity.class);
            startActivity(intent);
        });

        btnToRoom.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, RoomDataActivity.class);
            startActivity(i);
        });


        btnLogin.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(i);
        });

    }
}
