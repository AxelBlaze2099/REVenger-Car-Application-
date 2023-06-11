package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admindash extends AppCompatActivity {

    private CardView cv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindash);
        getSupportActionBar().hide();

        cv6 = (CardView) findViewById(R.id.cv6);
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });
    }

    private void nextActivity() {
        Intent intent = new Intent(this,adminlogin.class);
        startActivity(intent);
    }
}