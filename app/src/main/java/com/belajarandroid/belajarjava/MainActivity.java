package com.belajarandroid.belajarjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.belajarandroid.belajarjava.databinding.ActivityMainBinding;
import com.belajarandroid.belajarjava.databinding.ActivityMethodBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.tvJavaDasar.setText("Belajar Java Dasar");
        binding.btnHeloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HelloWorldActivity.class);
                startActivity(intent);
            }
        });

    }

}