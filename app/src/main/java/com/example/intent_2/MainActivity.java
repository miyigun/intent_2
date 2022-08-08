package com.example.intent_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText uName, uPassword;
    Button btn;
    RadioGroup radioGroup;
    String userName,userPassword,userGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        define();
        click();

    }

    private void define() {
        uName =(EditText) findViewById(R.id.editTextUser);
        uPassword =(EditText) findViewById(R.id.editTextPassword);
        btn=(Button) findViewById(R.id.sendButton);
        radioGroup=(RadioGroup) findViewById((R.id.gender));
    }

    public void setValue(){
        userName=uName.getText().toString();
        userPassword=uPassword.getText().toString();
        userGender= ((RadioButton) findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
    }

    public void click(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValue();
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("userName",userName);
                intent.putExtra("userPassword",userPassword);
                intent.putExtra("userGender",userGender);
                startActivity(intent);
            }
        });

    }
}