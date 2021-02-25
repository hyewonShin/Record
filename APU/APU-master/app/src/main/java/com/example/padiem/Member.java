package com.example.padiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Member extends AppCompatActivity {

    private Button aa;
    private Button home;
    private Button recodcamera;
    private Button motionvoice;
    private Button care;
    private Button light;
    private Button langua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        aa = findViewById(R.id.aa);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Member.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Member.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        recodcamera = findViewById(R.id.recodcamera);
        recodcamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Member.this,member_recoder.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        motionvoice = findViewById(R.id.motionvoice);
        motionvoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Member.this,member_motion.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        care = findViewById(R.id.care);
        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Member.this,member_care.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        light = findViewById(R.id.light);
        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Member.this,member_light.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        langua = findViewById(R.id.langua);
        langua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Member.this,member_langua.class);
                startActivity(intent);  //액티비티 이동
            }
        });
    }
}