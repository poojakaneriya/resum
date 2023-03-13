package com.example.resum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Objective extends AppCompatActivity {

    EditText Objective;
    Button reset,next;
    String object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objective);

        Objective = findViewById(R.id.objective);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Objective.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                object = Objective.getText().toString();

                Intent intent = new Intent(Objective.this,Refrence.class);
                finish();
                startActivity(intent);
            }
        });
    }
}