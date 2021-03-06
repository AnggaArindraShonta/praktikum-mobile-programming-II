package com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.dao.MahasiswaDao;
import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.dao.MatkulDao;
import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.model.Mahasiswa;
import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.model.Matkul;

@Database(entities = {Mahasiswa.class, Matkul.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase {

    public abstract MahasiswaDao userDao();
    public abstract MatkulDao matkulDao();
}
