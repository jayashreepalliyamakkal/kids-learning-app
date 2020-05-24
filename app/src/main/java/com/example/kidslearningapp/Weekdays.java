package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Weekdays extends AppCompatActivity {

    TextView txt20,txt21;
    Button bt4,bt5,bt6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekdays);

        txt20 = (TextView)findViewById(R.id.textView14);
        txt21 = (TextView)findViewById(R.id.textView15);
        bt4 = (Button) findViewById(R.id.button);
        bt5 = (Button) findViewById(R.id.button4);
        bt6 = (Button) findViewById(R.id.button5);

        final MediaPlayer mp=MediaPlayer.create(this,R.raw.correct);
        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.wrong);

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(Weekdays.this, Time.class);
                startActivity(f2Intent);
            }
        });

    }
}
