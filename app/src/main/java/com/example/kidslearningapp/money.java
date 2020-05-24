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

public class money extends AppCompatActivity {

    TextView txt26;
    ImageView img15,img16,img17,img18,img19,img20,img21,img22,img23;
    Button bt7,bt8,bt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);

        txt26 = (TextView)findViewById(R.id.textView18);
        img15 =(ImageView)findViewById(R.id.imageView21);
        img16 =(ImageView)findViewById(R.id.imageView22);
        img17 =(ImageView)findViewById(R.id.imageView23);
        img18 =(ImageView)findViewById(R.id.imageView24);
        img19 =(ImageView)findViewById(R.id.imageView25);
        img20 =(ImageView)findViewById(R.id.imageView26);
        img21 =(ImageView)findViewById(R.id.imageView27);
        img22 =(ImageView)findViewById(R.id.imageView28);
        img23 =(ImageView)findViewById(R.id.imageView29);
        bt7 = (Button)findViewById(R.id.button6);
        bt8 = (Button)findViewById(R.id.button8);
        bt9 = (Button)findViewById(R.id.button9);

        final MediaPlayer mp=MediaPlayer.create(this,R.raw.correct);
        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.wrong);

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton3);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(money.this, Measurements.class);
                startActivity(f2Intent);
            }
        });






    }
}
