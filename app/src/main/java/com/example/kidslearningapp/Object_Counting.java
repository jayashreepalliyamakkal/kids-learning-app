package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Object_Counting extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    TextView txt11;
    TextView txt12;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_counting);

        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        txt11=(TextView)findViewById(R.id.textView19);
        txt12=(TextView)findViewById(R.id.textView5);
        img3=(ImageView)findViewById(R.id.imageView3);
        img4=(ImageView)findViewById(R.id.imageView4);
        img5=(ImageView)findViewById(R.id.imageView5);
        img6=(ImageView)findViewById(R.id.imageView6);
        img7=(ImageView)findViewById(R.id.imageView7);

        final MediaPlayer mp=MediaPlayer.create(this,R.raw.wrong);
        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.wrong);
        final MediaPlayer mp2=MediaPlayer.create(this,R.raw.correct);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton12);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(Object_Counting.this, Number.class);
                startActivity(f2Intent);
            }
        });

    }
}
