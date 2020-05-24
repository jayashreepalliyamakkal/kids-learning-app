package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Comparison extends AppCompatActivity {

    TextView txt8;
    TextView  txt9;
    TextView txt10;
    ImageView imp1;
    ImageView imp2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);
        imp1 = (ImageView)findViewById(R.id.imageView1);
        imp2 = (ImageView)findViewById(R.id.imageView2);
        txt8 = (TextView)findViewById(R.id.textView4);
        txt9 = (TextView)findViewById(R.id.textView2);
        txt10 = (TextView)findViewById(R.id.textView20);


        final MediaPlayer mp=MediaPlayer.create(this,R.raw.big);
        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.small);
        txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton6);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(Comparison.this, Number.class);
                startActivity(f2Intent);
            }
        });




    }
}
