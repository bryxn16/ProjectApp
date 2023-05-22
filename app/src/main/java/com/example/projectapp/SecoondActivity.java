package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecoondActivity extends AppCompatActivity {

    TextView tvToptext;
    TextView tvBottomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secoond);

        tvToptext = findViewById(R.id.tv_top);
        tvBottomText = findViewById(R.id.tv_bottom);

        Intent intent = getIntent();

        String receive1 = intent.getStringExtra("data1");
        String receive2 = intent.getStringExtra("data2");

        tvTopText.setText(receive1);
        tvBottomText.setText(receive2);
    }
}