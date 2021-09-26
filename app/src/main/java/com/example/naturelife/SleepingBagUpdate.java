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

public class SleepingBagUpdate extends AppCompatActivity {

    EditText code;
    EditText price;
    EditText title;
    EditText description;
    Button update;

    public SleepingBagUpdate(EditText code, EditText price, EditText title, EditText description) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleeping_bag_update);
        code = findViewById(R.id.etCodeUpdate);
        title = findViewById(R.id.etPriceUpdate);
        price = findViewById(R.id.etTitleUpdate);
        description = findViewById(R.id.etDesUpdate);

        SleepingBagUpdate = findViewById(R.id.btnUpdatedrone);

        SleepingBagUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Sroneid = code.getText().toString().trim();
                String Stitle = price.getText().toString().trim();
                String Sprice = title.getText().toString().trim();
                String Sdescription = description.getText().toString().trim();

                new SleepingBagUpdate(code,title,price,description);

            }

        });
    }

    private void Update(String code, String price, String title, String description) {

        HashMap sleepigbag = new HashMap();
        sleepigbag.put("code",);
        sleepigbag.put("title",title);
        sleepigbag.put("code",code);
        sleepigbag.put("code",code);

        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("sleepingbag").child(code);

        Toast.makeText(SleepingBagUpdate.this,"Successfully Updated.",Toast.LENGTH_SHORT).show();

    }

}