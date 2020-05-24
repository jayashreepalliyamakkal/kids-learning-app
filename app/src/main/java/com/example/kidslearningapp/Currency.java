package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Currency extends AppCompatActivity {

    ImageView img24,img25;
    TextView txt24,txt25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        img24 = (ImageView)findViewById(R.id.imageView15);
        img25 = (ImageView)findViewById(R.id.imageView16);
        txt24 = (TextView)findViewById(R.id.textView16);
        txt25 = (TextView)findViewById(R.id.textView17);

        final MediaPlayer mp2=MediaPlayer.create(this,R.raw.head);
        final MediaPlayer mp3=MediaPlayer.create(this,R.raw.tail);
        txt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });
        txt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton4);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(Currency.this, Measurements.class);
                startActivity(f2Intent);
            }
        });

    }
}
