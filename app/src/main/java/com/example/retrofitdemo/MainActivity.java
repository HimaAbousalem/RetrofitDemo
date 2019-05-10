package com.example.retrofitdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.retrofitdemo.api.RetrofitApi;
import com.example.retrofitdemo.model.Movie;
import com.example.retrofitdemo.model.MovieRequest;
import com.example.retrofitdemo.utils.Constants;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView moviesRecycler;
    MoviesAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        Call<MovieRequest> connection =((DemoApp)getApplicationContext()).getRetrofitApi().getPopularMovies(Constants.API_KEY);

        //nst2bl el result ely rg3a mn el function
        connection.enqueue(new Callback<MovieRequest>() {
            @Override
            public void onResponse(Call<MovieRequest> call, Response<MovieRequest> response) {
                //hna bn handle el response ely rag3
                List<Movie> popularMovies = response.body().getMoviesResult();
                if(popularMovies!=null) {
                    adapter = new MoviesAdapter(popularMovies);
                    moviesRecycler.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<MovieRequest> call, Throwable t) {
                //hna lw feh failure byt-handle mn hana
                Log.d("ERROR API", t.getMessage());
            }
        });

    }

    private void initViews() {
        moviesRecycler = findViewById(R.id.movies_recycler);
        moviesRecycler.setLayoutManager(new GridLayoutManager(this,2));
    }
}
//((DemoApp)getApplicationContext()).getRetrofitApi()