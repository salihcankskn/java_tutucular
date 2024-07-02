package com.salihcankeskin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetTextActivity extends AppCompatActivity {

    TextView txtAdSoyad;
    Button btnTikla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_text);

        txtAdSoyad=findViewById(R.id.txt_ad);
        btnTikla=findViewById(R.id.btn_tikla);

        //Butona toklandığında

        btnTikla.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtAdSoyad.setText("Salihcan Keskin");

        }

    });

    }
}