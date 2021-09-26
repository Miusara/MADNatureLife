package com.example.naturelife;

import


        androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;
public class OtherAdmine extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_admine);
        final EditText edtcodeOther = findViewById(R.id.edtcodeOther);
        final EditText edtpriceOther = findViewById(R.id.edtpriceOther);
        final EditText edtTitleOther= findViewById(R.id.edtTitleOther);
        final EditText edtDesOther = findViewById(R.id.edtDesOther);
        Button btn = findViewById(R.id.btnAddOther);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = edtcodeOther.getText().toString().trim();
                String price = edtpriceOther.getText().toString().trim();
                String title = edtTitleOther.getText().toString().trim();
                String description = edtDesOther.getText().toString().trim();

                DatabaseReference ref = database.getReference("Other");
                Other other = new Other(code,price,title,description);
                ref.child(code).setValue(other);
                Toast.makeText(OtherAdmine.this,"Created Succussfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}