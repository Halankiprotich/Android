package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    EditText Lemail,Lpassword;
    Button Loginbtn, Registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Lemail= findViewById(R.id.Lemail);
        Lpassword= findViewById(R.id.Lpassword);

        Loginbtn= findViewById(R.id.Loginbtn);
        Registerbtn=  findViewById(R.id.Registerbtn);



        Registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, register.class);
                startActivity(i);

            }
        });

        }
    }