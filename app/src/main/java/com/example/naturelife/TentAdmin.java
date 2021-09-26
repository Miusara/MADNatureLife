package com.example.naturelife;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class TentAdmin extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tent_admin);
        final EditText edittentcode = findViewById(R.id.edittentcode);
        final EditText itemprize = findViewById(R.id.itemprize);
        final EditText edittitle= findViewById(R.id.edittitle);
        final EditText tentdesription = findViewById(R.id.tentdesription);
        Button btn1 = findViewById(R.id.addButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = edittentcode.getText().toString().trim();
                String price = itemprize.getText().toString().trim();
                String title = edittitle.getText().toString().trim();
                String description = tentdesription.getText().toString().trim();
                ref = database.getReference("tent");
                Tent Tent = new Tent(code,price,title,description);
                ref.child(code).setValue(Tent);
                Toast.makeText(TentAdmin.this,"Created Succussfully",Toast.LENGTH_SHORT).show();
            }
        });

    }
}