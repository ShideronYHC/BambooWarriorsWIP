package com.example.bamboowarriorswip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

public class loginscreen_loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen_loading);

                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run() {
                        Intent loggedin_Screen = new Intent(loginscreen_loading.this, MainActivity.class);
                        startActivity(loggedin_Screen);
                    }
                }, 3000);



    }
}