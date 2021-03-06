package com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.praktikum.praktikum_mobile_programming_ll.RoomDB.data.model.Matkul;

import java.util.List;

    @Dao
    public interface MatkulDao {
        @Query("SELECT * FROM matkul")
        List<Matkul> getAll();

//    @Transaction
//    @Query("SELECT * FROM matkul")
//    public List<MatkulWithMahasiswa> getMatkulWithMahasiswa();

        @Query("SELECT * FROM matkul WHERE id LIKE :matkulId LIMIT 1")
        Matkul findById(int matkulId);

        @Update
        void update(Matkul matkul);

        @Insert
        void insert(Matkul matkul);

        @Delete
        void delete(Matkul matkul);
}
