package com.example.adminloginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.adminloginscreen.model.Student;
import com.google.firebase.Firebase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

public class StudentsActivity extends AppCompatActivity {
    TextView category;
    FirebaseFirestore db;

    List<Student> students;
    RecyclerView rvStudents;

    @Override
    protected void onStart() {
        super.onStart();
        getStudents();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        db = FirebaseFirestore.getInstance();
        category = findViewById(R.id.category);
        rvStudents = findViewById(R.id.rvStudents);
        Intent intent = getIntent();
        if (intent != null){
            category.setText(intent.getStringExtra("category"));
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvStudents.setLayoutManager(linearLayoutManager);


    }

    private void getStudents(){
        db.collection("students").get().addOnCompleteListener(
                task -> {
                    if (task.isComplete()){
                        ArrayList<Student> students1 = new ArrayList<>();
                        for (QueryDocumentSnapshot documentSnapshot:task.getResult()){
                            Student student = documentSnapshot.toObject(Student.class);
                            students1.add(student);
                        }
                        students = students1;
                        StudentsAdapter studentsAdapter = new StudentsAdapter(students);
                        rvStudents.setAdapter(studentsAdapter);
                    }else {

                    }
                }
        );

    }
}