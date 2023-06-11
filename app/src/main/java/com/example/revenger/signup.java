package com.example.revenger;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class signup extends AppCompatActivity {
private TextView tv1;
private  TextView tv2;
private TextView tv3;
private EditText et1;
private  EditText et2;
private  EditText et3;
private  EditText et4;
private EditText et5;
private Button btn1;
EditText pa;
EditText c;
FirebaseAuth fa;
FirebaseFirestore ff;
String userID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        ff=FirebaseFirestore.getInstance();
        fa=FirebaseAuth.getInstance();


        tv3=(TextView) findViewById(R.id.tv3);

         pa=findViewById(R.id.pa);
        et1= findViewById(R.id.et1);
        et2= findViewById(R.id.et2);
        et3= findViewById(R.id.et3);
        btn1= findViewById(R.id.btn1);
        c=findViewById(R.id.c);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname=et1.getText().toString().trim();
                String lname=et2.getText().toString().trim();

                String mailid = et3.getText().toString().trim();
               String passid = pa.getText().toString().trim();
                String conf = c.getText().toString().trim();
               if(!conf.equals(passid)){
                   c.setError("Enter pass correctly");
                   return;
               }

              fa.createUserWithEmailAndPassword(mailid,passid).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                  @Override
                  public void onComplete(@NonNull Task<AuthResult> task) {

                      if(task.isSuccessful()){
                          Toast.makeText(signup.this, "Account created", Toast.LENGTH_SHORT).show();
                          userID=fa.getCurrentUser().getUid();
                            DocumentReference dr= ff.collection("users").document(userID);
                            Map<String,Object> user=new HashMap<>();
                            user.put("firstname",fname);
                          user.put("lastname",lname);
                            user.put("email",mailid);
                            user.put("password",passid);

                            dr.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    Log.d(TAG,"account created"+userID);




                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {

                                }
                            });


                          startActivity(new Intent(getApplicationContext(),MainActivity.class));


                      }
                      else {
                            Toast.makeText(signup.this, "Something error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                  }
              });

            }
        });


    }


}



///userID=fa.getCurrentUser().getUid();
//                            DocumentReference dr= fs.collection("users").document(userID);
//                            Map<String,Object> user=new HashMap<>();
//                            user.put("name",mailid);
//                            user.put("email",passid);
//                            user.put("password",phoneid);
//                            user.put("Mobile",loc);
//                            dr.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
//                                @Override
//                                public void onSuccess(Void unused) {
//
//                                    Log.d(TAG,"account created"+userID);
//
//                                }
//                            }).addOnFailureListener(new OnFailureListener() {
//                                @Override
//                                public void onFailure(@NonNull Exception e) {
//
//                                }
//                            });
//
//
//                            startActivity(new Intent(getApplicationContext(),Home.class));
//
//                        } else {
//                            Toast.makeText(signup.this, "Something error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//
//                    }
//                });