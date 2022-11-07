package com.baxodirdavirov.lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Have a nice day!";
    @Override
    //Faoliyat birinchi marta yaratilganda chaqiriladi. Bu yerda siz barcha oddiy statik sozlashlarni bajarishingiz kerak: ko‘rinishlar yaratish, ma’lumotlarni ro‘yxatlarga bog‘lash va h.k. Bu usul sizga faoliyatning avval muzlatilgan holatini o‘z ichiga olgan To‘plamni ham taqdim etadi, agar mavjud bo‘lsa.
    // Har doim ortidan onStart()
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Log.i(TAG,"onCreate");

    }

    //Faoliyat foydalanuvchiga ko'rinadigan bo'lsa chaqiriladi.
    // Har doim ortidan onResume()yoki onStop()
    protected void onStart(){
        super.onStart();

        Log.i(TAG,"onStart");
    }


}