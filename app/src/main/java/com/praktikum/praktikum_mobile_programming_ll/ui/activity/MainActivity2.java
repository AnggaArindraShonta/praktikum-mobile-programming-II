package com.praktikum.praktikum_mobile_programming_ll.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.praktikum.praktikum_mobile_programming_ll.R;

public class MainActivity2 extends AppCompatActivity {

    private Button btnMahasiswa;
    private Button btnMatkul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud);

        btnMahasiswa = findViewById(R.id.btn_mahasiswa);
        btnMatkul = findViewById(R.id.btn_matkul);

        btnMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(getApplicationContext(), ListMahasiswaActivity.class);
                startActivity(intentMain);
            }
        });

        btnMatkul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMatkul = new Intent(getApplicationContext(), ListMatkulActivity.class);
                startActivity(intentMatkul);
            }
        });
    }
}

