package com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.dao.MahasiswaDao;
import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.model.Mahasiswa;

@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MahasiswaDao userDao();
}
