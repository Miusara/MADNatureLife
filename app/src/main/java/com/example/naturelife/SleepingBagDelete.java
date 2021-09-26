package com.example.naturelife;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;

import com.google.firebase.database.FirebaseDatabase;

public class SleepingBagDelete extends AppCompatActivity {


    EditText bagcode;

    Button BagDelete;

    DatabaseReference reference;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sleeping_bag_delete);

        bagcode = findViewById(R.id.etDeleteBag);

        BagDelete = findViewById(R.id.btnDeleteBag);


        BagDelete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String Bagcode = bagcode.getText().toString().trim();

                if (!Bagcode.isEmpty()){

                    deleteData(Bagcode);

                }else{

                    Toast.makeText(SleepingBagDelete.this,"Please Enter Bagcode",Toast.LENGTH_SHORT).show();

                }

            }

        });

    }

    private void deleteData(String bagcode) {

        reference = FirebaseDatabase.getInstance().getReference("SleepingBag").child(bagcode);

        reference.removeValue();

        Toast.makeText(SleepingBagDelete.this,"Successfully Deleted.",Toast.LENGTH_SHORT).show();


    }

}