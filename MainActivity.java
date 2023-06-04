package com.example.rajgarden;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton soup,starter,chinese,pb;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soup=findViewById(R.id.soup);
        soup.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,Soup.class);
            startActivity(intent);
        });
        starter= findViewById(R.id.starter);
        starter.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,Starter.class);
            startActivity(intent);
        });
        chinese=findViewById(R.id.chinese);
        chinese.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,Chainese.class);
            startActivity(intent);
        });
        pb=findViewById(R.id.pb);
        pb.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,Pav_bhaji.class);
            startActivity(intent);
        });

    }
}