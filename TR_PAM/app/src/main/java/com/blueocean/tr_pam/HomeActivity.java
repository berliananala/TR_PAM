package com.blueocean.tr_pam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class HomeActivity extends AppCompatActivity {

   LinearLayout btn_ticket_pisa, btn_ticket_torri, btn_ticket_pagoda, btn_ticket_sphinx, linearLayout3;
   ImageView ContemporaryArt, DigitalArt, SketchArt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_ticket_pisa = (LinearLayout) findViewById(R.id.btn_ticket_pisa);
        btn_ticket_pagoda = (LinearLayout) findViewById(R.id.btn_ticket_pagoda);
        btn_ticket_sphinx = (LinearLayout) findViewById(R.id.btn_ticket_sphinx);
        btn_ticket_torri = (LinearLayout) findViewById(R.id.btn_ticket_torri);
        ContemporaryArt = (ImageView) findViewById(R.id.ContemporaryArt);
        DigitalArt = (ImageView) findViewById(R.id.DigitalArt);
        SketchArt = (ImageView) findViewById(R.id.SketchArt);
    }

}
