package com.example.naturelife;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.Toast;



import androidx.appcompat.app.AppCompatActivity;



import com.google.firebase.database.DatabaseReference;

import com.google.firebase.database.FirebaseDatabase;



public class DelectOther extends AppCompatActivity {



    EditText otCode;

    Button otbutton;

    DatabaseReference reference;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_delect_other);

        otCode= findViewById(R.id.edtdelectO);

        otbutton = findViewById(R.id.btnDelectOther);

        otbutton.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v) {

                String OtCode = otCode.getText().toString().trim();

                if (!OtCode .isEmpty()){

                    deleteData(OtCode );
                }else{

                    Toast.makeText(DelectOther .this,"Please Enter Item Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void deleteData(String otCode) {

        reference = FirebaseDatabase.getInstance().getReference("Other").child(otCode);

        reference.removeValue();

        Toast.makeText(DelectOther.this,"Successfully Deleted.",Toast.LENGTH_SHORT).show();
    }

}