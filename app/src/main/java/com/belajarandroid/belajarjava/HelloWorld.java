package com.belajarandroid.belajarjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelloWorld extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);


        TextView textViewHelloWorld = (TextView) findViewById(R.id.HeloWorld);
        TextView textViewName = (TextView) findViewById(R.id.myName);
        TextView textViewAdress = (TextView) findViewById(R.id.myAddress);
        TextView textViewAge = (TextView) findViewById(R.id.myAge);


        textViewHelloWorld.setText("Hello World");
        textViewName.setText("Nama      : Muhammad Iqbal");
        textViewAdress.setText("Alamat      : Jl Kyai Dayung , Pamulang 2 Rt 001/009 Tangerang Selatan");
        textViewAge.setText("Umur      : 22");



    }
}