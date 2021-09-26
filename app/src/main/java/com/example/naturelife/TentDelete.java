package com.example.naturelife;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class TentDelete extends AppCompatActivity {

    EditText Tcode;

    Button tentdelete;

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tent_delete);
        Tcode = findViewById(R.id.tentcode);
        tentdelete = findViewById(R.id.btndelete);
        tentdelete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String TCode = Tcode.getText().toString().trim();

                if (!TCode.isEmpty()){
                    deleteData(TCode);
                }else{
                    Toast.makeText(TentDelete.this,"Please Enter TentCode",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void deleteData(String droneid) {
        reference = FirebaseDatabase.getInstance().getReference("drone").child(droneid);
        reference.removeValue();
        Toast.makeText(TentDelete.this,"Successfully Deleted.",Toast.LENGTH_SHORT).show();
    }
}