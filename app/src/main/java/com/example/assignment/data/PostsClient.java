package com.example.assignment.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.assignment.pojo.Data;
import com.example.assignment.data.PostInterface;


public class PostsClient {

    private static final String BASE_URL ="https://demo1585915.mockable.io/";
    private PostInterface postInterface;
    private static PostsClient INSTANCE;



    public  PostsClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        postInterface = retrofit.create(PostInterface.class);

    }

    public static PostsClient getINSTANCE() {
        if (null == INSTANCE){
            INSTANCE = new PostsClient();
        }
        return INSTANCE;
    }

    public Call<List<Data>> getPosts(){
        return postInterface.getPosts(1);
    }
}
