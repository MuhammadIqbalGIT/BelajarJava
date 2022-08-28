package com.belajarandroid.belajarjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TipeDataString extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipe_data_string);

        TextView textViewFirstName = (TextView) findViewById(R.id.tvFirstName);
        TextView textViewLastName = (TextView) findViewById(R.id.tvFirstLastName);
        TextView textViewFullName = (TextView) findViewById(R.id.tvFullName);

        String firstName = "Muhammad";
        String lastName = "Iqbal";
        String fullName = firstName + " " + lastName;

        System.out.println(firstName + " ");
        System.out.println(lastName);
        System.out.println(fullName);

        textViewFirstName.setText("Nama Depan = " + firstName);
        textViewLastName.setText("Nama Belakang = " + lastName);
        textViewFullName.setText("Nama Full = " + fullName);



    }
}