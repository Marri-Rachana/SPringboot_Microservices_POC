package com.example.MovieInfoAPIService.resources;

import com.example.MovieInfoAPIService.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieInfoAPIResources {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId)
    {
        return new Movie("1234","lovestory");
    }
}
