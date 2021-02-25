package com.example.padiem;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class PopupActivity extends Activity {

    TextView txtText;

    private Button center_call;
    private Button care_call;
    private Button police_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //타이틀바 없애기
                requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_popup);

        center_call = findViewById(R.id.center_call);
        center_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01011112222"));
                //Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:12345"));
                startActivity(intent);

            }
        });

        care_call = findViewById(R.id.care_call);
        care_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01012345678"));
                //Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:12345"));
                startActivity(intent);

            }
        });

        police_call = findViewById(R.id.police_call);
        police_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:112"));
                //Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:12345"));
                startActivity(intent);

            }
        });
    }

    //확인 버튼 클릭
    public void mOnClose(View v){
        //액티비티(팝업) 닫기
        finish();
    }

}

