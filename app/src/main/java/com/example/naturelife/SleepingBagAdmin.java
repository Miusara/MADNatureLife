package com.example.naturelife;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;
public class SleepingBagAdmin extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleeping_bag_admin);
        final EditText edtcodeBag = findViewById(R.id.edtcodeBag);
        final EditText edtpriceBag = findViewById(R.id.edtpriceBag);
        final EditText edtTitleBag = findViewById(R.id.edtTitleBag);
        final EditText edtDesBag = findViewById(R.id.edtDesBag);


        Button btn = findViewById(R.id.btnAddBag);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = edtcodeBag.getText().toString().trim();
                String price = edtpriceBag.getText().toString().trim();
                String title = edtTitleBag.getText().toString().trim();
                String description = edtDesBag.getText().toString().trim();



                DatabaseReference ref = database.getReference("SleepingBag");
                SleepingBag sleepingBag = new SleepingBag(code,price,title,description);
                ref.child(code).setValue(sleepingBag);
                Toast.makeText(SleepingBagAdmin.this,"Created Succussfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}