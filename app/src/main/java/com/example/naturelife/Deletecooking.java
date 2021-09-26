package com.example.naturelife;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Deletecooking extends AppCompatActivity {

    EditText cookingid;
    Button cookingDelete;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletecooking);
        cookingid = findViewById(R.id.deleteid);
        cookingDelete = findViewById(R.id.btndelete);

        cookingDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String Cookingid = cookingid.getText().toString().trim();
                if (!Cookingid.isEmpty()){

                    deleteData(Cookingid);

                }else{

                    Toast.makeText(Deletecooking.this,"Please Enter DroneID",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void deleteData(String droneid) {

        reference = FirebaseDatabase.getInstance().getReference("drone").child(droneid);
        reference.removeValue();
        Toast.makeText(Deletecooking.this,"Successfully Deleted.",Toast.LENGTH_SHORT).show();

    }
}