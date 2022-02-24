package com.example.moviecatalogapiservice.models;

public class Movie {
    String userId;
    String movieId;
    String name;
    public  Movie()
    {

    }
    public Movie(String userId, String movieId, String name) {
        this.userId = userId;
        this.movieId = movieId;
        this.name = name;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
