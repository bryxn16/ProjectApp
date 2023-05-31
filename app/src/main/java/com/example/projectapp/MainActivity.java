package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     Button btnNextPage;

     private Button btnWlaugh

     private Button btnWeave

     private Button btnYeahboy

     private Button btnTrombone

     private Button btnMscream

     private Button btnWhip

     private Button btnBruh

     private Button btnWoah

     private Button btnMygod

     private Button btnOhhh

     private Button btnJeff

     private Button btnLscream


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWlaugh = findViewById(R.id.btn_wlaugh);
        btnWeave = findViewById(R.id.btn_weave);
        btnYeahboy = findViewById(R.id.btn_yeahboy);
        btnTrombone = findViewById(R.id.btn_trombone);
        btnMscream = findViewById(R.id.btn_mscream);
        btnWhip = findViewById(R.id.btn_whip);
        btnBruh = findViewById(R.id.btn_bruh);
        btnWoah = findViewById(R.id.btn_woah);
        btnMygod = findViewById(R.id.btn_mygod);
        btnOhhh = findViewById(R.id.btn_ohhh);
        btnJeff = findViewById(R.id.btn_jeff);
        btnLscream = findViewById(R.id.btn_lscream);

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {

                 playWlaugh();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playWeave();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playYeahboy();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playTrombone();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playMscream();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playWhip();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playBruh();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playWoah();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playMygod();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playOhhh();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playJeff();
            }
        });

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playLscream();
            }
        });

    }

    private void playWlaugh() {
         MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_witch);
         mp.start();
         mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
             @Override
             public void onCompletion(MediaPlayer mediaPlayer) {
                 mp.stop();
                 mp.release();
                 mp = null;
             }
         });
    }

    private void playWeave() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_weave);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playYeahboy() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_yeahboy);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
    private void playTrombone() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_trombone);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }



}