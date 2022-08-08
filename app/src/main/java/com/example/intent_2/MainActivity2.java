package com.example.intent_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String uName, uPassword, uGender;
    TextView name,password,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        define();
        getData();

    }

    public void getData() {
        Bundle intent = getIntent().getExtras();
        uName = intent.getString("userName");
        uPassword = intent.getString("userPassword");
        uGender = intent.getString("userGender");

        name.setText(name.getText()+" "+uName);
        password.setText(password.getText()+" "+uPassword);
        gender.setText(gender.getText()+" "+uGender);
    }

    public void define() {
        name = (TextView) findViewById(R.id.name);
        password = (TextView) findViewById((R.id.password));
        gender = (TextView) findViewById(R.id.gender);
    }
}