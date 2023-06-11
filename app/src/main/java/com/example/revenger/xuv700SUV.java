package com.example.revenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class xuv700SUV extends AppCompatActivity {
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuv700_suv);
        getSupportActionBar().hide();
        btn1= (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heyy();
            }
        });
    }

    private void heyy() {
        Intent intent = new Intent(this,dealerinfo.class);
        startActivity(intent);
    }
}