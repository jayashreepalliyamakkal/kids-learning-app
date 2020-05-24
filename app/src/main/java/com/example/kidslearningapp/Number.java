package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Number extends AppCompatActivity {

    TextView txt6;
    TextView txt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        txt6 = (TextView)findViewById(R.id.textView1);
        txt7 = (TextView)findViewById(R.id.textView2);
         txt6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent txt6Intent = new Intent(Number.this, Comparison.class);
                 startActivity(txt6Intent);
             }
         });
        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt7Intent = new Intent(Number.this, Object_Counting.class);
                startActivity(txt7Intent);
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton9);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(Number.this, MainActivity.class);
                startActivity(f2Intent);
            }
        });
    }
}
