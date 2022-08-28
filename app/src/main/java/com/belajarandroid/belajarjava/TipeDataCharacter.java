package com.belajarandroid.belajarjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TipeDataCharacter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipe_data_character);

        TextView textViewTipeDataCharacter = (TextView) findViewById(R.id.tvTipeDataCharacter);


        char i = 'I';
        char q = 'Q';
        char b = 'B';
        char a = 'A';
        char l = 'L';

        System.out.println(i);
        System.out.println(q);
        System.out.println(b);
        System.out.println(a);
        System.out.println(l);

        textViewTipeDataCharacter.setText("Tipe Data Character =" + i+q+b+a+l);

    }
}