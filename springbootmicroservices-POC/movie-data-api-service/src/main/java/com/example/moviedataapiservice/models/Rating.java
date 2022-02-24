package com.example.moviedataapiservice.models;

public class Rating {

    String userId;
    String movieId;
    String rating;
    public Rating(String userId, String movieId, String rating) {
        this.movieId = movieId;
        this.userId=userId;
        this.rating = rating;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
