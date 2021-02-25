package com.example.padiem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;



public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private String url = "http://192.168.0.51:81/stream";

    private DrawerLayout drawerLayout;
    private View drawerView;

    private Button motion_btn;
    private Button voice_btn;
    private Button member_btn;
    private Button wifi_btn;
    private Button recod_btn;
    private Button cust_btn;

    private Button back_btn;

    ViewFlipper v_fllipper;


    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 네이게이션 드로어 버튼 화면전환
        motion_btn = findViewById(R.id.motion_btn);
        motion_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Motion.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        voice_btn = findViewById(R.id.voice_btn);
        voice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Voice.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        member_btn = findViewById(R.id.member_btn);
        member_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Member.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        wifi_btn = findViewById(R.id.wifi_btn);
        wifi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Wifi.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        recod_btn = findViewById(R.id.recod_btn);
        recod_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Recoder.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        cust_btn = findViewById(R.id.cust_btn);
        cust_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Customer.class);
                startActivity(intent);  //액티비티 이동
            }
        });



        // 네비게이션 드로어
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);

        Button btn_open = (Button)findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView );
            }
        });

        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });


        //웹뷰
        webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClientClass());


        int images[] = {
                R.drawable.q,
                R.drawable.qq,

             };

        v_fllipper = findViewById(R.id.image_slide);

        for(int image : images) {
            fllipperImages(image);
        }



    }  //onCreate end --



        //웹뷰
    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    // 이미지 슬라이더 구현 메서드
    public void fllipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_fllipper.addView(imageView);      // 이미지 추가
        v_fllipper.setFlipInterval(2000);       // 자동 이미지 슬라이드 딜레이시간(1000 당 1초)
        v_fllipper.setAutoStart(true);          // 자동 시작 유무 설정

        // animation
        v_fllipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_fllipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }


    // 팝업 버튼
    public void mOnPopupClick(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, PopupActivity.class);
        intent.putExtra("data", "Test Popup");
        startActivityForResult(intent, 1);
    }


}



