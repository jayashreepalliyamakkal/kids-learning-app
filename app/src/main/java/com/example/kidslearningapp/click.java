package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class click extends AppCompatActivity {

    TextView txt15;
    ImageView img8;
    ImageView img9;
    ImageView img10;
    ImageView img11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);

        txt15 =(TextView)findViewById(R.id.textView6);
        img8 = (ImageView)findViewById(R.id.imageView8);
        img9 = (ImageView)findViewById(R.id.imageView9);
        img10 = (ImageView)findViewById(R.id.imageView10);
        img11 = (ImageView)findViewById(R.id.imageView11);

        final MediaPlayer mp=MediaPlayer.create(this,R.raw.wrong);
        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.wrong);
        final MediaPlayer mp2=MediaPlayer.create(this,R.raw.correct);

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton5);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(click.this, Shapes.class);
                startActivity(f2Intent);
            }
        });
    }
}
