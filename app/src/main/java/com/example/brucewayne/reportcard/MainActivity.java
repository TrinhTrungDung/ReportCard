package com.example.brucewayne.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        ArrayList<Grade> grades = new ArrayList<>();

        // initialize 5 students' grades
        grades.add(new Grade("Alice", 80, 60, 76, 86, 54, 95));
        grades.add(new Grade("Bob", 60, 80, 92, 58, 84, 89));
        grades.add(new Grade("Charles", 92, 68, 59, 78, 84, 90));
        grades.add(new Grade("Dean", 91, 88, 86, 91, 70, 68));
        grades.add(new Grade("John", 77, 100, 87, 79, 62, 78));

        GradeAdapter adapter = new GradeAdapter(this, grades);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}