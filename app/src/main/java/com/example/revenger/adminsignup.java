package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class adminsignup extends AppCompatActivity {

    private Button btn1;
private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminsignup);
        getSupportActionBar().hide();

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });

        tv3=(TextView) findViewById(R.id.tv3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previousActivity();
            }
        });

    }

    private void previousActivity() {
        Intent intent = new Intent(this,adminlogin.class);
        startActivity(intent);
    }

    private void nextActivity() {
        Intent intent = new Intent(this,adminlogin.class);
        startActivity(intent);
    }
}