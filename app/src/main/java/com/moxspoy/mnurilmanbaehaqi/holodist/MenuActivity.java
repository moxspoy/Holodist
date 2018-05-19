package com.moxspoy.mnurilmanbaehaqi.holodist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {
    private LinearLayout bKompetensi, bVideo, bMateri, bLatihan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        handleBos();
    }
}

void handleBos() {
    //Init with layout
    bKompetensi = findViewById(R.id.kompetensi);
    bVideo      = findViewById(R.id.video);
    bMateri     = findViewById(R.id.materi);
    bLatihan    = findViewById(R.id.latihan);

    //Action
    bKompetensi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), KompetensiActivity.class);
            startActivity(intent);
        }
    });

    bVideo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
            startActivity(intent);
        }
    });

    bMateri.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MateriActivity.class);
            startActivity(intent);
        }
    });

    bLatihan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), LatihanActivity.class);
            startActivity(intent);
        }
    });
}