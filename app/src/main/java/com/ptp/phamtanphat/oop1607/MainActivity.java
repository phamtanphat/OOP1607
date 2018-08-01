package com.ptp.phamtanphat.oop1607;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Doi tuong la gi la tap the giong nhau ve thuoc tinh hay hanh vi
//        Doi tuong == Class = Object
//        Connguoi nhanvata = new Connguoi("Nguyen Van A",30);
//        nhanvata.ten = "Nguyen Van A";
//        nhanvata.tuoi =  30;
//        nhanvata.setTen("Nguyen Van A");

//        Connguoi nhanvatb = new Connguoi();
//        nhanvatb.tuoi = 50;
//        nhanvatb.ten = "Nguyen Van B";

//        Log.d("BBB",nhanvata.getTen());

//        Dongvat concho = new Dongvat();
        //Khi nam 2 noi khac nhau
//        concho.setTe();
//        Show();
        Dongvat dongvat = new Dongvat();
        dongvat.setTuoi(10);
    }
    //Phuong thuc nap chong : overload khi dx nam cung voi nhau se co cac tham so khac truyen vao
    //Phuong thuc ghi de : override nam 2 noi khac nhau giong tat ca ve ten phuong thuc chi khac va cach su ly
    //
    public void Show(){
        Toast.makeText(this, "AAA", Toast.LENGTH_SHORT).show();
    }
    public void Show(int a){
        Toast.makeText(this, a + "", Toast.LENGTH_SHORT).show();
    }
}
