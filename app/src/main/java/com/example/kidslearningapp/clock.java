package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class clock extends AppCompatActivity {

    ImageView img1,img2,img3,img4;
    TextView txt19;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        img1 = (ImageView)findViewById(R.id.imageView17);
        img2 = (ImageView)findViewById(R.id.imageView18);
        img3 = (ImageView)findViewById(R.id.imageView19);
        img4 = (ImageView)findViewById(R.id.imageView20);
        txt19= (TextView) findViewById(R.id.textView13);

        final MediaPlayer mp=MediaPlayer.create(this,R.raw.correct);
        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.wrong);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(clock.this, Time.class);
                startActivity(f2Intent);
            }
        });
    }
}
