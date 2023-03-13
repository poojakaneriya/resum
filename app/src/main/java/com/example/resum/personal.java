package com.example.resum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class personal extends AppCompatActivity {


    EditText name;
    EditText email;
    EditText phone;
    EditText address;

    String edtname, edtemail, edtphone,edtaddress;
    Button reset, next;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name.setText("");
                email.setText("");
                phone.setText("");
                address.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edtname = name.getText().toString();
                edtemail = email.getText().toString();
                edtphone = phone.getText().toString();
                edtaddress= address.getText().toString();

                Intent intent = new Intent(personal.this,education.class);
                finish();
                startActivity(intent);
            }
        });
    }
}