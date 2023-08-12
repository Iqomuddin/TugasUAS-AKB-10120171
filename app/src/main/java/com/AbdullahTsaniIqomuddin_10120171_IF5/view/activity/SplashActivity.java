package com.AbdullahTsaniIqomuddin_10120171_IF5.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.AbdullahTsaniIqomuddin_10120171_IF5.R;


public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L);
    }
}

/**
 * NAMA    : Abdullah Tsani Iqomuddin
 * NIM     : 10120171
 * Kelas   : IF-5
 * MataKuliah  : Aplikasi Komputasi Bergerak
 * Tugas Pengganti UAS Aplikasi Komputasi Bergerak
 */