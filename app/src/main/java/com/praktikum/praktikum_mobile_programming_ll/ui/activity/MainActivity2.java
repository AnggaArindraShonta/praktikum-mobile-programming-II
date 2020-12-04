package com.praktikum.praktikum_mobile_programming_ll.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.praktikum.praktikum_mobile_programming_ll.R;
import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.model.Mahasiswa;
import com.praktikum.praktikum_mobile_programming_ll.ui.CrudRoomApp;
import com.praktikum.praktikum_mobile_programming_ll.ui.adapter.RvAdapter;
import com.praktikum.praktikum_mobile_programming_ll.ui.common.DataListListener;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView rvListMahasiswa;
    private FloatingActionButton fabTambah;
    private RvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud);
        adapter = new RvAdapter();

        rvListMahasiswa = findViewById(R.id.rv_list_mahasiswa);
        fabTambah = findViewById(R.id.fab_tambah_data);

        rvListMahasiswa.setAdapter(adapter);

        adapter.setRemoveListener(new DataListListener() {
            @Override
            public void onRemoveClick(Mahasiswa mahasiswa) {
                adapter.removeData(mahasiswa);
            }
        });

        fabTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, TambahDanUbahDataActivity.class));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Mahasiswa> datas = CrudRoomApp.getInstance().getDataBase().userDao().getAll();
        adapter.setData(datas);
    }

}

