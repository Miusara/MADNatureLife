package com.example.naturelife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OtherAdmine extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final EditText edtcodeOther = findViewById(R.id.edtcodeOther);
        final EditText edtpriceOther = findViewById(R.id.edtpriceOther);
        final EditText edtTitleOther= findViewById(R.id.edtTitleOther);
        final EditText edtDesOther = findViewById(R.id.edtDesOther);



        setContentView(R.layout.activity_other_admine);

        Button btn1 = findViewById(R.id.btnAddOther);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = edtcodeOther.getText().toString().trim();
                String price = edtpriceOther.getText().toString().trim();
                String title = edtTitleOther.getText().toString().trim();
                String description = edtDesOther.getText().toString().trim();

                ref = database.getReference("other");
                Other other = new Other(code,price,title,description);
                ref.child(code).setValue(other);
                Toast.makeText(OtherAdmine.this,"Created Succussfully",Toast.LENGTH_SHORT).show();
            }
        });

        Button btn2 = findViewById(R.id.btnDelectOther);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = edtcodeOther.getText().toString().trim();
                ref.child(code).removeValue();
            }
        });
        Button btn3 = findViewById(R.id.btnUpdateOther);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = edtcodeOther.getText().toString().trim();
                String price = edtpriceOther.getText().toString().trim();
                String title = edtTitleOther.getText().toString().trim();
                String description = edtDesOther.getText().toString().trim();

                ref = database.getReference("user");
                Other updatedOther = new Other(code,price,title,description);
                ref.child(code).setValue(updatedOther);
                Toast.makeText(OtherAdmine.this,"Updated Succussfully",Toast.LENGTH_SHORT).show();

            }
        });
    }
}