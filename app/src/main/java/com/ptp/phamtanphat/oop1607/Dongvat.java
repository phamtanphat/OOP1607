package com.ptp.phamtanphat.oop1607;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Dongvat extends Connguoi {


    //Phuong thuc nap chong
    public void setTen(String ten, Context context) {
        Toast.makeText(context, ten, Toast.LENGTH_SHORT).show();
    }

    //Phuong thuc ghi de
    public void setTuoi(Integer tuoi) {
        tuoi += 10;
        Log.d("BBB", tuoi + " ");
    }
}
