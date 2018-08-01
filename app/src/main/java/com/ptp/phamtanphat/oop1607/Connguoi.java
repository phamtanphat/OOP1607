package com.ptp.phamtanphat.oop1607;

import android.content.Context;

public class Connguoi {
    //Thuoc tinh
    private String ten;
    private Integer tuoi;
    Dongvat dongvat;

    public Connguoi(String ten, Integer tuoi, Dongvat dongvat) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.dongvat = dongvat;
    }


    //Phuong thuc rang buoc du lieu cho doi tuong : Constructor

    //To hop phim tao constructor va getset : Alt + insert



    public String getTen() {

        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }


}
