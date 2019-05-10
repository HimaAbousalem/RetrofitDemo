package com.example.retrofitdemo;

import android.app.Application;

import com.example.retrofitdemo.api.RetrofitApi;
import com.example.retrofitdemo.utils.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DemoApp extends Application {

    private RetrofitApi retrofitApi;
    @Override
    public void onCreate() {
        super.onCreate();
        //create instance mn retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.MOVIE_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //n2ol l retrofit t3mal create ll instance bta3 el request bta3na
        retrofitApi = retrofit.create(RetrofitApi.class);
    }
    public RetrofitApi getRetrofitApi(){
        return retrofitApi;
    }
}
