package com.praktikum.praktikum_mobile_programming_ll.ui;

import android.app.Application;

import androidx.room.Room;

import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.db.AppDatabase;
import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.db.DataBaseMigrations;

public class CrudRoomApp extends Application {

    private static CrudRoomApp INSTANCE;
    private AppDatabase dataBase;

    public static CrudRoomApp getInstance() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        dataBase = Room.databaseBuilder(this, AppDatabase.class, "database_mahasiswa")
                .addMigrations(
                        DataBaseMigrations.MIGRATION_1_TO_2,
                        DataBaseMigrations.MIGRATION_2_TO_3
                )
                .fallbackToDestructiveMigrationOnDowngrade()
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();

        INSTANCE = this;
    }

    public AppDatabase getDataBase() {
        return dataBase;
    }

}
