package com.example.moviecatalogapiservice.models;

public class Catalogs {

    String name;
    String description;
    String rating;

    public Catalogs(String name,String description,String rating) {
        this.description = description;
        this.name=name;
        this.rating=rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
