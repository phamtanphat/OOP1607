package com.ptp.phamtanphat.oop1607;

import android.content.Context;
import android.widget.Toast;

public abstract class Listen {
    //Khong the khoi tao
    //co the ke thua lai du lieu hoac phuong thuc
    //chi co duy nhat minh no
    //neu phuong thuc gan voi tu khoa abstract thi phuong thuc do bat buoc phai duoc
    // viet lai khi ban goi toi listen

    public String ten;
    public abstract void Show();
    public void AAA(Context context){
        Toast.makeText(context, "AAA", Toast.LENGTH_SHORT).show();
    }
}
