package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class suv extends AppCompatActivity {
    private RelativeLayout rl01;
    private RelativeLayout rl02;
    private RelativeLayout rl03;
    private RelativeLayout rl04;
    private RelativeLayout rl05;
    private RelativeLayout rl06;
    private RelativeLayout rl07;
    private RelativeLayout rl08;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suv);
        getSupportActionBar().hide();
        rl01=(RelativeLayout) findViewById(R.id.rl01);
        rl01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heyy();
            }
        });
        rl02=(RelativeLayout) findViewById(R.id.rl02);
        rl02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello();
            }
        });
        rl03=(RelativeLayout) findViewById(R.id.rl03);
        rl03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hey();
            }
        });

        rl04=(RelativeLayout) findViewById(R.id.rl04);
        rl04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hee();
            }
        });

        rl05=(RelativeLayout) findViewById(R.id.rl05);
        rl05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heyyy();
            }
        });
        rl06=(RelativeLayout) findViewById(R.id.rl06);
        rl06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hell();
            }
        });
        rl07=(RelativeLayout) findViewById(R.id.rl07);
        rl07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloo();
            }
        });
        rl08=(RelativeLayout) findViewById(R.id.rl08);
        rl08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhh();
            }
        });
    }

    private void hhh() {
        Intent intent= new Intent(this,seltosSUV.class);
        startActivity(intent);
    }

    private void helloo() {
        Intent intent= new Intent(this,velarSUV.class);
        startActivity(intent);
    }

    private void hell() {
        Intent intent= new Intent(this,jeepSUV.class);
        startActivity(intent);
    }

    private void heyyy() {
        Intent intent= new Intent(this,fortunerSUV.class);
        startActivity(intent);
    }

    private void hee() {
        Intent intent= new Intent(this,alcazarSUV.class);
        startActivity(intent);
    }

    private void hey() {
        Intent intent= new Intent(this,scorpioSUV.class);
        startActivity(intent);

    }

    private void hello() {
        Intent intent= new Intent(this,xuv700SUV.class);
        startActivity(intent);

    }

    private void heyy() {
        Intent intent= new Intent(this,safariSUV.class);
        startActivity(intent);
    }
}