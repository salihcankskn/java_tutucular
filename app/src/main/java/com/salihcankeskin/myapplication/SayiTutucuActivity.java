package com.salihcankeskin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SayiTutucuActivity extends AppCompatActivity {

    EditText edtSayiBir;
    EditText edtSayiİki;

    Button btnTopla,btnCikar,btnCarp,btnBol;

    TextView txtSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayi_tutucu);

        edtSayiBir=findViewById(R.id.edt_sayi_bir);
        edtSayiİki=findViewById(R.id.edt_sayi_iki);

        btnTopla=findViewById(R.id.btn_topla);
        btnCikar=findViewById(R.id.btn_cikar);
        btnCarp=findViewById(R.id.btn_carp);
        btnBol=findViewById(R.id.btn_bol);

        txtSonuc=findViewById(R.id.txt_sonuc);

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayiBirTutucu= Integer.parseInt(edtSayiBir.getText().toString());
                int sayiİkiTutucu=Integer.parseInt(edtSayiİki.getText().toString());

                int toplamTutucu= sayiBirTutucu+sayiİkiTutucu;
                txtSonuc.setText(String.valueOf(toplamTutucu));
            }
        });

        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayiBirTutucu= Integer.parseInt(edtSayiBir.getText().toString());
                int sayiİkiTutucu=Integer.parseInt(edtSayiİki.getText().toString());

                int cikarmaTutucu= sayiBirTutucu-sayiİkiTutucu;
                txtSonuc.setText(String.valueOf(cikarmaTutucu));
            }
        });

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayiBirTutucu= Integer.parseInt(edtSayiBir.getText().toString());
                int sayiİkiTutucu=Integer.parseInt(edtSayiİki.getText().toString());

                int carpmaTutucu= sayiBirTutucu*sayiİkiTutucu;
                txtSonuc.setText(String.valueOf(carpmaTutucu));
            }
        });

        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double sayiBirTutucu= Double.parseDouble(edtSayiBir.getText().toString());
                double sayiİkiTutucu=Double.parseDouble(edtSayiİki.getText().toString());

                double bolmeTutucu= sayiBirTutucu/sayiİkiTutucu;
                txtSonuc.setText(String.valueOf(bolmeTutucu));
            }
        });
















    }
}