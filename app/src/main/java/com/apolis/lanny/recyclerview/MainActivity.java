package com.apolis.lanny.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    List<MyProject> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        myAdapter = new MyAdapter(myList);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);

        addData();
    }

    private void addData() {
        MyProject myProject = new MyProject("FIRST TITLE", "FIRST_GENRE", "1991");
        myList.add(myProject);

        MyProject myProject2 = new MyProject("2 TITLE", "2_GENRE", "1992");
        myList.add(myProject2);

        MyProject myProject3 = new MyProject("3 TITLE", "3_GENRE", "1993");
        myList.add(myProject3);

        MyProject myProject4 = new MyProject("4 TITLE", "4_GENRE", "1994");
        myList.add(myProject4);

        MyProject myProject5 = new MyProject("5 TITLE", "5_GENRE", "1995");
        myList.add(myProject5);

    }
}
