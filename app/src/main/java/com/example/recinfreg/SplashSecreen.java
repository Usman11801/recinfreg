package com.example.recinfreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashSecreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_secreen);
        Thread th= new Thread(){
            @Override
            public void run() {
                try{
                    sleep(4000);
                }catch(Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent obj = new Intent(SplashSecreen.this, RegisterActivity.class );
                    startActivity(obj);
                }
            }
        };
        th.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}