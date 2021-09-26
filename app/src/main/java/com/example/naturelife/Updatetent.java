package com.example.naturelife;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Updatetent extends AppCompatActivity {

    EditText Tcode;
    EditText price;
    EditText title;
    EditText description;
    Button updateTent;

    public Updatetent(EditText Tcode, EditText price, EditText title, EditText description) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatetent);
        Tcode = findViewById(R.id.updateTC);
        price = findViewById(R.id.updateTP);
        title = findViewById(R.id.updateTT);
        description = findViewById(R.id.updateTD);

        updateTent = findViewById(R.id.updatebtn);
        updateTent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Droneid = Tcode.getText().toString().trim();
                String Dtitle = title.getText().toString().trim();
                String Dprice = price.getText().toString().trim();
                String Ddescription = description.getText().toString().trim();
                new Updatetent(Tcode,title,price,description);
            }
        });
    }
    private void UpdateDrone(String Tcode, String title, String price, String description) {

        HashMap Drone = new HashMap();
        Drone.put("droneid",Tcode);
        Drone.put("title",title);
        Drone.put("droneid",Tcode);
        Drone.put("droneid",Tcode);

        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("drone").child(Tcode);
        Toast.makeText(Updatetent.this,"Successfully Updated.",Toast.LENGTH_SHORT).show();
    }
}