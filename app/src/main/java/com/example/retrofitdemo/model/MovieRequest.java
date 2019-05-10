package com.example.retrofitdemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MovieRequest {
    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("total_results")
    @Expose
    private String totalResult;
    @SerializedName("total_pages")
    @Expose
    private String totalPage;
    @SerializedName("results")
    @Expose
    private ArrayList<Movie> moviesResult;

    public MovieRequest() {
    }

    public MovieRequest(String page, String totalResult, String totalPage, ArrayList<Movie> moviesResult) {
        this.page = page;
        this.totalResult = totalResult;
        this.totalPage = totalPage;
        this.moviesResult = moviesResult;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(String totalResult) {
        this.totalResult = totalResult;
    }

    public String getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(String totalPage) {
        this.totalPage = totalPage;
    }

    public ArrayList<Movie> getMoviesResult() {
        return moviesResult;
    }

    public void setMoviesResult(ArrayList<Movie> moviesResult) {
        this.moviesResult = moviesResult;
    }
}
