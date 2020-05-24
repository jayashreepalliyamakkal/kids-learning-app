package com.example.kidslearningapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar tlbr;

    TextView txt1,txt2,txt3,txt4,txt5;

    ImageView img,img2,img26,img27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView)findViewById(R.id.textView2);
        txt2 = (TextView)findViewById(R.id.textView21);
        txt3 = (TextView)findViewById(R.id.textView22);
        img = (ImageView) findViewById(R.id.imageView);
        img2 = (ImageView) findViewById(R.id.imageView2);
        img26 = (ImageView) findViewById(R.id.imageView3);
        img27 = (ImageView) findViewById(R.id.imageView4);
        txt4 = (TextView)findViewById(R.id.textView);
        txt5 = (TextView)findViewById(R.id.textView7);

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt2Intent = new Intent(MainActivity.this, Number.class);
                startActivity(txt2Intent);
            }
        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt3Intent= new Intent(MainActivity.this, Shapes.class);
                startActivity(txt3Intent);
            }
        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt4Intent = new Intent(MainActivity.this, Time.class);
                startActivity(txt4Intent);
            }
        });

        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt5Intent= new Intent(MainActivity.this, Measurements.class);
                startActivity(txt5Intent);
            }
        });


        tlbr = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tlbr);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Toast.makeText(this,"Item home selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.about:
                Toast.makeText(this,"Item about selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.contact:
                Toast.makeText(this,"Item contact selected",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }


}
