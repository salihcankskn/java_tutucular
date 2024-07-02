package com.salihcankeskin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button linerSayfasıBtn;
    Button stringSayfasıBtn;
    Button relativeSayfasıBtn;
    Button sayiTutucuSayfasıBtn;
    Button setTextSayfasiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//kontrol tanımlamaları
        linerSayfasıBtn=findViewById(R.id.btn_linear);
        relativeSayfasıBtn=findViewById(R.id.btn_relative);
        setTextSayfasiBtn=findViewById(R.id.btn_settext);
        stringSayfasıBtn=findViewById(R.id.btn_string);
        sayiTutucuSayfasıBtn=findViewById(R.id.btn_sayiTutucu);

        //btn_linear butonuna tıkladığında ne yapsın
        linerSayfasıBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //btn_linear butonuna tıkladığında ne yapsın
                startActivity(new Intent(MainActivity.this, LineerLayloutActivity.class));


           }
        });

        relativeSayfasıBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RelariveLayoutActivity.class));
            }
            });

        setTextSayfasiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SetTextActivity.class));
            }
        });

        stringSayfasıBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,StringTutucuActivity.class));
            }
        });

        sayiTutucuSayfasıBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SayiTutucuActivity.class));
            }
        });






    }

}