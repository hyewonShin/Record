package com.example.padiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class member_motion extends AppCompatActivity {

    private Button a;
    private Button time_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_motion);

        a = findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(member_motion.this,Member.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        time_btn = findViewById(R.id.time_btn);
        time_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(member_motion.this,member_motion_time.class);
                startActivity(intent);  //액티비티 이동
            }
        });


    }
}