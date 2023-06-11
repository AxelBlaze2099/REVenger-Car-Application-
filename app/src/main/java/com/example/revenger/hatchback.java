package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class hatchback extends AppCompatActivity {

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
        setContentView(R.layout.activity_hatchback);

        rl1 = (RelativeLayout) findViewById(R.id.rl1);
        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello();

            }
        });

        rl2 = (RelativeLayout) findViewById(R.id.rl2);
        rl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heyy();
            }
        });

        rl3 = (RelativeLayout) findViewById(R.id.rl3);
        rl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hell();
            }
        });

        rl4 = (RelativeLayout) findViewById(R.id.rl4);
        rl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloo();
            }
        });
        rl5 = (RelativeLayout) findViewById(R.id.rl5);
        rl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helll();
            }
        });
        rl6 = (RelativeLayout) findViewById(R.id.rl6);
        rl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hh();
            }
        });

        rl7 = (RelativeLayout) findViewById(R.id.rl7);
        rl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hhhh();
            }
        });

        rl8 = (RelativeLayout) findViewById(R.id.rl8);
        rl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hee();
            }
        });
    }

    private void hee() {
        Intent intent = new Intent(this,poloHATCH.class);
        startActivity(intent);
    }

    private void hhhh() {
        Intent intent = new Intent(this, altrozHATCH.class);
        startActivity(intent);
    }

    private void hh() {
        Intent intent = new Intent(this, spressoHATCH.class);
        startActivity(intent);
    }

    private void helll() {
       Intent intent = new Intent(this, celerioHATCH.class);
        startActivity(intent);

    }

    private void helloo() {
        Intent intent = new Intent(this, citroenHATCH.class);
        startActivity(intent);
    }

    private void hell() {
        Intent intent = new Intent(this, swiftHATCH.class);
        startActivity(intent);

    }

    private void heyy() {
        Intent intent = new Intent(this, i20HATCH.class);
        startActivity(intent);
    }

    private void hello() {
        Intent intent = new Intent(this, balenoHATCH.class);
        startActivity(intent);
    }
}