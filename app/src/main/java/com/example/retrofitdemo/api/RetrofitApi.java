package com.example.retrofitdemo.api;

import com.example.retrofitdemo.model.MovieRequest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitApi {
    @GET("top_rated")
    Call<MovieRequest> getPopularMovies(@Query("api_key") String apiKey);

}
