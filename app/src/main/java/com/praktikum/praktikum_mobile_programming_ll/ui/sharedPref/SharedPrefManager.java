package com.praktikum.praktikum_mobile_programming_ll.ui.sharedPref;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    public SharedPrefManager(Context context) {
        sharedPreferences = context.getSharedPreferences("latihan_shared_preference",context.MODE_PRIVATE);
        editor =sharedPreferences.edit();
    }

    public void saveString(String value) {
        editor.putString("ini_string",value);
        editor.commit();
    }

    public String getString() {
        return sharedPreferences.getString("ini_string", "");
    }
}

