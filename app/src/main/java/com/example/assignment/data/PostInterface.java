package com.example.assignment.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.assignment.pojo.Data;

public interface PostInterface {

    @GET("api/v1/cars")
    public Call<List<Data>> getPosts(@Query("page") int page);

}
