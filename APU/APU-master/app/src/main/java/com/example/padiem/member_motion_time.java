package com.example.padiem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class member_motion_time extends AppCompatActivity {

    private Button a;

    //timepicker
    TextView mTimeTextview;
    Button mpickTimeButton;
    Context mcontext = this;

    TextView mTimeTextview2;
    Button mpickTimeButton2;
    Context mcontext2 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_motion_time);

        a = findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(member_motion_time.this,member_motion.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        //timepicker
        mTimeTextview = (TextView) findViewById(R.id.start_txt);

        Calendar calendar = Calendar.getInstance();

        final int hour = calendar.get(Calendar.HOUR_OF_DAY);
        final int minute = calendar.get(Calendar.MINUTE);


        mpickTimeButton = (Button) findViewById(R.id.start_btn);
        mpickTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(mcontext, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        mTimeTextview.setText(hourOfDay + ":" + minute);
                    }
                },hour,minute,android.text.format.DateFormat.is24HourFormat(mcontext));
                timePickerDialog.show();

            }
        });

        mTimeTextview2 = (TextView) findViewById(R.id.stop_txt);

        mpickTimeButton2 = (Button) findViewById(R.id.stop_btn);
        mpickTimeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(mcontext2, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        mTimeTextview2.setText(hourOfDay + ":" + minute);
                    }
                },hour,minute,android.text.format.DateFormat.is24HourFormat(mcontext2));
                timePickerDialog.show();

            }
        });
    }
}