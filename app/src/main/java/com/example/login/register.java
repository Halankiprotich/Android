package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class register extends AppCompatActivity {
    EditText RFullname, REmail,RDOB, RPhonenumber, Rpassword;
    Button RRegisterbtn,RLoginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register2);


        RFullname=findViewById(R.id.RFullname);
        REmail=findViewById(R.id.REmail);
        RDOB=findViewById(R.id.RDOB);
        RPhonenumber=findViewById(R.id.RPhonenumber);
        Rpassword=findViewById(R.id.Rpassword);

        RRegisterbtn= findViewById(R.id.RRegisterbtn);
        RLoginbtn=findViewById(R.id.RLoginbtn);

        RLoginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(register.this, MainActivity.class);
                startActivity(i);
            }
        });

        }


    }
