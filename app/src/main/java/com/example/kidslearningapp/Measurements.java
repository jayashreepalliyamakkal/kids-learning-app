package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Measurements extends AppCompatActivity {

    TextView txt22,txt23;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measurements);

        txt22 =(TextView)findViewById(R.id.textView12);
        txt23 =(TextView)findViewById(R.id.textView11);

        txt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt22Intent = new Intent(Measurements.this, Currency.class);
                startActivity(txt22Intent);
            }
        });
        txt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt23Intent = new Intent(Measurements.this, money.class);
                startActivity(txt23Intent);
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton7);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(Measurements.this, MainActivity.class);
                startActivity(f2Intent);
            }
        });

    }
}
