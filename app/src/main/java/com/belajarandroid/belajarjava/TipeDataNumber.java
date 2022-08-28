package com.belajarandroid.belajarjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TipeDataNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipe_data_number);


        //INTEGER NUMBER (BILANGAN BULAT)
        byte iniByte = 100;
        short iniShorty = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 100000000000000000L;

        //FLOATING POINT NUMBER (BILANGAN PECAHAN)
        float iniFloat = 10.90F;
        double iniDouble = 10.10;

        //LITERALS
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0B01010101;

        //UNDERSCORE (PENANDA ANGKA)
        int  amount = 100_000_000;

    }
}