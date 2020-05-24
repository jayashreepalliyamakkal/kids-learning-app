package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Time extends AppCompatActivity {

    TextView txt17,txt18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        txt17 =(TextView)findViewById(R.id.textView8);
        txt18 =(TextView)findViewById(R.id.textView10);

        txt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt17Intent = new Intent(Time.this, clock.class);
                startActivity(txt17Intent);
            }
        });
        txt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt18Intent = new Intent(Time.this, Weekdays.class);
                startActivity(txt18Intent);
            }
        });



        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton11);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(Time.this, MainActivity.class);
                startActivity(f2Intent);
            }
        });
    }
}
