package com.example.padiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cus_version extends AppCompatActivity {


    private Button aa;
    private Button versionup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cus_version);

        aa = findViewById(R.id.aa);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cus_version.this,Customer.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        versionup = findViewById(R.id.versionup);
        versionup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cus_version.this,Cus_versionup2.class);
                startActivity(intent);  //액티비티 이동
            }
        });



    }
}