package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Shapes extends AppCompatActivity {

    TextView txt13;
    TextView txt14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        txt13 = (TextView)findViewById(R.id.textView3);
        txt14 = (TextView)findViewById(R.id.textView4);

        txt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt13Intent = new Intent(Shapes.this, click.class);
                startActivity(txt13Intent);
            }
        });

        txt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txt14Intent = new Intent(Shapes.this, Next.class);
                startActivity(txt14Intent);
            }
        });


        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton10);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f2Intent = new Intent(Shapes.this, MainActivity.class);
                startActivity(f2Intent);
            }
        });
    }
}
