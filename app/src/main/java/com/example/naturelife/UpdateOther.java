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

public class UpdateOther extends AppCompatActivity {

    EditText code;
    EditText price;
    EditText title;
    EditText description;
    Button updateDrone;

    public UpdateOther(EditText droneid, EditText title, EditText price, EditText description) {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_other);
        code = findViewById(R.id.etDroneIDUpdate);
        title = findViewById(R.id.etTitledroneUpdate);
        price = findViewById(R.id.etpricedroneUpdate);
        description = findViewById(R.id.etdesDroneUpdate);


        updateDrone = findViewById(R.id.btnUpdatedrone);
        updateDrone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TCode = code.getText().toString().trim();
                String Tprice = title.getText().toString().trim();
                String Ttitle = price.getText().toString().trim();
                String Tdescription = description.getText().toString().trim();
                new UpdateOther(code,title,price,description); }
        });
    }

    private void UpdateDrone(String droneid, String title, String price, String description) {

        HashMap Other = new HashMap();
        Other.put("code",code);
        Other.put("title",title);
        Other.put("code",code);
        Other.put("code",code);

        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("other").child(droneid);

        Toast.makeText(UpdateOther.this,"Successfully Updated.",Toast.LENGTH_SHORT).show();

    }


}