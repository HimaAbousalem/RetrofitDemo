package com.example.retrofitdemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("title")
    @Expose
    private String movieTitle;
    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;
    @SerializedName("poster_path")
    @Expose
    private String moviePoster;
    @SerializedName("backdrop_path")
    @Expose
    private String movieBackdropPath;
    @SerializedName("overview")
    @Expose
    private String movieOverview;
    @SerializedName("release_date")
    @Expose
    private String movieReleaseDate;

    public Movie() {
    }

    public Movie(Long id, String movieTitle, Double voteAverage, String moviePoster, String movieBackdropPath, String movieOverview, String movieReleaseDate) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.voteAverage = voteAverage;
        this.moviePoster = moviePoster;
        this.movieBackdropPath = movieBackdropPath;
        this.movieOverview = movieOverview;
        this.movieReleaseDate = movieReleaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getMovieBackdropPath() {
        return movieBackdropPath;
    }

    public void setMovieBackdropPath(String movieBackdropPath) {
        this.movieBackdropPath = movieBackdropPath;
    }

    public String getMovieOverview() {
        return movieOverview;
    }

    public void setMovieOverview(String movieOverview) {
        this.movieOverview = movieOverview;
    }

    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(String movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }
}
