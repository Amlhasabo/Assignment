package com.example.assignment.ui.main;

import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.assignment.data.PostsClient;

import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.example.assignment.pojo.Data;


public class PostViewModel extends ViewModel {

    MutableLiveData<List<Data>> PostMutableLiveData = new MutableLiveData<>();


    public void getPosts(){


        PostsClient.getINSTANCE().getPosts().enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                PostMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
            }
        });

    }
}
