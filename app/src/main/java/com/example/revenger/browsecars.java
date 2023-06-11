package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class browsecars extends AppCompatActivity {


    private RelativeLayout rl1;
    private RelativeLayout rl2;
    private RelativeLayout rl3;
    private RelativeLayout rl4;
    private RelativeLayout rl5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browsecars);
        getSupportActionBar().hide();

        rl1 = (RelativeLayout) findViewById(R.id.rl1);
        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });
        rl2 = (RelativeLayout) findViewById(R.id.rl2);
        rl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previousActivity();
            }
        });

        rl3 = (RelativeLayout) findViewById(R.id.rl3);
        rl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heyyActivity();
            }
        });
        rl4 = (RelativeLayout) findViewById(R.id.rl4);
        rl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello();
            }
        });

        rl5 = (RelativeLayout) findViewById(R.id.rl5);
        rl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yoo();
            }
        });


    }

    private void yoo() {
        Intent intent = new Intent(this, muv.class);
        startActivity(intent);
    }

    private void hello() {
        Intent intent = new Intent(this, compsuv.class);
        startActivity(intent);
    }

    private void heyyActivity() {
        Intent intent = new Intent(this, suv.class);
        startActivity(intent);
    }

    private void previousActivity() {
        Intent intent = new Intent(this, hatchback.class);
        startActivity(intent);
    }

    private void nextActivity() {
        Intent intent = new Intent(this, sedan.class);
        startActivity(intent);
    }
}


