package com.example.padiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Customer extends AppCompatActivity {

    private Button aa;
    private Button home;
    private Button gonggi_btn;
    private Button request_btn;
    private Button version_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);


        aa = findViewById(R.id.aa);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        gonggi_btn = findViewById(R.id.gonggi_btn);
        gonggi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this,Cus_gonggi.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        request_btn = findViewById(R.id.request_btn);
        request_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this,Cus_request.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        version_btn = findViewById(R.id.version_btn);
        version_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this,Cus_version.class);
                startActivity(intent);  //액티비티 이동
            }
        });

    }
}