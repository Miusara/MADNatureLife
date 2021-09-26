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
public class ad_cookingitem extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_cookingitem);
        final EditText itemcode = findViewById(R.id.itemcode);
        final EditText prize = findViewById(R.id.prize);
        final EditText Title = findViewById(R.id.Title);
        final EditText des= findViewById(R.id.des);

        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Itemcode = itemcode.getText().toString().trim();
                String Prize = prize.getText().toString().trim();
                String title = Title.getText().toString().trim();
                String Description = des.getText().toString().trim();


                DatabaseReference ref = database.getReference("cooking");
                cooking Cooking = new cooking(Itemcode,Prize,title,Description);
                ref.child(Itemcode).setValue(Cooking);
                Toast.makeText(ad_cookingitem.this,"Created Succussfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}