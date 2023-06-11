package com.example.revenger;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {


    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private EditText et1;
    private EditText et2;
    private Button btn1;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        btn1=findViewById(R.id.btn1);
        mAuth=FirebaseAuth.getInstance();

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,signup.class);
                startActivity(i);

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String email=et1.getText().toString().trim();
                String pass=et2.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    et1.setError("ID is required");
                    return;
                }

                if (TextUtils.isEmpty(pass)) {
                    et2.setError("Password is required");
                    return;
                }

                if (pass.length() < 6) {
                    et2.setError("password must contain minimum 6 character");
                    return;
                }
                mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(MainActivity.this, "Welcome Buddy!!!", Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(getApplicationContext(), dashboard
                                    .class));
                        } else {
                            Toast.makeText(MainActivity.this, "Something error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });




            }
        });




            }
    }


