package com.praktikum.praktikum_mobile_programming_ll.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.praktikum.praktikum_mobile_programming_ll.R;
import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.dao.MatkulDao;
import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.model.Matkul;
import com.praktikum.praktikum_mobile_programming_ll.ui.CrudRoomApp;
import com.praktikum.praktikum_mobile_programming_ll.ui.adapter.MatkulRvAdapter;
import com.praktikum.praktikum_mobile_programming_ll.ui.common.DataClickListener;

import java.util.List;

public class ListMatkulActivity extends AppCompatActivity {

    public final static String TAG_DATA_MATKUL = "data_matkul";
    private RecyclerView rvListMatkul;
    private FloatingActionButton fabTambah;
    private MatkulRvAdapter adapter;
    private final MatkulDao matkulDao = CrudRoomApp.getInstance().getDataBase().matkulDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_matkul);

        adapter = new MatkulRvAdapter();

        rvListMatkul = findViewById(R.id.rv_list_matkul);
        fabTambah = findViewById(R.id.fab_tambah_data);

        rvListMatkul.setAdapter(adapter);

        adapter.setOnItemClickListener(new DataClickListener<Matkul>() {
            @Override
            public void onItemClick(View view, Matkul matkul, int position) {
                if (view.getId() == R.id.btn_hapus) {

                    matkulDao.delete(matkul);
                    Toast.makeText(getApplicationContext(), "Berhasil Dihapus", Toast.LENGTH_SHORT).show();
                    adapter.removeData(matkul);

                } else if (view.getId() == R.id.item_list) {

                    Intent intent = new Intent(getApplicationContext(), TambahUbahMatkulActivity.class);
                    intent.putExtra(TAG_DATA_MATKUL, matkul.getId());
                    startActivity(intent);

                }
            }
        });

        fabTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TambahUbahMatkulActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Matkul> datas = matkulDao.getAll();
        adapter.submitList(datas);
    }

}