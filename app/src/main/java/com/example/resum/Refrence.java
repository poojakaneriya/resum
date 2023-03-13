package com.example.resum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Refrence extends AppCompatActivity {

    EditText CompanyName,CompanyLink;
    Button reset,next;
    String comname,comlink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrence);

        CompanyName = findViewById(R.id.name);
        CompanyLink = findViewById(R.id.link);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CompanyName.setText("");
                CompanyLink.setText("");

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                comname = CompanyName.getText().toString();
                comlink = CompanyLink.getText().toString();

                Intent intent = new Intent(Refrence.this,Template.class);
                finish();
                startActivity(intent);
            }
        });

    }
}