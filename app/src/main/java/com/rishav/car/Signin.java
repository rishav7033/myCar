package com.rishav.car;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Signin extends AppCompatActivity {

    EditText userName,userEmail,userPhone,userDOB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void CreateAccount(View view) {
        userName = findViewById(R.id.nameEdit);
        userEmail = findViewById(R.id.emailEdit);
        userPhone = findViewById(R.id.phoneEdit);
        userDOB = findViewById(R.id.dobEdit);
/*
        String name = userName.getText().toString();
        String phone = userPhone.getText().toString();
        String email = userEmail.getText().toString();
        String DOB = userDOB.getText().toString();*/


        // Store these details in Local Storage
        // --> Code for Storage


        Intent intent = new Intent(this,MainActivity.class);
       /* intent.putExtra("Name",name);
        intent.putExtra("Phone",phone);
        intent.putExtra("Email",email);
        intent.putExtra("DOB",DOB);*/
        startActivity(intent);
    }
}
