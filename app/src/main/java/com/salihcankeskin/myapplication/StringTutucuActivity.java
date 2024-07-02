package com.salihcankeskin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StringTutucuActivity extends AppCompatActivity {

    TextView txtAd;
    Button btnAd;
    EditText edtAd;
    EditText edtSoyad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_tutucu);

        txtAd=findViewById(R.id.txt_ad);
        btnAd=findViewById(R.id.btn_ad);
        edtAd=findViewById(R.id.edt_ad);
        edtSoyad=findViewById(R.id.edt_soyad);

        btnAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //string tutucu
                String adTutucu=edtAd.getText().toString();
                String soyAdTutucu=edtSoyad.getText().toString();
                txtAd.setText(adTutucu+" "+soyAdTutucu);
            }
        });
    }
}