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

public class UpdateCooking extends AppCompatActivity {

    EditText cookingid;
    EditText cookingtitle;
    EditText cookingprice;
    EditText cookingdescription;
    Button updatecooking;

    public UpdateCooking(EditText cookingid, EditText cookingtitle, EditText cookingprice, EditText updatecooking) {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatecooking);
        cookingid = findViewById(R.id.deleteid);
        cookingtitle = findViewById(R.id.updtetitle);
        cookingprice = findViewById(R.id.updateprice);
        cookingdescription = findViewById(R.id.desupdate);


        updatecooking = findViewById(R.id.btnupdate);



        updatecooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String cookingid = cookingid.getText().toString().trim();
                String cookingtitle = cookingtitle.getText().toString().trim();
                String cookingprice = cookingprice.getText().toString().trim();
                String cookingdescription = cookingdescription.getText().toString().trim();

                new updatecooking(cookingid,cookingtitle,cookingprice,cookingdescription);

            }

        });
    }

    private void UpdateDrone(String droneid, String title, String price, String description) {

        HashMap Drone = new HashMap();
        Drone.put("cookingid",cookingid);
        Drone.put("cookingtitle",cookingtitle);
        Drone.put("cookingprice",cookingprice);
        Drone.put("cookingdescription",cookingdescription);



        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("cooking").child(droneid);

        Toast.makeText(updatecooking.this,"Successfully Updated.",Toast.LENGTH_SHORT).show();



    }


}