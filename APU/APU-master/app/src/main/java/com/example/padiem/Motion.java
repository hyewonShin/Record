package com.example.padiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Motion extends AppCompatActivity {

    private Button aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion);


        aa = findViewById(R.id.aa);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Motion.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });




    }
}