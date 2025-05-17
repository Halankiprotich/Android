package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class register extends AppCompatActivity {
    EditText RFullname, REmail,RDOB, RPhonenumber, Rpassword;
    Button RRegisterbtn,RLoginbtn;
    TextView  displayreginfo;

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
        displayreginfo=findViewById(R.id.displayreginfo);

        RRegisterbtn= findViewById(R.id.RRegisterbtn);
        RLoginbtn=findViewById(R.id.RLoginbtn);

        RLoginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(register.this, MainActivity.class);
                startActivity(i);
            }
        });
         RRegisterbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String strFullName= RFullname.getText().toString();
                 String strEmail= REmail.getText().toString();
                 String strDOB= RDOB.getText().toString();
                 String strPhoneNumber= RPhonenumber.getText().toString();
                 String strPassword= Rpassword.getText().toString();

                 if (strFullName.isEmpty() && strEmail.isEmpty() && strDOB.isEmpty() && strPhoneNumber.isEmpty() && strPassword.isEmpty()){
                     displayreginfo.setText("All fields required");

                 }else {}
             }
         });

        }


    }
