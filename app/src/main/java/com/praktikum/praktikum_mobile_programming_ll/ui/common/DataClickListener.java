package com.praktikum.praktikum_mobile_programming_ll.ui.common;

import android.view.View;

public interface DataClickListener<Data> {
    public void onItemClick(View view, Data data, int position);
}
