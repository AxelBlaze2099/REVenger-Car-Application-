package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;


public class sedan extends AppCompatActivity {

    private RelativeLayout rl1;
    private RelativeLayout rl2;
    private RelativeLayout rl3;
    private RelativeLayout rl4;
    private RelativeLayout rl5;
    private RelativeLayout rl6;
    private RelativeLayout rl7;
    private RelativeLayout rl8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedan);
        getSupportActionBar().hide();

        rl1= (RelativeLayout) findViewById(R.id.rl1);
        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });

        rl2= (RelativeLayout) findViewById(R.id.rl2);
        rl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello();
            }
        });

        rl3= (RelativeLayout) findViewById(R.id.rl3);
        rl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heyy();
            }
        });

        rl4=(RelativeLayout) findViewById(R.id.rl4);
        rl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hell();
            }
        });
        rl5=(RelativeLayout) findViewById((R.id.rl5));
        rl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hel();
            }
        });
        rl6=(RelativeLayout) findViewById((R.id.rl6));
        rl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                he();
            }
        });
        rl7=(RelativeLayout) findViewById((R.id.rl7));
        rl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhh();
            }
        });
        rl8=(RelativeLayout) findViewById((R.id.rl8));
        rl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hh();
            }
        });
    }

    private void hh() {
        Intent intent = new Intent(this,camrySEDAN.class);
        startActivity(intent);
    }

    private void hhh() {
        Intent intent = new Intent(this,jaguarSEDAN.class);
        startActivity(intent);
    }

    private void he() {
        Intent intent = new Intent(this,mercedesSEDAN.class);
        startActivity(intent);
    }

    private void hel() {
        Intent intent = new Intent(this,volvoSEDAN.class);
        startActivity(intent);
    }

    private void hell() {
        Intent intent = new Intent(this,audiSEDAN.class);
        startActivity(intent);
    }

    private void heyy() {
        Intent intent = new Intent(this,octaviaSEDAN.class);
        startActivity(intent);

    }

    private void hello() {
        Intent intent = new Intent(this,vernaSEDAN.class);
        startActivity(intent);
    }

    private void nextActivity() {
        Intent intent = new Intent(this,hondacity.class);
        startActivity(intent);
    }
}