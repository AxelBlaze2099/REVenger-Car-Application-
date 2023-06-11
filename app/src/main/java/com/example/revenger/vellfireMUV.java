package com.example.revenger;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.InstanceCountViolation;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class vellfireMUV extends AppCompatActivity {

    private TextView t1, t2, t3, t4, t5, t6, t7;
    private ImageView imageView3;
    private Button button2;

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vellfire_muv);

        t1 = findViewById(R.id.textView13);
        t2 = findViewById(R.id.textView15);
        t3 = findViewById(R.id.textView17);
        t4 = findViewById(R.id.textiew17);
        t5 = findViewById(R.id.extiew17);
        t6 = findViewById(R.id.ttVi17);
        t7 = findViewById(R.id.tV17);
        imageView3 = findViewById(R.id.imageView3);

        reference = FirebaseDatabase.getInstance("https://yooo99-default-rtdb.firebaseio.com/").getReference("Users").child("Toyota Vellfire");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String Price = snapshot.child("Price").getValue().toString();
                String Mileage = snapshot.child("Mileage").getValue().toString();
                String Engine = snapshot.child("Engine").getValue().toString();
                String Safety = snapshot.child("Safety").getValue().toString();
                String FuelType = snapshot.child("Fuel Type").getValue().toString();
                String Transmission = snapshot.child("Transmission").getValue().toString();
                String SeatingCapacity = snapshot.child("Seating Capacity").getValue().toString();


                t1.setText(Price);
                t2.setText(Mileage);
                t3.setText(Engine);
                t4.setText(Safety);
                t5.setText(FuelType);
                t6.setText(Transmission);
                t7.setText(SeatingCapacity);

               // r=snapshot.child("Price").getValue().toString();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hey();
            }
        });

    }

    private void hey() {
        Intent intent = new Intent(this,dealerinfo.class);
        startActivity(intent);




    }
}