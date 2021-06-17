package com.example.assignment.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.assignment.ui.main.PostAdapter;
import android.os.Bundle;
import com.example.assignment.R;
import com.example.assignment.ui.main.PostViewModel;




public class MainActivity extends AppCompatActivity {

    PostViewModel postViewModel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postViewModel = new ViewModelProvider(this).get(PostViewModel.class);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        PostAdapter postAdapter = new PostAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(postAdapter);
    }
}