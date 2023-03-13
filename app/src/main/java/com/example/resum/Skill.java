package com.example.resum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Skill extends AppCompatActivity {

    EditText Skill1 , Skill2, Skill3;
    Button next, reset;
    String s1, s2, s3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        Skill1 = findViewById(R.id.Skill1);
        Skill2 = findViewById(R.id.Skill2);
        Skill3 = findViewById(R.id.Skill3);
        next = findViewById(R.id.next);
        reset = findViewById(R.id.reset);

        reset.setOnClickListener(view -> {

            Skill1.setText("");
            Skill2.setText("");
            Skill3.setText("");
        });

        next.setOnClickListener(view -> {

            s1 = Skill1.getText().toString();
            s2 = Skill2.getText().toString();
            s3 = Skill3.getText().toString();

            Intent intent =  new Intent(Skill.this,Workprofile.class);
            finish();
            startActivity(intent);
        });
    }
}