package com.example.padiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wifi extends AppCompatActivity {

    private Button aa;
    private Button home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);


        aa = findViewById(R.id.aa);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wifi.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wifi.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });
    }
}
