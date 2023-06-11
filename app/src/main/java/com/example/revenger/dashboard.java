package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {
 private CardView cv6;
 private CardView cv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();

         cv6 = (CardView) findViewById(R.id.cv6);
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previousActivity();
            }
        });

        cv1=(CardView) findViewById(R.id.cv1);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });


    }

    private void nextActivity() {
        Intent intent = new Intent(this,browsecars.class);
        startActivity(intent);
    }

    private void previousActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}