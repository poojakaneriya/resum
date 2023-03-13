package com.example.resum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Workprofile extends AppCompatActivity {

    EditText GithubLink,LinkedinLink;
    Button reset, next;
    String github,linked;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workprofile);

        GithubLink = findViewById(R.id.Github);
        LinkedinLink = findViewById(R.id.Linkedin);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GithubLink.setText("");
                LinkedinLink.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                github = GithubLink.getText().toString();
                linked = LinkedinLink.getText().toString();

                Intent intent = new Intent(Workprofile.this,Objective.class);
                finish();
                startActivity(intent);
            }
        });
    }
}