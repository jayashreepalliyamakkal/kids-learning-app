package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Next extends AppCompatActivity {

    TextView txt16;
    ImageView img12,img13,img14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        txt16 = (TextView)findViewById(R.id.textView9);
        img12 = (ImageView) findViewById(R.id.imageView12);
        img13 = (ImageView) findViewById(R.id.imageView13);
        img14 = (ImageView) findViewById(R.id.imageView14);

        final MediaPlayer mp=MediaPlayer.create(this,R.raw.correct);
        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.wrong);

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton8);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(Next.this, Shapes.class);
                startActivity(f2Intent);
            }
        });


    }
}

