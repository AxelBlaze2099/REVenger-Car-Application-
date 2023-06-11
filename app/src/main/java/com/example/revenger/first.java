package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class first extends AppCompatActivity {

private TextView tV3,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpg);
        getSupportActionBar().hide();

        tV3=(TextView) findViewById(R.id.tV3);
        tV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previousActivity();
            }
        });

        tv2=(TextView) findViewById(R.id.tv2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heyy();
            }
        });
}

    private void heyy() {
        Intent intent = new Intent(this,adminlogin.class);
        startActivity(intent);
    }


    private void previousActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }



}