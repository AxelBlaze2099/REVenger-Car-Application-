package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class muv extends AppCompatActivity {
    private RelativeLayout rr1;
    private RelativeLayout rr2;
    private RelativeLayout rr3;
    private RelativeLayout rr4;
    private RelativeLayout rr5;
    private RelativeLayout rr6;
    private RelativeLayout rr7;
    private RelativeLayout rr8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muv);
        rr1=(RelativeLayout) findViewById(R.id.rr1);
        rr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hh();
            }
        });
        rr2=(RelativeLayout) findViewById(R.id.rr2);
        rr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhh();
            }
        });
        rr3=(RelativeLayout) findViewById(R.id.rr3);
        rr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h();
            }
        });
        rr4=(RelativeLayout) findViewById(R.id.rr4);
        rr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhhh();
            }
        });
        rr5=(RelativeLayout) findViewById(R.id.rr5);
        rr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhhhh();
            }
        });
        rr6=(RelativeLayout) findViewById(R.id.rr6);
        rr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhhhhh();
            }
        });
        rr7=(RelativeLayout) findViewById(R.id.rr7);
        rr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hell();
            }
        });
        rr8=(RelativeLayout) findViewById(R.id.rr8);
        rr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello();
            }
        });
    }

    private void hello() {
        Intent intent = new Intent(this,ertigaMUV.class);
        startActivity(intent);
    }

    private void hell() {
        Intent intent = new Intent(this,vellfireMUV.class);
        startActivity(intent);
    }

    private void hhhhhh() {
        Intent intent = new Intent(this,triberMUV.class);
        startActivity(intent);
    }

    private void hhhhh() {
        Intent intent = new Intent(this,carensMUV.class);
        startActivity(intent);
    }

    private void hhhh() {
        Intent intent = new Intent(this,marazzoMUV.class);
        startActivity(intent);
    }

    private void h() {
        Intent intent = new Intent(this,carnivalMUV.class);
        startActivity(intent);
    }

    private void hhh() {
        Intent intent = new Intent(this,innovaMUV.class);
        startActivity(intent);
    }

    private void hh() {

        Intent intent = new Intent(this,xl6MUV.class);
        startActivity(intent);
    }
}