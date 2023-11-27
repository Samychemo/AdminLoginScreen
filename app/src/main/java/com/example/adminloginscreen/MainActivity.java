package com.example.adminloginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;
    TextView signupText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);


    loginButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (username.getText().toString().equals("Admin") && password.getText().toString().equals("1234") ){
                Toast.makeText(MainActivity.this,"Login Succesful!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }else {
                Toast.makeText(MainActivity.this,"Login failed!",Toast.LENGTH_SHORT).show();
            }
        }
    });

    }
}