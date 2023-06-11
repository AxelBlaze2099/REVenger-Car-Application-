package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class compsuv extends AppCompatActivity {
    private RelativeLayout r1;
    private RelativeLayout r2;
    private RelativeLayout r3;
    private RelativeLayout r4;
    private RelativeLayout r5;
    private RelativeLayout r6;
    private RelativeLayout r7;
    private RelativeLayout r8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compsuv);
        r1=(RelativeLayout) findViewById(R.id.r1);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hey();
            }
        });
        r2=(RelativeLayout) findViewById(R.id.r2);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heyy();
            }
        });
        r3=(RelativeLayout) findViewById(R.id.r3);
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhh();
            }
        });
        r4=(RelativeLayout) findViewById(R.id.r4);
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hh();
            }
        });
        r5=(RelativeLayout) findViewById(R.id.r5);
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                he();
            }
        });
        r6=(RelativeLayout) findViewById(R.id.r6);
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhhh();
            }
        });
        r7=(RelativeLayout) findViewById(R.id.r7);
        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhhhh();
            }
        });
        r8=(RelativeLayout) findViewById(R.id.r8);
        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hell();
            }
        });
    }

    private void hell() {
        Intent intent = new Intent(this,venueCSUV.class);
        startActivity(intent);
    }

    private void hhhhh() {
        Intent intent = new Intent(this,cruiserCSUV.class);
        startActivity(intent);
    }

    private void hhhh() {
        Intent intent = new Intent(this,punchCSUV.class);
        startActivity(intent);
    }

    private void he() {
        Intent intent = new Intent(this,brezzaCSUV.class);
        startActivity(intent);
    }

    private void hh() {
        Intent intent = new Intent(this,sonetCSUV.class);
        startActivity(intent);
    }

    private void hhh() {
        Intent intent = new Intent(this,magniteCSUV.class);
        startActivity(intent);
    }

    private void heyy() {
        Intent intent = new Intent(this,harrierCSUV.class);
        startActivity(intent);
    }

    private void hey() {

        Intent intent = new Intent(this,xuv300CSUV.class);
        startActivity(intent);
    }
}