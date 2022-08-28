package com.belajarandroid.belajarjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TipeDataBoolean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipe_data_boolean);

        TextView textViewTrue = (TextView) findViewById(R.id.textViewTrue);
        TextView textViewFalse = (TextView) findViewById(R.id.textViewFalse);


        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);


        textViewTrue.setText("True =" + benar);
        textViewFalse.setText("False =" + salah);



    }
}