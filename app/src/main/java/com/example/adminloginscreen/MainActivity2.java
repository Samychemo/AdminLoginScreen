package com.example.adminloginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button passed, failedAll, failedOneOrMore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        passed = findViewById(R.id.btnPassed);
        failedAll = findViewById(R.id.btnFailed);
        failedOneOrMore = findViewById(R.id.btnFailedOneOrMore);

        passed.setOnClickListener(
                v -> {
                    navigateToStudentsScreen("passed");
                }
        );

        failedAll.setOnClickListener(
                v -> {
                    navigateToStudentsScreen("failedAll");
                }
        );
        failedOneOrMore.setOnClickListener(
                v -> {
                    navigateToStudentsScreen("failedOneOrMore");
                }
        );
    }

    void navigateToStudentsScreen(String category) {
        Intent intent = new Intent(MainActivity2.this, StudentsActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}